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

public class register extends AppCompatActivity {

    EditText editText,editText2,editText4,editText5,editText6,editText7;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        getSupportActionBar().setTitle("Registration");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        editText=(EditText)findViewById(R.id.editText);
        editText2=(EditText)findViewById(R.id.editText2);
        editText4=(EditText)findViewById(R.id.editText4);
        editText5=(EditText)findViewById(R.id.editText5);
        editText6=(EditText)findViewById(R.id.editText6);
        editText7=(EditText)findViewById(R.id.editText7);
        button=(Button)findViewById(R.id.button);


    }

    public void login(View view){
        if(validate()){
        Intent log=new Intent(this,login.class);
        startActivity(log);}
    }
    public boolean validate(){
        boolean result1=false;
        if(TextUtils.isEmpty(editText.getText().toString()) || !Patterns.EMAIL_ADDRESS.matcher(editText.getText().toString()).matches()){
            editText.setError("Enter valid Email Id");
            result1=false;
        }
        else{
            editText.setError(null);
            result1=true;
        }
        if(TextUtils.isEmpty(editText2.getText().toString())){
            editText2.setError("Enter your Name");
            result1=false;
        }
        else {
            editText2.setError(null);
            result1 = true;
        }
        if(TextUtils.isEmpty(editText4.getText().toString())|| !Patterns.PHONE.matcher(editText4.getText().toString()).matches()){
            editText4.setError("Enter a valid number");
            result1=false;
        }
        else{
            editText4.setError(null);
            result1=true;
        }
        if(TextUtils.isEmpty(editText5.getText().toString())){
            editText5.setError("Enter your Address");
            result1=false;
        }
        else{
            editText5.setError(null);
            result1=true;
        }
        if(TextUtils.isEmpty(editText6.getText().toString())||(editText6.getText().toString().length()<8 && (editText6.getText().toString().length()>10))){
            editText6.setError("Password Must be 8 to 10 Characters");
            result1=false;
        }
        else{
            editText6.setError(null);
            result1=true;
        }
        if(TextUtils.isEmpty(editText7.getText().toString())||(editText7.getText().toString()).equals(editText6.getText().toString())){
            editText7.setError("Password Does not match");
            result1=false;
        }
        else{
            editText7.setError(null);
            result1=true;
        }
        return result1;



    }
}
