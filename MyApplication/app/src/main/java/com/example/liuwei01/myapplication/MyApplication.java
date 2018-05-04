package com.example.liuwei01.myapplication;

import android.app.Application;
import android.widget.Toast;

import com.example.liuwei01.myapplication.component.DaggerAppComponent;
import com.example.liuwei01.myapplication.contract.MyVeiw;
import com.example.liuwei01.myapplication.module.AppModule;

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

    }

    public void showToast() {
        Toast.makeText(this, "", Toast.LENGTH_LONG).show();
    }
}
