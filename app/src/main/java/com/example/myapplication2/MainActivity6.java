package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.lang.Math;


public class MainActivity6 extends AppCompatActivity {
    EditText f_num;
    EditText s_num;
    TextView res;
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;
    Button btn8;
    Button btn9;
    Button btn10;
    Button btn11;
    Button btn12;
    Button btn13;
    Button btn14;
    Button btn15;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        init_components();
        settingUpListeners();
    }

    @SuppressLint({"DefaultLocale", "SetTextI18n"})
    private void settingUpListeners() {
        btn1.setOnClickListener(view->{
            double first = Double.parseDouble(f_num.getText().toString());
            double second = Double.parseDouble(s_num.getText().toString());
            double third;
            third = first + second;
            res.setText("" + String.format("%.1f", third));
        });
        btn2.setOnClickListener(view->{
            double first = Double.parseDouble(f_num.getText().toString());
            double second = Double.parseDouble(s_num.getText().toString());
            double third;
            third = first - second;
            res.setText("" + String.format("%.1f", third));
        });
        btn3.setOnClickListener(view->{
            double first = Double.parseDouble(f_num.getText().toString());
            double second = Double.parseDouble(s_num.getText().toString());
            double third;
            third = first * second;
            res.setText("" + String.format("%.1f", third));
        });
        btn4.setOnClickListener(view->{
            double first = Double.parseDouble(f_num.getText().toString());
            double second = Double.parseDouble(s_num.getText().toString());
            double third;
            third = first / second;
            res.setText("" + String.format("%.1f", third));
        });
        btn5.setOnClickListener(view->{
            double first = Double.parseDouble(f_num.getText().toString());
            double sine = Math.sin(first);
            res.setText("" + String.format("%.2f", sine));
        });
        btn6.setOnClickListener(view->{
            double first = Double.parseDouble(f_num.getText().toString());
            double cos = Math.cos(first);
            res.setText("" + String.format("%.2f", cos));
        });
        btn7.setOnClickListener(view->{
            double first = Double.parseDouble(f_num.getText().toString());
            double tan = Math.tan(first);
            res.setText("" + String.format("%.2f", tan));
        });
        btn8.setOnClickListener(view->{
            double first = Double.parseDouble(f_num.getText().toString());
            double second = Double.parseDouble(s_num.getText().toString());
            double pow = Math.pow(first,second);
            res.setText("" + String.format("%.2f", pow));
        });
        btn9.setOnClickListener(view->{
            double first = Double.parseDouble(f_num.getText().toString());
            double log = Math.log(first);
            res.setText("" + String.format("%.2f", log));
        });
        btn10.setOnClickListener(view->{
            double first = Double.parseDouble(f_num.getText().toString());
            double log10 = Math.log10(first);
            res.setText("" + String.format("%.2f", log10));
        });
        btn11.setOnClickListener(view->{
            double first = Double.parseDouble(f_num.getText().toString());
            double ceiling = Math.ceil(first);
            res.setText("" + String.format("%.2f", ceiling));
        });
        btn12.setOnClickListener(view->{
            double first = Double.parseDouble(f_num.getText().toString());
            double floor = Math.floor(first);
            res.setText("" + String.format("%.2f", floor));
        });
        btn13.setOnClickListener(view->{
            double first = Double.parseDouble(f_num.getText().toString());
            double sqr = Math.sqrt(first);
            res.setText("" + String.format("%.2f", sqr));
        });
        btn14.setOnClickListener(view->{
            double first = Double.parseDouble(f_num.getText().toString());
            float r = Math.round(first);
            res.setText("" + String.format("%.2f", r));
        });
        btn15.setOnClickListener(view->{
            double first = Double.parseDouble(f_num.getText().toString());
            double expo = Math.exp(first);
            res.setText("" + String.format("%.2f", expo));
        });

    }

    private void init_components() {
        f_num = findViewById(R.id.input1);
        s_num = findViewById(R.id.input2);
        res = findViewById(R.id.result);
        btn1 = findViewById(R.id.plus);
        btn2 = findViewById(R.id.minus);
        btn3 = findViewById(R.id.multi);
        btn4 = findViewById(R.id.div);
        btn5 = findViewById(R.id.sin);
        btn6 = findViewById(R.id.cos);
        btn7 = findViewById(R.id.tan);
        btn8 = findViewById(R.id.power);
        btn9 = findViewById(R.id.log);
        btn10 = findViewById(R.id.log10);
        btn11 = findViewById(R.id.ceiling);
        btn12 = findViewById(R.id.floor);
        btn13 = findViewById(R.id.sqrroot);
        btn14 = findViewById(R.id.round);
        btn15 = findViewById(R.id.expo);
    }
}