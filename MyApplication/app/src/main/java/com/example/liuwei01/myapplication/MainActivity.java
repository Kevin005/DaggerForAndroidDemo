package com.example.liuwei01.myapplication;

import android.app.Application;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.liuwei01.myapplication.component.DaggerAppComponent;
import com.example.liuwei01.myapplication.contract.MyVeiw;
import com.example.liuwei01.myapplication.module.AppModule;
import com.example.liuwei01.myapplication.presenter.MainPresenter;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    @Inject MainPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText etSpPx = (EditText) findViewById(R.id.et_sp_px);
        final TextView tvSpPx = (TextView) findViewById(R.id.tv_sp_px);
        Button btSpPx = (Button) findViewById(R.id.bt_sp_px);

        DaggerAppComponent.builder()
                .appModule(new AppModule(new MyVeiw() {
                    @Override
                    public String get() {
                        return "123445";
                    }

                    @Override
                    public void loginSuccess() {
                        //start intent
                        Toast.makeText(MainActivity.this, "success success success", Toast.LENGTH_LONG).show();
                    }
                }))
                .build()
                .inject(this);
        init();
    }

    private void init() {
        presenter.login();
    }

}
