package com.example.user.iapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ColourBlindTest2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colour_blind_test2);




    }

    public void onClick_goToColourBlindTest3(View view){

        Intent myIntent = new Intent(this,ColourBlindTest3.class);
        startActivity(myIntent);

        EditText editTextTest2 = (EditText)findViewById(R.id.editTextTest2);

        String myInputText = editTextTest2.getText().toString();
        Integer myInputInteger = Integer.parseInt(myInputText);
//        Bundle extras = new Bundle();
        Bundle extras = getIntent().getExtras();

        int passedResult2;
        if (myInputInteger == 5){
            passedResult2 = 1;
        } else {
            passedResult2 = 0;
        }

        System.out.println(passedResult2);
        extras.putInt("editText2",passedResult2);
        myIntent.putExtras(extras);

        startActivity(myIntent);

    }
}
