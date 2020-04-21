package com.example.oscar.llega_y_zampa;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

/**
 * Bailador Panero, Adrián
 * Vázquez Blanco, Óscar
 */

public class RegistroSms extends AppCompatActivity {
    Integer code=0;
    Integer code2=0;
    Integer code3=0;
    EditText user, pass,num, cod;
    TextView txtc;
    int cont=0;

    Button btnRegistrarse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_sms);

        user = (EditText) findViewById(R.id.Usreg);
        pass = (EditText) findViewById(R.id.Pwreg);
        btnRegistrarse = (Button) findViewById(R.id.check);

    }


    public void enviar(View v){
        //int code=0;
        //cont=cont+1;
        //String numero ="0990715764" ;
        //String codigo;

        //final Random rand = new Random();
        //code= rand.nextInt(8888);

        //codigo=("El codigo es: "+code);

        //SmsManager smsManager = SmsManager.getDefault();
        //smsManager.sendTextMessage(numero, null, codigo, null, null);



        //cod.setVisibility(View.VISIBLE);
        //txtc.setVisibility(View.VISIBLE);
        //btni.setVisibility(View.VISIBLE);


    }


    public void registrar(View v) {
        AdminSQLiteOpenHelper guarda = new AdminSQLiteOpenHelper(this, "usuario", null, 1);
        SQLiteDatabase base = guarda.getWritableDatabase();

        String iid = user.getText().toString();
        String ides = pass.getText().toString();
        //String codigo = cod.getText().toString();
        //code2 = Integer.parseInt(codigo);

        //es una clase para guardar dat
        ContentValues grabar_usuario =new ContentValues();
        grabar_usuario.put("username",iid);
        grabar_usuario.put("password",ides);

        base.insert("usuario",null,grabar_usuario);
        base.close();
        Toast.makeText(this, "Registrado", Toast.LENGTH_SHORT).show();
        Intent i =new Intent(RegistroSms.this, Administrador.class);
        startActivity(i);


    }




}
