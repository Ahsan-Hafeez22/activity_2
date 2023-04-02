package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    EditText num;
    Button btn;
    TextView res100;
    TextView res50;
    TextView res10;
    TextView res5;
    TextView res2;
    TextView res1;
    TextView res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        init_component();
        settingUpListeners();
    }
    @SuppressLint("SetTextI18n")
    private void settingUpListeners() {
        btn.setOnClickListener(view -> {
            int amt = Integer.parseInt(num.getText().toString());
            int n100, n50, n10, n5, n2, n1;
            n100 = n50 = n10 = n5 = n2 = n1 = 0;

            if(amt >= 100)
                n100 = amt/100;
            amt -= n100 * 100;
            if(amt >= 50)
                n50 = amt/50;
            amt -= n50 * 50;
            if(amt >= 10)
                n10 = amt/10;
            amt -= n10 * 10;
            if(amt >= 5)
                n5 = amt/5;
            amt -= n5 * 5;
            if(amt >= 2)
                n2 = amt /2;
            amt -= n2 * 2;
            if(amt >= 1)
                n1 = amt;

            int n = n100 + n50 + n10 + n5 + n2 + n1;

            res100.setText("Total Number Of 100 Rupees Notes : " + n100 );
            res50.setText("Total Number Of 50 Rupees Notes : " + n50 );
            res10.setText("Total Number Of 10 Rupees Notes : " + n10 );
            res5.setText("Total Number Of 5 Rupees Notes : " + n5 );
            res2.setText("Total Number Of 2 Rupees Notes : " + n2 );
            res1.setText("Total Number Of 1 Rupees Notes : " + n1 );
            res.setText("Total Number of Notes : " + n );


        });
    }

    private void init_component() {
        num = findViewById(R.id.input);
        btn = findViewById(R.id.btn);
        res100 = findViewById(R.id.r100);
        res50 = findViewById(R.id.r50);
        res10 = findViewById(R.id.r10);
        res5 = findViewById(R.id.r5);
        res2 = findViewById(R.id.r2);
        res1 = findViewById(R.id.r1);
        res = findViewById(R.id.r);
    }
}