 package com.example.user.iapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ColourBlindTest3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colour_blind_test3);
    }
    public void onClick_goToColourBlindTest4(View view){
        Intent myIntent = new Intent(this,ColourBlindTest4.class);
        //
        // startActivity(myIntent);

        EditText editTextTest3 = (EditText)findViewById(R.id.editTextTest3);

        String myInputText = editTextTest3.getText().toString();
        Integer myInputInteger = Integer.parseInt(myInputText);
//        Bundle extras = new Bundle();
        Bundle extras = getIntent().getExtras();

        int passedResult3;
        if (myInputInteger == 42){
            passedResult3 = 1;
        } else {
            passedResult3 = 0;
        }

        System.out.println(passedResult3);
        extras.putInt("editText3",passedResult3);
        myIntent.putExtras(extras);

        startActivity(myIntent);


    }

}
