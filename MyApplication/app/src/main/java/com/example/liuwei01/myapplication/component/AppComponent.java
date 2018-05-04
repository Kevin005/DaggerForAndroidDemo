package com.example.liuwei01.myapplication.component;

import com.example.liuwei01.myapplication.MainActivity;
import com.example.liuwei01.myapplication.MyApplication;
import com.example.liuwei01.myapplication.module.AppModule;

import dagger.Component;

@Component(modules = {AppModule.class})
public interface AppComponent {
    void inject(MainActivity activity);
}
