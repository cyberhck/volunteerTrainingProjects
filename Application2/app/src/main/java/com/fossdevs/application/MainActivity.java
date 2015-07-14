package com.fossdevs.application;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
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
        Button button_click = (Button) findViewById(R.id.button);
        button_click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText et= (EditText) findViewById(R.id.editText);
                String tweet=et.getText().toString();
                LayoutInflater layoutInflater= (LayoutInflater) getBaseContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                View addView=layoutInflater.inflate(R.layout.view_text_view,null);

                TextView edit_text=(TextView)addView.findViewById(R.id.textView);
                edit_text.setText(tweet);
                LinearLayout ll= (LinearLayout) findViewById(R.id.container);
                try{
                    if(edit_text.getParent()!=null){
                        ((ViewGroup)edit_text.getParent()).removeView(edit_text);
                    }

                    ll.addView(edit_text);
                    et.setText("");
                }catch(Exception e){
                    Log.d("mytag", e.toString());
                }
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

        return super.onOptionsItemSelected(item);
    }
}
