package com.example.sonyshah.olavakkola;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class feedback extends AppCompatActivity {
    EditText et8, et11, et12, et13;
    Button btn3;
    TextView txt3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);
        getSupportActionBar().setTitle("Feedback");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        et8 = (EditText) findViewById(R.id.editText8);
        et11 = (EditText) findViewById(R.id.editText11);
        et12 = (EditText) findViewById(R.id.editText12);
        et13 = (EditText) findViewById(R.id.editText13);
        btn3 = (Button) findViewById(R.id.button3);

    }

    public void sub(View view) {
        if (TextUtils.isEmpty(et8.getText().toString())) {
            et8.setError("Enter the Name");

        }
        if (TextUtils.isEmpty(et11.getText().toString()) || !Patterns.PHONE.matcher(et11.getText().toString()).matches()) {
            et11.setError("Enter a valid number");

        }
        if (TextUtils.isEmpty(et12.getText().toString())) {
            et12.setError("Enter Must Subject");
        }
        if (TextUtils.isEmpty(et13.getText().toString())) {
            et13.setError("Enter must your Message");

        }
       else{
            txt3.setEnabled(true);
            String s="Thank you for your valuable Feedback";
            txt3.setText(s);
            txt3.setTextSize(22);

        }


    }
}
