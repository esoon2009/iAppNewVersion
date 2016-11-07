package com.example.user.iapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class VisionTest3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vision_test3);
    }

    public void onClick_goToVisionTest4(View view){
        Intent myIntent = new Intent(this,VisionTest4.class);

        EditText editTextTest3 = (EditText)findViewById(R.id.editVisionTextTest3);

        String myInputText = editTextTest3.getText().toString();

//        Bundle extras = new Bundle();
        Bundle extras = getIntent().getExtras();

        int passedResult3;
        if (myInputText.equals("W")){
            passedResult3 = 1;
        } else {
            passedResult3 = 0;
        }

        System.out.println(passedResult3);
        extras.putInt("editVisionText3",passedResult3);
        myIntent.putExtras(extras);


        startActivity(myIntent);

    }
}
