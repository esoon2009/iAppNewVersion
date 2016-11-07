package com.example.user.iapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ColourBlindTest5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colour_blind_test5);
    }

    public void onClick_goToColourBlindTest6(View view){
        Intent myIntent = new Intent(this,ColourBlindTest6.class);
        //startActivity(myIntent);

        EditText editTextTest5 = (EditText)findViewById(R.id.editTextTest5);

        String myInputText = editTextTest5.getText().toString();
        Integer myInputInteger = Integer.parseInt(myInputText);
//        Bundle extras = new Bundle();
        Bundle extras = getIntent().getExtras();

        int passedResult5;
        if (myInputInteger == 5){
            passedResult5 = 1;
        } else {
            passedResult5 = 0;
        }

        System.out.println(passedResult5);
        extras.putInt("editText5",passedResult5);
        myIntent.putExtras(extras);

        startActivity(myIntent);


    }
}
