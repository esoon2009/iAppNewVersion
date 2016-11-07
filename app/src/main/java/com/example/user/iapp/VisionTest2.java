package com.example.user.iapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class VisionTest2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vision_test2);
    }
    public void onClick_goToVisionTest3(View view){
        Intent myIntent = new Intent(this,VisionTest3.class);
        EditText editTextTest2 = (EditText)findViewById(R.id.editVisionTextTest2);

        String myInputText = editTextTest2.getText().toString();

//        Bundle extras = new Bundle();
        Bundle extras = getIntent().getExtras();

        int passedResult2;
        if (myInputText.equals("V")){
            passedResult2 = 1;
        } else {
            passedResult2 = 0;
        }

        System.out.println(passedResult2);
        extras.putInt("editVisionText2",passedResult2);
        myIntent.putExtras(extras);



        startActivity(myIntent);

    }

}
