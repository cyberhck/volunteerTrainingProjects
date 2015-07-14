package com.fossdevs.aaa;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button_ping = (Button) findViewById(R.id.button);
        button_ping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText s= (EditText) findViewById(R.id.editText);
                String tweet=s.getText().toString();
                LayoutInflater layoutInflater= (LayoutInflater) getBaseContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                View c=layoutInflater.inflate(R.layout.view_ping,null);
                TextView tv= (TextView) c.findViewById(R.id.textView);
                if(tv.getParent()!=null){
                    ((ViewGroup)tv.getParent()).removeView(tv);
                }
                tv.setText(tweet);
                LinearLayout l= (LinearLayout) findViewById(R.id.container);
                l.addView(tv);
                EditText s1= (EditText) findViewById(R.id.editText);
                Log.d("mytag",s1.getText().toString());
                s.setText("");

            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
        if(id==R.id.action_login){
            Intent login=new Intent(getApplicationContext(),Login.class);
            startActivity(login);
        }

        return super.onOptionsItemSelected(item);
    }
}
