
package com.fossdevs.my2ndcalci;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       Button button_tweet= (Button) findViewById(R.id.button);
        button_tweet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText a= (EditText) findViewById(R.id.editText);
                String tweet=a.getText().toString();
                TextView T=new TextView(getApplicationContext());
                T.setText(tweet);
                T.setTextSize(16);
                T.setTextColor(Color.parseColor("#000000"));
                T.setGravity(Gravity.LEFT);
                LinearLayout b= (LinearLayout) findViewById(R.id.container);
                b.addView(T);

                a.setText("");


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
