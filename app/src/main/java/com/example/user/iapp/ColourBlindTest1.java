package com.example.user.iapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class ColourBlindTest1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colour_blind_test1);
    }

    public void onClick_goToColourBlindTest2(View view){

        Intent myIntent = new Intent(this,ColourBlindTest2.class);

        EditText editTextTest1 = (EditText)findViewById(R.id.editTextTest1);

        String myInputText = editTextTest1.getText().toString();
        Integer myInputInteger = Integer.parseInt(myInputText);
        Bundle extras = new Bundle();


        int passedResult1;
        if (myInputInteger == 16){
            passedResult1 = 1;
        } else {
            passedResult1 = 0;
        }


        extras.putInt("editText1", passedResult1);
        myIntent.putExtras(extras);

        startActivity(myIntent);





    }






}
