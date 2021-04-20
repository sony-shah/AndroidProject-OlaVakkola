package com.example.sonyshah.olavakkola;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class login extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().setTitle("Login");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
    public void regis(View view){

        Intent i=new Intent(this,register.class);
        startActivity(i);
    }
    public void home(View view){

        Intent fl=new Intent(this,navi.class);
        startActivity(fl);
    }

}
