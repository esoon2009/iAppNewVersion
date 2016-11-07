package com.example.user.iapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class ColourBlindTestResult extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colour_blind_test_result);

        Bundle extras = getIntent().getExtras();
        int enterNumber1 = extras.getInt("editText1", 0);
        int enterNumber2 = extras.getInt("editText2", 0);
        int enterNumber3 = extras.getInt("editText3", 0);
        int enterNumber4 = extras.getInt("editText4", 0);
        int enterNumber5 = extras.getInt("editText5", 0);
        int enterNumber6 = extras.getInt("editText6", 0);

        int result = enterNumber1 + enterNumber2 + enterNumber3 + enterNumber4 + enterNumber5 + enterNumber6;

        if (result == 6) {
            //Toast.makeText(this, "See your nearest optometrist " + enterNumber1 + " " + enterNumber2 + " "+ enterNumber3, Toast.LENGTH_LONG).show();


            Intent myIntent = new Intent(this, ColourBlindTestPassed.class);
            startActivity(myIntent);
        } else if (result == 5 || result == 6) {
            // low risk
            System.out.println("Low Risk");
            //Toast.makeText(this, "You do not have colour blindness! :) " + result, Toast.LENGTH_LONG).show();
            Intent myIntent = new Intent(this, ColourBlindTestLowRisk.class);
            startActivity(myIntent);

        } else if (result == 3 || result == 4) {
            //medium risk
            Intent myIntent = new Intent(this, ColourBlindTestMediumRisk.class);
            startActivity(myIntent);
            System.out.println("Medium Risk");
        } else if (result < 3) {
            //high risk
            Intent myIntent = new Intent(this, ColourBlindTestFailed.class);
            startActivity(myIntent);


        }


    }
}
