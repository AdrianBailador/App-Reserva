package com.example.oscar.llega_y_zampa;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.R.*;

/**
 * Bailador Panero, Adrián
 * Vázquez Blanco, Óscar
 */


public class PrincipalFragment extends Fragment {

    Button btnIniciarSesion;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View view = inflater.inflate(R.layout.fragment_principal, container, false);
        ImageButton lapiz=(ImageButton)view.findViewById(R.id.notas);
        lapiz.setVisibility(View.INVISIBLE);
        if(Global.log.equals("1")){
            lapiz.setVisibility(View.VISIBLE);
        }

        btnIniciarSesion = (Button) view.findViewById(R.id.home);

        // Comprobamos si hay sesion iniciada con la variable global log
        // Para no mostrar el boton de iniciar sesion
        if(Global.log.equals("1")) {
            // Hay sesion iniciada
            btnIniciarSesion.setVisibility(View.INVISIBLE);
        } else {
            // No hay sesion iniciada
            btnIniciarSesion.setVisibility(View.VISIBLE);
        }

        view.findViewById(R.id.hora13).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Global.ivar1 = "1";
                Intent i = new Intent(getActivity(), Categorias.class);
                startActivity(i);
            }
        });

        view.findViewById(R.id.hora14).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Global.ivar1 = "2";
                Intent i = new Intent(getActivity(), Categorias.class);
                startActivity(i);
            }
        });

        view.findViewById(R.id.hora15).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Global.ivar1 = "3";
                Intent i = new Intent(getActivity(), Categorias.class);
                startActivity(i);
            }
        });

        view.findViewById(R.id.hora21).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Global.ivar1 = "4";
                Intent i = new Intent(getActivity(), Categorias.class);
                startActivity(i);
            }
        });

        view.findViewById(R.id.hora22).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Global.ivar1 = "5";
                Intent i = new Intent(getActivity(), Categorias.class);
                startActivity(i);
            }
        });

        view.findViewById(R.id.hora23).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Global.ivar1 = "6";
                Intent i = new Intent(getActivity(), Categorias.class);
                startActivity(i);
            }
        });

        view.findViewById(R.id.home).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().startActivity(new Intent(getActivity(), Administrador.class));
            }
        });

        view.findViewById(R.id.notas).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().startActivity(new Intent(getActivity(), Notas.class));
            }
        });

        return view;
    }

}