package com.example.sonyshah.olavakkola;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class splashscreen extends AppCompatActivity {
    private static int SPLASH_TIME_OUT=3000;    //3sec


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);



        //requestwindowFeature(Window.FEATURE_NO_TITLE);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent splashIntent=new Intent(splashscreen.this,navi.class);
                startActivity(splashIntent);
                finish();

            }
        },SPLASH_TIME_OUT);
    }
}
