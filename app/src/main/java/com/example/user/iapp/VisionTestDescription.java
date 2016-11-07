package com.example.user.iapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class VisionTestDescription extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vision_test_description);
    }

    public void onClick_goToVisionTest(View view){
        Intent myIntent = new Intent(this,VisionTestDescription.class);
        startActivity(myIntent);
    }

    public void onClick_goToVisionTest1(View view){
        Intent myIntent = new Intent(this,VisionTest1.class);
        startActivity(myIntent);

    }


}
