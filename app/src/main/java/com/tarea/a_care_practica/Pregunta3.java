package com.tarea.a_care_practica;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Pregunta3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pregunta3);
    }

    public void Siguiente3(View view){
        Intent siguiente = new Intent(this, Pregunta4.class);
        startActivity(siguiente);
    }

    public void Anterior3(View view){
        Intent anterior = new Intent(this, Pregunta2.class);
        startActivity(anterior);
    }
}