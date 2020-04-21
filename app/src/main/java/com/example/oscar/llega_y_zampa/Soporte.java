package com.example.oscar.llega_y_zampa;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Bailador Panero, Adrián
 * Vázquez Blanco, Óscar
 */

public class Soporte extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soporte);
        findViewById(R.id.imageButton12).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Soporte.this.startActivity(new Intent(Soporte.this, Principal.class));
            }
        });

    }
}