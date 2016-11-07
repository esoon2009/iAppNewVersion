package com.example.user.iapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ColourBlindTest4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colour_blind_test4);
    }

    public void onClick_goToColourBlindTest5(View view){
        Intent myIntent = new Intent(this,ColourBlindTest5.class);
        //startActivity(myIntent);

        EditText editTextTest4 = (EditText)findViewById(R.id.editTextTest4);

        String myInputText = editTextTest4.getText().toString();
        Integer myInputInteger = Integer.parseInt(myInputText);
//        Bundle extras = new Bundle();
        Bundle extras = getIntent().getExtras();

        int passedResult4;
        if (myInputInteger == 2){
            passedResult4 = 1;
        } else {
            passedResult4 = 0;
        }

        System.out.println(passedResult4);
        extras.putInt("editText4",passedResult4);
        myIntent.putExtras(extras);

        startActivity(myIntent);


    }
}
