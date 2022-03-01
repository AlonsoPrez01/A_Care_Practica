package com.tarea.a_care_practica;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Pregunta5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pregunta5);
    }

    public void Anterior5(View view){
        Intent anterior = new Intent(this, Pregunta4.class);
        startActivity(anterior);
    }

    public void Finalizar(View view){
        Intent finalizar = new Intent(this, ResultadoA_Care.class);
        startActivity(finalizar);
    }
}