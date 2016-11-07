package com.example.user.iapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class VisionTest5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vision_test5);
    }

    public void onClick_goToVisionTest6(View view){
        Intent myIntent = new Intent(this,VisionTest6.class);
        EditText editTextTest5 = (EditText)findViewById(R.id.editVisionTextTest5);

        String myInputText = editTextTest5.getText().toString();

//        Bundle extras = new Bundle();
        Bundle extras = getIntent().getExtras();

        int passedResult5;
        if (myInputText.equals("R")){
            passedResult5 = 1;
        } else {
            passedResult5 = 0;
        }

        System.out.println(passedResult5);
        extras.putInt("editVisionText5",passedResult5);
        myIntent.putExtras(extras);


        startActivity(myIntent);

    }
}
