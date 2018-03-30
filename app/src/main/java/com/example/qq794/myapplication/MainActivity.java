package com.example.qq794.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private CircleBar circleBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        circleBar = findViewById(R.id.cb);
        circleBar.setDesText("进度");
        circleBar.setText("9");
        circleBar.setSweepAngle(100);
        //new 分支
    }
}
