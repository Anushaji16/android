package com.example.simplecalculator;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText n1, n2;
    Button sum, sub, mul, div;
    TextView rslt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        n1 = (EditText) findViewById(R.id.editTextText);
        n2 = (EditText) findViewById(R.id.editTextText2);
        sum = findViewById(R.id.button);
        mul = findViewById(R.id.button2);
        div = findViewById(R.id.button3);
        sub = findViewById(R.id.button4);
        rslt = findViewById(R.id.textView3);

        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int f1 = Integer.parseInt(n1.getText().toString());
                int f2 = Integer.parseInt(n2.getText().toString());
                int cal = f1 + f2;
                rslt.setText("Addition = " + cal);
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int f1 = Integer.parseInt(n1.getText().toString());
                int f2 = Integer.parseInt(n2.getText().toString());
                int cal = f1 - f2;
                rslt.setText("Subtraction = " + cal);

                div.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int f1 = Integer.parseInt(n1.getText().toString());
                        int f2 = Integer.parseInt(n2.getText().toString());
                        int cal = f1 / f2;
                        rslt.setText("Division= " + cal);
                    }
                });

                mul.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int f1 = Integer.parseInt(n1.getText().toString());
                        int f2 = Integer.parseInt(n2.getText().toString());
                        int cal = f1 * f2;
                        rslt.setText("Multiplication= " + cal);
                    }
                });
            }
        });
    }
}
