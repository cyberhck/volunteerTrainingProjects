package com.fossdevs.intents;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class Login extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Button button_enter = (Button) findViewById(R.id.button2);
        button_enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               EditText usernm= (EditText) findViewById(R.id.username);
               EditText psswd= (EditText) findViewById(R.id.password);
               String u= usernm.getText().toString();
               String p=psswd.getText().toString();
                if (u.equals("kamath")&&p.equals("123")){
                    Intent world= new Intent(getApplicationContext(),World.class);
                    EditText address= (EditText) findViewById(R.id.address);
                    String addr=address.getText().toString();
                    Bundle b=new Bundle();
                    b.putString("address",addr);
                    b.putString("username",u);
                    world.putExtras(b);
                    startActivity(world);

                }else {
                    Toast.makeText(getApplicationContext(),"user id n pssword is wrong",Toast.LENGTH_LONG).show();
                }

            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_login, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
