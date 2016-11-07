package com.example.user.iapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ColourBlindTest6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colour_blind_test6);
    }
    public void onClick_goToColourBlindTestResult(View view){
        Intent myIntent = new Intent(this,ColourBlindTestResult.class);
        //startActivity(myIntent);

        EditText editTextTest6 = (EditText)findViewById(R.id.editTextTest6);

        String myInputText = editTextTest6.getText().toString();
        Integer myInputInteger = Integer.parseInt(myInputText);
//        Bundle extras = new Bundle();

        Bundle extras = getIntent().getExtras();
        int passedResult6;
        if (myInputInteger == 97){
            passedResult6 = 1;
        } else {
            passedResult6 = 0;
        }

        extras.putInt("editText6", passedResult6);
        myIntent.putExtras(extras);

        startActivity(myIntent);

    }
}
