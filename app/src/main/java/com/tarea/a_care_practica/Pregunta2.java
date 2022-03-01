package com.tarea.a_care_practica;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Pregunta2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pregunta2);
    }

    public void Siguiente2(View view){
        Intent siguiente = new Intent(this, Pregunta3.class);
        startActivity(siguiente);
    }

    public void Anterior2(View view){
        Intent anterior = new Intent(this, Pregunta1.class);
        startActivity(anterior);
    }
}