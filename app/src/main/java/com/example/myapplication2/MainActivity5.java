package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity5 extends AppCompatActivity {
    EditText fnum;
    EditText snum;
    TextView res;
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        init_component();
        settingUpListeners();
    }

    @SuppressLint({"SetTextI18n", "DefaultLocale"})
    private void settingUpListeners() {
        btn1.setOnClickListener(view -> {
            double first = Double.parseDouble(fnum.getText().toString());
            double second = Double.parseDouble(snum.getText().toString());
            double third = first + second;
            res.setText("After Plus : " + String.format("%.1f", third));
        });
        btn2.setOnClickListener(view -> {
            double first = Double.parseDouble(fnum.getText().toString());
            double second = Double.parseDouble(snum.getText().toString());
            double third = first * second;
            res.setText("After Multiply : " + String.format("%.1f", third));
        });
        btn3.setOnClickListener(view -> {
            double first = Double.parseDouble(fnum.getText().toString());
            double second = Double.parseDouble(snum.getText().toString());
            double third = first - second;
            res.setText("After Subtraction : " + String.format("%.1f", third));
        });
        btn4.setOnClickListener(view -> {
            double first = Double.parseDouble(fnum.getText().toString());
            double second = Double.parseDouble(snum.getText().toString());
            double third = first / second;
            res.setText("After Division : " + String.format("%.1f", third));
        });
        btn5.setOnClickListener(view -> {
            double first = Double.parseDouble(fnum.getText().toString());
            double second = Double.parseDouble(snum.getText().toString());
            double third = first % second;
            res.setText("Remainder : " + String.format("%.1f", third));
        });
    }

    private void init_component() {
        fnum = findViewById(R.id.input1);
        snum = findViewById(R.id.input2);
        res = findViewById(R.id.res);
        btn1 = findViewById(R.id.plus);
        btn2 = findViewById(R.id.multiply);
        btn3 = findViewById(R.id.subtract);
        btn4 = findViewById(R.id.divide);
        btn5 = findViewById(R.id.mode);
    }
}