package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {
    TextView resultText;
    ImageView resultImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Intent intent = getIntent();
        resultText = findViewById(R.id.resultText);
        resultText.setText(intent.getStringExtra("brend"));

        resultImage = findViewById(R.id.resultImage);

        if (intent.getStringExtra("brend").equals(getString(R.string.samsumg_text))) {
            resultImage.setImageResource(R.drawable.samsung);
        } else if (intent.getStringExtra("brend").equals(getString(R.string.apple_text))) {
            resultImage.setImageResource(R.drawable.apple);
        } else if (intent.getStringExtra("brend").equals(getString(R.string.xiomi_text))) {
            resultImage.setImageResource(R.drawable.xiomi);
        } else if (intent.getStringExtra("brend").equals(getString(R.string.nokia_text))) {
            resultImage.setImageResource(R.drawable.nokia);
        } else if (intent.getStringExtra("brend").equals(getString(R.string.sony_text))) {
            resultImage.setImageResource(R.drawable.sony);
        } else if (intent.getStringExtra("brend").equals(getString(R.string.motorola_text))) {
            resultImage.setImageResource(R.drawable.motorola);
        } else if (intent.getStringExtra("brend").equals(getString(R.string.lenovo_text))) {
            resultImage.setImageResource(R.drawable.lenovo);
        } else if (intent.getStringExtra("brend").equals(getString(R.string.huawei_text))) {
            resultImage.setImageResource(R.drawable.huawei);
        } else {
            resultImage.setImageResource(R.drawable.lg);
        }

    }

    public void onClickNextActivity(View view) {
        Intent intent = new Intent(this, MaketRed.class);
        startActivity(intent);
    }

    public void onClickMorningActivity(View view) {
        Intent intent = new Intent(this, MorningActivity.class);
        startActivity(intent);
    }
    public void onClickHumansActivity(View view) {
        Intent intent = new Intent(this, HumansList.class);
        startActivity(intent);
    }

    public void onClickFreelancerActivity(View view) {
        Intent intent = new Intent(this, Freelancer.class);
        startActivity(intent);
    }
}




