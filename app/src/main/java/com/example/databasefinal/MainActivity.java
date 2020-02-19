package com.example.databasefinal;


import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.LinkedList;


public class MainActivity extends AppCompatActivity {

    private RecyclerView.LayoutManager layoutManager;
    private LinkedList <String> mWorldLinked = new LinkedList<String>();
    ArrayList<Planet> listaPlanetas = new ArrayList<Planet>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        insertarElementos();
        RecyclerView mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview);

        for(int i = 0; i < listaPlanetas.size(); i++){
            this.mWorldLinked.add(listaPlanetas.get(i).getName());
        }

        RecyclerView.Adapter mAdapter = new WordListAdapter(this, mWorldLinked);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

    public void insertarElementos(){

        AdminSQLite admin = new AdminSQLite(this, "administracion", null, 1);
        SQLiteDatabase BaseDeDatos = admin.getWritableDatabase();
        listaPlanetas = admin.insertarPlanetas(BaseDeDatos);




    }


}