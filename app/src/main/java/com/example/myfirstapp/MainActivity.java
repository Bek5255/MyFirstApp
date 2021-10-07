package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageButton samsung;
    ImageButton apple;
    ImageButton xiomi;
    ImageButton nokia;
    ImageButton sony;
    ImageButton motorola;
    ImageButton lenovo;
    ImageButton huawei;
    ImageButton lg;
    String brend;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        samsung = (ImageButton) findViewById(R.id.samsung);
        apple = (ImageButton) findViewById(R.id.apple);
        xiomi = (ImageButton) findViewById(R.id.xiomi);
        nokia = (ImageButton) findViewById(R.id.nokia);
        sony = (ImageButton) findViewById(R.id.sony);
        motorola = (ImageButton) findViewById(R.id.motorola);
        lenovo = (ImageButton) findViewById(R.id.lenovo);
        huawei = (ImageButton) findViewById(R.id.huawei);
        lg = (ImageButton) findViewById(R.id.lg);

        samsung.setOnClickListener(this);
        apple.setOnClickListener(this);
        xiomi.setOnClickListener(this);
        nokia.setOnClickListener(this);
        sony.setOnClickListener(this);
        motorola.setOnClickListener(this);
        lenovo.setOnClickListener(this);
        huawei.setOnClickListener(this);
        lg.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.samsung:
                brend = getString(R.string.samsumg_text);
                break;
            case R.id.apple:
                brend = getString(R.string.apple_text);
                break;
            case R.id.xiomi:
                brend = getString(R.string.xiomi_text);
                break;
            case R.id.nokia:
                brend = getString(R.string.nokia_text);
                break;
            case R.id.sony:
                brend = getString(R.string.sony_text);
                break;
            case R.id.motorola:
                brend = getString(R.string.motorola_text);
                break;
            case R.id.lenovo:
                brend = getString(R.string.lenovo_text);
                break;
            case R.id.huawei:
                brend = getString(R.string.huawei_text);
                break;
            case R.id.lg:
                brend = getString(R.string.lg_text);
                break;

        }
        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("brend", brend);
        startActivity(intent);
    }
}