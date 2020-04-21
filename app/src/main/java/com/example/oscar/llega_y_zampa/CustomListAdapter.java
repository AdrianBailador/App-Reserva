package com.example.oscar.llega_y_zampa;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Bailador Panero, Adrián
 * Vázquez Blanco, Óscar
 */

public class CustomListAdapter extends ArrayAdapter<String> {


    private final Activity context;
    private final String[] item_name;
    private final String[] item_desc;
    private final String[] item_precio;
    private final Integer[] item_id;


    public CustomListAdapter(Activity context, String[] item_name, String[] item_desc, String[] item_precio, Integer[] item_id) {
        super(context, R.layout.listamenu, item_name);
        this.context = context;
        this.item_desc = item_desc;
        this.item_name = item_name;
        this.item_precio = item_precio;
        this.item_id = item_id;


    }


    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.listamenu, null, true);


        TextView txtitem = (TextView) rowView.findViewById(R.id.item);
        TextView txtdesc = (TextView) rowView.findViewById(R.id.itemdesc);
        TextView txtprecio = (TextView) rowView.findViewById(R.id.itempre);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);



        txtitem.setText(item_name[position]);
        txtdesc.setText(item_desc[position]);
        txtprecio.setText(item_precio[position]);
        imageView.setImageResource(item_id[position]);




        return rowView;


    }


}