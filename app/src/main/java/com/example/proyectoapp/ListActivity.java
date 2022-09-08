package com.example.proyectoapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

public class ListActivity extends AppCompatActivity {

    List<ListElement> elements;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        init();
    }

    public void init(){
        elements = new ArrayList<>();
        elements.add(new ListElement("Arquitectura", "Lorenzo Medina", "6.1"));
        elements.add(new ListElement("Hardware", "Mauricio Guerra", "6.7"));
        elements.add(new ListElement("Sistemas Operativos", "Luis Rojas", "5.1"));
        elements.add(new ListElement("Python", "Rodrigo Cabello", "6.5"));
        elements.add(new ListElement("Bases de Datos", "Sebastian Parra", "5.5"));
        elements.add(new ListElement("Lenguaje", "Manuel Correa", "5.2"));
        elements.add(new ListElement("Patrones de Diseño", "Manuel Correa", "7.0"));
        elements.add(new ListElement("Java", "Manuel Correa", "6.8"));
        elements.add(new ListElement("Desarrollo WEB", "Manuel Correa", "6.5"));

        ListAdapter listAdapter = new ListAdapter(elements, this);
        RecyclerView recyclerView = findViewById(R.id.listRecyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(listAdapter);
    }
}