package com.example.user.iapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class VisionTest9 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vision_test9);
    }

   public void onClick_goToVisionTest10(View view){
        Intent myIntent = new Intent(this,VisionTest10.class);
        EditText editTextTest9 = (EditText)findViewById(R.id.editVisionTextTest9);

        String myInputText = editTextTest9.getText().toString();

//        Bundle extras = new Bundle();
        Bundle extras = getIntent().getExtras();

        int passedResult9;
        if (myInputText.equals("S")){
            passedResult9 = 1;
        } else {
            passedResult9 = 0;
        }

        System.out.println(passedResult9);
        extras.putInt("editVisionText9",passedResult9);
        myIntent.putExtras(extras);


        startActivity(myIntent);

    }
}
