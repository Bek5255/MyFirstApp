package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ImageView resultImage;
    TextView resultText;
    ImageButton samsung;
    ImageButton apple;
    ImageButton xiomi;
    ImageButton nokia;
    ImageButton sony;
    ImageButton motorola;
    ImageButton lenovo;
    ImageButton huawei;
    ImageButton lg;


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

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()){
                    case R.id.samsung:
                        resultImage.setImageResource(R.drawable.samsung);
                        resultText.setText(R.string.samsumg_text);
                        break;

                    case R.id.apple:
                        resultImage.setImageResource(R.drawable.apple);
                        resultText.setText(R.string.apple_text);
                        break;

                    case R.id.nokia:
                        resultImage.setImageResource(R.drawable.nokia);
                        resultText.setText(R.string.nokia_text);
                        break;

                    case R.id.xiomi:
                        resultImage.setImageResource(R.drawable.xiomi);
                        resultText.setText(R.string.xiomi_text);
                        break;

                    case R.id.sony:
                        resultImage.setImageResource(R.drawable.sony);
                        resultText.setText(R.string.sony_text);
                        break;

                    case R.id.motorola:
                        resultImage.setImageResource(R.drawable.motorola);
                        resultText.setText(R.string.motorola_text);
                        break;

                    case R.id.lenovo:
                        resultImage.setImageResource(R.drawable.lenovo);
                        resultText.setText(R.string.lenovo_text);
                        break;
                }
            }
        };

        samsung.setOnClickListener(onClickListener);
        apple.setOnClickListener(onClickListener);
        xiomi.setOnClickListener(onClickListener);
        nokia.setOnClickListener(onClickListener);
        sony.setOnClickListener(onClickListener);
        motorola.setOnClickListener(onClickListener);
        lenovo.setOnClickListener(onClickListener);
        huawei.setOnClickListener(onClickListener);
        lg.setOnClickListener(onClickListener);

    }

}