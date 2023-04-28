package com.example.appandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    final String TAG = "MainActivity2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //Intent intent= getIntent();
        TextView text = findViewById(R.id.textView2);
        Bundle bundle = getIntent().getExtras(); //contenitore dei dati che l'intent si è trasportato nella seconda activity

        //int numero = bundle.getInt("numero");
        String N= bundle.getString("Numero");
        //Log.d(TAG,"Numero Passato:"+ numero);//messaggio per vedere se è corretto(debug)
        text.setText(N);


        //text.setText(intent.getStringExtra("nome")+" "+intent.getIntExtra("eta", 0));
    }
}