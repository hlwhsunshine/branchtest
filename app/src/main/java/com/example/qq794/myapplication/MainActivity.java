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
        //这是分支1
        //这于master分支创建
        //这是分支2
        //这是远程分支创建
        //分支1提交
        //分支1加入的内容
    }
}
