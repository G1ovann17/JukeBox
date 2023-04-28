package com.example.appandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    TextView titolo;
    ImageView immagine;
    Button bottone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        titolo = findViewById(R.id.TitoloCanzone);
        immagine = findViewById(R.id.ImmagineCanzone);
        bottone = findViewById(R.id.BottoneCanzone);
        immagine.setImageResource(R.drawable.StarsImmagine);




    }
}