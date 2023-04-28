package com.example.appandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {
    TextView testo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        testo=findViewById(R.id.TestoCanzone);
        testo.setText(leggiFile("Stars", getApplicationContext()));
    }

    private int leggiFile(String stars, Context applicationContext) {
    }
}