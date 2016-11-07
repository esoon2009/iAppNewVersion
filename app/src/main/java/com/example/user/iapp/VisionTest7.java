package com.example.user.iapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class VisionTest7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vision_test7);
    }

    public void onClick_goToVisionTest8(View view){
        Intent myIntent = new Intent(this,VisionTest8.class);
        EditText editTextTest7 = (EditText)findViewById(R.id.editVisionTextTest7);

        String myInputText = editTextTest7.getText().toString();

//        Bundle extras = new Bundle();
        Bundle extras = getIntent().getExtras();

        int passedResult7;
        if (myInputText.equals("H")){
            passedResult7 = 1;
        } else {
            passedResult7 = 0;
        }

        System.out.println(passedResult7);
        extras.putInt("editVisionText7",passedResult7);
        myIntent.putExtras(extras);


        startActivity(myIntent);

    }


}
