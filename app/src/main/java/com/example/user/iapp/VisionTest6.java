package com.example.user.iapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class VisionTest6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vision_test6);
    }

    public void onClick_goToVisionTest7(View view){
        Intent myIntent = new Intent(this,VisionTest7.class);
        EditText editTextTest6 = (EditText)findViewById(R.id.editVisionTextTest6);

        String myInputText = editTextTest6.getText().toString();

//        Bundle extras = new Bundle();
        Bundle extras = getIntent().getExtras();

        int passedResult6;
        if (myInputText.equals("X")){
            passedResult6 = 1;
        } else {
            passedResult6 = 0;
        }

        System.out.println(passedResult6);
        extras.putInt("editVisionText6",passedResult6);
        myIntent.putExtras(extras);


        startActivity(myIntent);

    }


}
