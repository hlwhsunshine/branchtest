package com.example.sunshine.name;

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
        //
        //这是分支1
        //这于master分支创建
        //这是分支2
        //这是远程分支创建
        //分支1提交
        //远程分支2加入的内容
        //这是kuai

    }
}