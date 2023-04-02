package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {
    EditText num;
    Button btn;
    TextView res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        init_component();
        settingUpListeners();
    }

    @SuppressLint({"SetTextI18n", "DefaultLocale"})
    private void settingUpListeners() {
        btn.setOnClickListener(view -> {
            double celsius = Double.parseDouble(num.getText().toString());
            double fahrenheit= (celsius*1.8)+32;
            res.setText("Temperature in Fahrenheit : " + String.format("%.2f", fahrenheit));
        });
    }

    private void init_component() {
        num = findViewById(R.id.input);
        btn = findViewById(R.id.btn);
        res = findViewById(R.id.res);
    }
}