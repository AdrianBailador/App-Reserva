package com.example.oscar.llega_y_zampa;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

/**
 * Bailador Panero, Adrián
 * Vázquez Blanco, Óscar
 */


public class Notas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notas);
        findViewById(R.id.pedido1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Notas.this, Pedido.class);
                String eso = "1";
                i.putExtra("eso", eso);
                startActivity(i);
            }
        });
        findViewById(R.id.pedido2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Notas.this, Pedido.class);
                String eso = "2";
                i.putExtra("eso", eso);
                startActivity(i);
            }
        });
        findViewById(R.id.pedido3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Notas.this, Pedido.class);
                String eso = "3";
                i.putExtra("eso", eso);
                startActivity(i);
            }
        });
        findViewById(R.id.pedido4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Notas.this, Pedido.class);
                String eso = "4";
                i.putExtra("eso", eso);
                startActivity(i);
            }
        });
        findViewById(R.id.pedido5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Notas.this, Pedido.class);
                String eso = "5";
                i.putExtra("eso", eso);
                startActivity(i);
            }
        });
        findViewById(R.id.imageButton6).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Notas.this.startActivity(new Intent(Notas.this, Principal.class));
            }
        });


    }
    public void bloq(View v){
        Global.log="0";
        Toast.makeText(this, "Sesion Cerrada", Toast.LENGTH_SHORT).show();
        Intent i=new Intent(Notas.this, Principal.class);
        startActivity(i);
    }

}
