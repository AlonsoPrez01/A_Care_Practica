package com.tarea.a_care_practica;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Pregunta4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pregunta4);
    }

    public void Siguiente4(View view){
        Intent siguiente = new Intent(this, Pregunta5.class);
        startActivity(siguiente);
    }

    public void Anterior4(View view){
        Intent anterior = new Intent(this, Pregunta3.class);
        startActivity(anterior);
    }
}