package com.example.databasefinal;

import android.content.ContentValues;
import android.content.Context;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


import java.util.ArrayList;


public class AdminSQLite extends SQLiteOpenHelper {


    public AdminSQLite(Context context, String name, SQLiteDatabase.CursorFactory factory, int version){
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase BaseDeDatos) {

        BaseDeDatos.execSQL("CREATE TABLE planets(name text primary key, gravity int)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }


    public ArrayList insertarPlanetas(SQLiteDatabase baseDeDatos){
        Planet planeta;
        ArrayList<Planet> listaPlanetas = new ArrayList<Planet>();

        planeta = new Planet();
        planeta.setName("Mercurio");
        planeta.setGravity(53453);
        listaPlanetas.add(planeta);

        planeta = new Planet();
        planeta.setName("Venus");
        planeta.setGravity(2345);
        listaPlanetas.add(planeta);

        planeta = new Planet();
        planeta.setName("Tierra");
        planeta.setGravity(633);
        listaPlanetas.add(planeta);

        planeta = new Planet();
        planeta.setName("Marte");
        planeta.setGravity(34632);
        listaPlanetas.add(planeta);

        planeta = new Planet();
        planeta.setName("Jupiter");
        planeta.setGravity(63643);
        listaPlanetas.add(planeta);

        planeta = new Planet();
        planeta.setName("Saturno");
        planeta.setGravity(86865);
        listaPlanetas.add(planeta);

        planeta = new Planet();
        planeta.setName("Urano");
        planeta.setGravity(5674);
        listaPlanetas.add(planeta);

        planeta = new Planet();
        planeta.setName("Neptuno");
        planeta.setGravity(3457);
        listaPlanetas.add(planeta);

        planeta = new Planet();
        planeta.setName("Mercurio");
        planeta.setGravity(53453);
        listaPlanetas.add(planeta);

        planeta = new Planet();
        planeta.setName("Venus");
        planeta.setGravity(2345);
        listaPlanetas.add(planeta);

        planeta = new Planet();
        planeta.setName("Tierra");
        planeta.setGravity(633);
        listaPlanetas.add(planeta);

        planeta = new Planet();
        planeta.setName("Marte");
        planeta.setGravity(34632);
        listaPlanetas.add(planeta);

        planeta = new Planet();
        planeta.setName("Jupiter");
        planeta.setGravity(63643);
        listaPlanetas.add(planeta);

        planeta = new Planet();
        planeta.setName("Saturno");
        planeta.setGravity(86865);
        listaPlanetas.add(planeta);

        planeta = new Planet();
        planeta.setName("Urano");
        planeta.setGravity(5674);
        listaPlanetas.add(planeta);

        planeta = new Planet();
        planeta.setName("Neptuno");
        planeta.setGravity(3457);
        listaPlanetas.add(planeta);

        String nombre;
        int gravity;

        for(int i = 0; i < listaPlanetas.size(); i++){
            ContentValues registro = new ContentValues();

            nombre = listaPlanetas.get(i).getName();
            gravity = listaPlanetas.get(i).getGravity();

            registro.put("name", nombre);
            registro.put("gravity", gravity);

            baseDeDatos.insert("planets", null, registro);

        }

        baseDeDatos.close();
        return listaPlanetas;
    }


    public String[] conseguirPlanetas(SQLiteDatabase baseDeDatos){
        String a[] = new String[2];

        Cursor fila = baseDeDatos.rawQuery("select name, gravity from planets", null);

        if(fila.moveToFirst()){
            a[0] = fila.getString(0);
            a[1] = fila.getString(1);
            baseDeDatos.close();
        }else{

        }

        baseDeDatos.close();

        return a;

    }





}
