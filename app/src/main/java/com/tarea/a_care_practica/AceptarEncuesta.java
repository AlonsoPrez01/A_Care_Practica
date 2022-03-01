package com.tarea.a_care_practica;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AceptarEncuesta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aceptar_encuesta);
    }

    public void NoAcepto(View view){
        Intent noAcepto = new Intent(this, MainActivity.class);
        startActivity(noAcepto);
    }

    public void Acepto(View view){
        Intent acepto = new Intent(this, Pregunta1.class);
        startActivity(acepto);
    }
}