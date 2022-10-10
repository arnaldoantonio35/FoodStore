package com.example.foodstore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;

public class TelaInicialActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //getSupportActionBar().hide();
        setContentView(R.layout.activity_tela_inicial);


        ImageButton iniciar = (ImageButton) findViewById(R.id.btnIniciar);
        iniciar.setOnClickListener(new View.OnClickListener() {


            public void onClick(View view) {
                finish();
            }
        });
    }
}