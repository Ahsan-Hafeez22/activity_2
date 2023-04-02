package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    EditText num;
    Button btn;
    TextView res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        init_component();
        settingUpListeners();
        }

    @SuppressLint({"DefaultLocale", "SetTextI18n"})
    private void settingUpListeners() {
        btn.setOnClickListener(view -> {
            double number = Double.parseDouble(num.getText().toString());
            double feet = 0.0328 * number;
            res.setText("Feet : " + String.format("%.2f", feet));

        });
    }

    private void init_component() {
        num = findViewById(R.id.input);
        btn = findViewById(R.id.btn);
        res = findViewById(R.id.res);
    }
}