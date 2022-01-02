package com.example.unitconversion1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        name = findViewById(R.id.name);
        Intent intent = getIntent();
        String valueinfeet = intent.getStringExtra("name_key");
        double feet = Double.parseDouble( valueinfeet);
        double meter = feet / 3.281;
        name.setText(""+meter);
    }
}