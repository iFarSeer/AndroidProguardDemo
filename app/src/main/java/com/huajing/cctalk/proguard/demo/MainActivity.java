package com.huajing.cctalk.proguard.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CCProguardTest1 test1 = new CCProguardTest1();
        test1.method1();
        test1.metthod2("222");

        MainFragment mainFragment = new MainFragment();
    }
}
