package com.example.appandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnavvia = findViewById(R.id.Bt);
        Button button = (Button) findViewById(R.id.Bt);
        EditText text = (EditText) findViewById(R.id.Textname);

        button.setOnClickListener(new View.OnClickListener() {
            @Override            public void onClick(View view) {

                //text.setText("Ciao "+text.getText());

                //Intent intent = new Intent(getApplicationContext(),MainActivity2.class);
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("Numero",text.getText().toString());//numero scelto su activity 2

                //intent.putExtra("Numero ", 10);//numero scelto
                //aggiungi intent con numero generato random
            startActivity(intent);
            }
        });
    }
}