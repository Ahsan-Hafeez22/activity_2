package com.example.myapplication2;

        import androidx.appcompat.app.AppCompatActivity;

        import android.annotation.SuppressLint;
        import android.os.Bundle;
        import android.widget.EditText;
        import android.widget.TextView;
        import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    EditText num;
    Button b;
    TextView res;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init_component();
        settingUpListeners();

    }

    @SuppressLint("SetTextI18n")
    private void settingUpListeners() {
        b.setOnClickListener(view->{
            int number = Integer.parseInt(num.getText().toString());
            int binary = 0;
            int i=0;
            while(number!=0){
                int remainder = number%2;
                binary += remainder*Math.pow(10,i);
                number/=2;

                ++i;
            }
            res.setText("Binary = "+ binary);
        });

    }

    private void init_component() {
        num = findViewById(R.id.input);
        b = findViewById(R.id.btn);
        res = findViewById(R.id.res);
    }
}