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

public class Categorias extends AppCompatActivity {

    String pedidos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categorias);

        findViewById(R.id.porciones).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Categorias.this.startActivity(new Intent(Categorias.this, Porciones.class));
            }
        });
        findViewById(R.id.baquita).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Categorias.this.startActivity(new Intent(Categorias.this, Parrillada.class));
            }
        });

        findViewById(R.id.atras).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Categorias.this.startActivity(new Intent(Categorias.this, Principal.class));
            }
        });

        findViewById(R.id.jugo).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Categorias.this.startActivity(new Intent(Categorias.this, Bebidas.class));
            }
        });
        findViewById(R.id.cangrejo).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Categorias.this.startActivity(new Intent(Categorias.this, Mariscos.class));
            }
        });
    }

    public String  pedido() {
        String  ped=pedidos;
        return ped;
    }
}
