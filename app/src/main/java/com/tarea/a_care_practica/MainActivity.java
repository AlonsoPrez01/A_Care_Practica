package com.tarea.a_care_practica;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    //Método para ir al inicio de sesión con cuenta anahuac.
    public void IniciarSesionA(View view){
        Intent iniciar_sesionA = new Intent(this, InicioSesionAnahuac.class);
        startActivity(iniciar_sesionA);
    }

    public void IniciarSesionInvitado(View view){
        Intent sesion_invitado = new Intent(this, Login_Invitado.class);
        startActivity(sesion_invitado);
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}