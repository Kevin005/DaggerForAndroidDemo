package com.example.liuwei01.myapplication.presenter;

import com.example.liuwei01.myapplication.contract.MyVeiw;

import javax.inject.Inject;

/**
 * Created by liuwei01 on 2018/5/2.
 */

public class MainPresenter {
    private MyVeiw view;

    @Inject
    public MainPresenter(MyVeiw view) {
        this.view = view;
    }

    public void login() {
        if (true) {
            view.loginSuccess();
        }
    }

}
