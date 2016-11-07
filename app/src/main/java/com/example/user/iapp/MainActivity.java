package com.example.user.iapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public TextView mBatteryLevelText;
    public ProgressBar mBatteryLevelProgress;
    public BroadcastReceiver mReceiver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mBatteryLevelText = (TextView) findViewById(R.id.textView);
        mBatteryLevelProgress = (ProgressBar) findViewById(R.id.progressBar);
        mReceiver = new MyBroadcastReceiver();
    }

    @Override
    public void onStart() {
        registerReceiver(mReceiver, new IntentFilter(Intent.ACTION_BATTERY_CHANGED));
        super.onStart();
    }
    @Override
    public void onStop() {
        unregisterReceiver(mReceiver);
        super.onStop();
    }

    private class MyBroadcastReceiver extends BroadcastReceiver {
        @Override
        public void onReceive(Context context, Intent intent) {
            int level = intent.getIntExtra(BatteryManager.EXTRA_LEVEL, 0);
            mBatteryLevelText.setText(getString(R.string.battery_level) + " " + level);
            mBatteryLevelProgress.setProgress(level);
        }
    }

    public void onClick_goToVisionTest(View view){
        Intent myIntent = new Intent(this,VisionTestDescription.class);
        startActivity(myIntent);

    }

    public void onClick_ColourBlindTest(View view){
        Intent myIntent = new Intent(this,ColourBlindTestDescription.class);
        startActivity(myIntent);

    }

    public void onClick_goToPerspectiveColourBlindTest(View view){
        Intent myIntent = new Intent(this,PerspectiveColourBlindTest.class);
        startActivity(myIntent);

    }

    protected void onClick_goToMyBattery(View view){
        Intent myIntent = new Intent(this,MyBattery.class);
        startActivity(myIntent);

    }


}
