package com.zhaoyang.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.tencent.mmkv.MMKV;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       MMKV.defaultMMKV().clearAll();
    }
}