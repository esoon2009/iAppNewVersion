package com.example.user.iapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class VisionTest4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vision_test4);
    }

    public void onClick_goToVisionTest5(View view){
        Intent myIntent = new Intent(this,VisionTest5.class);
        EditText editTextTest4 = (EditText)findViewById(R.id.editVisionTextTest4);

        String myInputText = editTextTest4.getText().toString();

//        Bundle extras = new Bundle();
        Bundle extras = getIntent().getExtras();

        int passedResult4;
        if (myInputText.equals("U")){
            passedResult4 = 1;
        } else {
            passedResult4 = 0;
        }

        System.out.println(passedResult4);
        extras.putInt("editVisionText4",passedResult4);
        myIntent.putExtras(extras);



        startActivity(myIntent);

    }
}
