package com.example.user.iapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ColourBlindTestDescription extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colour_blind_test_description);
    }

   public void onClick_colourBlindTest1(View view){
        Intent myIntent = new Intent(this,ColourBlindTest1.class);
        startActivity(myIntent);

    }



}
