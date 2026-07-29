package com.example.registration;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity{

    TextView txtWelcome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        txtWelcome = findViewById(R.id.textView3);
        String name = getIntent().getStringExtra("username");
        txtWelcome.setText("welcome" + name);
    }
}
