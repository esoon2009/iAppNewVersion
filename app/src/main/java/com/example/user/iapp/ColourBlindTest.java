package com.example.user.iapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ColourBlindTest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colour_blind_test);
    }

    public void onClick_goToColourBlindTest(View view){
        Intent myIntent = new Intent(this,ColourBlindTestDescription.class);
        startActivity(myIntent);
    }


    //need to implement five test and then functionality to calculate the score
}
