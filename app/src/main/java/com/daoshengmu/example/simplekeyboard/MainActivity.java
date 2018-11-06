package com.daoshengmu.example.simplekeyboard;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    private TextView text2;
    private SimpleIME ime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        ime = new SimpleIME();
        text2 = (TextView) findViewById(R.id.text_view_id);


        text2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Text2 was clicked",
                        Toast.LENGTH_LONG).show();
                text2.setText("Visit us: http://examples.javacodegeeks.com");

                if(text2.getLinksClickable() == true) {
                    text2.setLinkTextColor(Color.BLUE);
                }
            }

        });
    }


}