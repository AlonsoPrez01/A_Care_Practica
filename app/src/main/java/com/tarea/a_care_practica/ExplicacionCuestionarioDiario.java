package com.tarea.a_care_practica;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ExplicacionCuestionarioDiario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explicacion_cuestionario_diario);

    }

    public void ContestarCuestionario(View view){
        Intent contestarCuestionario = new Intent(this, AceptarEncuesta.class);
        startActivity(contestarCuestionario);
    }
}