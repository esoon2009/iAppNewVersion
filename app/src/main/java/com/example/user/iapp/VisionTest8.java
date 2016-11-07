package com.example.user.iapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class VisionTest8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vision_test8);
    }
    public void onClick_goToVisionTest9(View view){
        Intent myIntent = new Intent(this,VisionTest9.class);
        EditText editTextTest8 = (EditText)findViewById(R.id.editVisionTextTest8);

        String myInputText = editTextTest8.getText().toString();

//        Bundle extras = new Bundle();
        Bundle extras = getIntent().getExtras();

        int passedResult8;
        if (myInputText.equals("P")){
            passedResult8 = 1;
        } else {
            passedResult8 = 0;
        }

        System.out.println(passedResult8);
        extras.putInt("editVisionText8",passedResult8);
        myIntent.putExtras(extras);


        startActivity(myIntent);

    }

}
