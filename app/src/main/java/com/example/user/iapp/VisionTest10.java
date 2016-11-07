package com.example.user.iapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class VisionTest10 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vision_test10);
    }

    public void onClick_goToVisionTestResult(View view) {
        Intent myIntent = new Intent(this, VisionTestResult.class);
        EditText editTextTest10 = (EditText) findViewById(R.id.editVisionTextTest10);

        String myInputText = editTextTest10.getText().toString();

//       Bundle extras = new Bundle();
        Bundle extras = getIntent().getExtras();

        int passedResult10;
        if (myInputText.equals("F")) {
            passedResult10 = 1;
        } else {
            passedResult10 = 0;
        }

        System.out.println(passedResult10);
        extras.putInt("editVisionText10", passedResult10);
        myIntent.putExtras(extras);


        startActivity(myIntent);


    }
}