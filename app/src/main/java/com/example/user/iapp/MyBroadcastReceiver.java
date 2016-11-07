package com.example.user.iapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MyBroadcastReceiver extends BroadcastReceiver {

    private final static String BATTERY_LEVEL = "level";
    public TextView mBatteryLevelText;
    public ProgressBar mBatteryLevelProgress;
    public BroadcastReceiver mReceiver;

    @Override
    public void onReceive(Context context, Intent intent) {
        int level = intent.getIntExtra(BATTERY_LEVEL, 0);
        //String levelToString = String.valueOf(level);


        mBatteryLevelText.setText("My Battery Level is" + " " + level);
        mBatteryLevelProgress.setProgress(level);
    }
}
