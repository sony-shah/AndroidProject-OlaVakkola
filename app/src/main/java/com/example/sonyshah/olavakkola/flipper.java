package com.example.sonyshah.olavakkola;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class flipper extends AppCompatActivity {

    //flipper
    ViewFlipper v_flipper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flipper);
        getSupportActionBar().setTitle("Home");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        //for flipper slide
        v_flipper = (ViewFlipper) this.findViewById(R.id.v_flipper);
        int images[] = {R.drawable.background, R.drawable.bighearts, R.drawable.slide2, R.drawable.conference};

        for (int image : images) {
            flipperImages(image);

        }
    }

    //for flipper
    public void flipperImages(int image) {
        ImageView iv = new ImageView(this);
        iv.setBackgroundResource(image);
        v_flipper.addView(iv);
        v_flipper.setFlipInterval(2000); // 2sec
        v_flipper.setAutoStart(true);
        v_flipper.setInAnimation(this,android.R.anim.slide_in_left);
        v_flipper.setOutAnimation(this,android.R.anim.slide_out_right);
    }
}

