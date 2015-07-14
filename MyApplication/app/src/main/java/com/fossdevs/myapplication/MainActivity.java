package com.fossdevs.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button_add= (Button) findViewById(R.id.button);
        Button button_sub= (Button)findViewById(R.id.button2);
        Button button_mul= (Button)findViewById(R.id.button3);
        Button button_div= (Button)findViewById(R.id.button4);
        button_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText num1= (EditText) findViewById(R.id.editText);
                EditText num2= (EditText) findViewById(R.id.editText2);
                String n1=num1.getText().toString();
                String  n2=num2.getText().toString();
                int a=Integer.parseInt(n1);
                int b=Integer.parseInt(n2);
                int result=a+b;
                String s=Integer.toString(result);
                EditText r= (EditText) findViewById(R.id.editText3);
                r.setText(s);
            }
        });
        button_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText num1= (EditText) findViewById(R.id.editText);
                EditText num2= (EditText) findViewById(R.id.editText2);
                String n1=num1.getText().toString();
                String  n2=num2.getText().toString();
                int a=Integer.parseInt(n1);
                int b=Integer.parseInt(n2);
                int result=a-b;
                String s=Integer.toString(result);
                EditText r= (EditText) findViewById(R.id.editText3);
                r.setText(s);

            }
        });
        button_mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText num1= (EditText) findViewById(R.id.editText);
                EditText num2= (EditText) findViewById(R.id.editText2);
                String n1=num1.getText().toString();
                String  n2=num2.getText().toString();
                int a=Integer.parseInt(n1);
                int b=Integer.parseInt(n2);
                int result=a*b;
                String s=Integer.toString(result);
                EditText r= (EditText) findViewById(R.id.editText3);
                r.setText(s);

            }
        });
        button_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText num1= (EditText) findViewById(R.id.editText);
                EditText num2= (EditText) findViewById(R.id.editText2);
                String n1=num1.getText().toString();
                String  n2=num2.getText().toString();
                int a=Integer.parseInt(n1);
                int b=Integer.parseInt(n2);
                int result=a/b;
                String s=Integer.toString(result);
                EditText r= (EditText) findViewById(R.id.editText3);
                r.setText(s);

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
        // Handle action bar item clicks here. The a=ction bar will
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
