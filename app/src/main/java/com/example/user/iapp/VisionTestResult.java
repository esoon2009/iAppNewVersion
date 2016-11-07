package com.example.user.iapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class VisionTestResult extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vision_test_result);

        Bundle extras = getIntent().getExtras();
        int enterNumber1 = extras.getInt("editVisionText1", 0);
        int enterNumber2 = extras.getInt("editVisionText2",0);
        int enterNumber3 = extras.getInt("editVisionText3",0);
        int enterNumber4 = extras.getInt("editVisionText4",0);
        int enterNumber5 = extras.getInt("editVisionText5",0);
        int enterNumber6 = extras.getInt("editVisionText6",0);
        int enterNumber7 = extras.getInt("editVisionText7",0);
        int enterNumber8 = extras.getInt("editVisionText8",0);
        int enterNumber9 = extras.getInt("editVisionText9",0);
        int enterNumber10 = extras.getInt("editVisionText10",0);


        int result = enterNumber1 + enterNumber2 + enterNumber3 + enterNumber4 +enterNumber5 +enterNumber6 +enterNumber7 +enterNumber8+enterNumber9+enterNumber10;


        TextView resultTextView = (TextView)findViewById(R.id.visionResult);
        resultTextView.setText(String.valueOf(result));



        /*if (result < 10) {
            //Toast.makeText(this, "See your nearest optometrist " + enterNumber1 + " " + enterNumber2 + " "+ enterNumber3+" " + enterNumber4 + " " + enterNumber5 , Toast.LENGTH_LONG).show();
            Intent myIntent = new Intent(this,VisionTestFailed.class);
            startActivity(myIntent);
        }
        else {

            //Toast.makeText(this, "You do not have colour blindness! :) " + result, Toast.LENGTH_LONG).show();
            Intent myIntent = new Intent(this,VisionTestPassed.class);
            startActivity(myIntent);

        }*/


    }
    protected void onClick_goToFindNearestOptometrist(View view) {
        Intent myIntent = new Intent(this, NearestOptometrist.class);
        startActivity(myIntent);


    }








}
