package com.example.oscar.llega_y_zampa;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.R.*;

/**
 * Bailador Panero, Adrián
 * Vázquez Blanco, Óscar
 */


public class Principal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.principal);

        // Comprobar si la actividad ha sido creada con anterioridad
        if(savedInstanceState == null) {
            // Crear un fragment
            PrincipalFragment fragment = new PrincipalFragment();
            getFragmentManager()
                    .beginTransaction()
                    .add(android.R.id.content, fragment, fragment.getClass().getSimpleName())
                    .commit();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()) {
            case R.id.action_soporte:
                startActivity(new Intent(this, Soporte.class));
                return true;

            case R.id.cerrar_sesion:
                Global.log = "0";
                startActivity(new Intent(this, Principal.class));
                return true;

            default:
                return false;
        }
    }
}