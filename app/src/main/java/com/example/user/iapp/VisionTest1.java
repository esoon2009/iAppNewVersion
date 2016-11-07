package com.example.user.iapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class VisionTest1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vision_test1);
    }
    public void onClick_goToVisionTest2(View view){
        Intent myIntent = new Intent(this,VisionTest2.class);

        EditText editTextTest1 = (EditText)findViewById(R.id.editVisionTextTest1);

        String myInputText = editTextTest1.getText().toString();

        Bundle extras = new Bundle();


        int passedResult1;
        if (myInputText.equals("K")){
            passedResult1 = 1;
        } else {
            passedResult1 = 0;
        }


        extras.putInt("editVisionText1", passedResult1);
        myIntent.putExtras(extras);

        startActivity(myIntent);

    }

}
