package com.example.liuwei01.myapplication.module;

import android.app.Application;

import com.example.liuwei01.myapplication.contract.MyVeiw;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {
    private MyVeiw view;

    public AppModule(MyVeiw view) {
        this.view = view;
    }

    @Provides
    public MyVeiw provideApplication() {
        return view;
    }
}
