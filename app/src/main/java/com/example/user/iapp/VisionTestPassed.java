package com.example.user.iapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class VisionTestPassed extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vision_test_passed);
    }

    protected void onClick_goToHome(View view){
        Intent myIntent = new Intent(this,MainActivity.class);
        startActivity(myIntent);
    }
}
