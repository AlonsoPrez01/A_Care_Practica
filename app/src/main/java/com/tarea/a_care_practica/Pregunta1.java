package com.tarea.a_care_practica;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Pregunta1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pregunta1);
    }

    public void Siguiente1(View view){
        Intent siguiente = new Intent(this, Pregunta2.class);
        startActivity(siguiente);
    }

    public void Anterior1(View view){
        Intent anterior = new Intent(this, AceptarEncuesta.class);
        startActivity(anterior);
    }
}