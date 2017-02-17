package com.ganji.android.proguard;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        KeepClassEntry proguardEntry = new KeepClassEntry();
        proguardEntry.name = "falsdj";
        proguardEntry.num = 1;
        String name = proguardEntry.getName();
        int num = proguardEntry.getNum();
        boolean entry = proguardEntry.isEntry();
        String desc = proguardEntry.findDesc();

    }
}
