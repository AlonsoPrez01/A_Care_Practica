package com.tarea.a_care_practica;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login_Invitado extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_invitado);

        EditText userInvitado = (EditText) findViewById(R.id.editTextCorreoInvitado);
        EditText contraInvitado = (EditText) findViewById(R.id.editTextContraInvitado);

        Button btnIniciarSesion = (Button) findViewById(R.id.btn_Iniciar_S2);

        String Correo = "userInvitado@mail.com";
        String Contra = "adminInvitado1";
        String correoRegistrado = getIntent().getStringExtra("correo");
        String contraRegistrada = getIntent().getStringExtra("contra");

        btnIniciarSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (userInvitado.getText().toString().equals(Correo) && contraInvitado.getText().toString().equals(Contra)){
                    //Inicio de sesión correcto
                    Toast.makeText(Login_Invitado.this, "Inicio de sesión exitoso", Toast.LENGTH_SHORT).show();
                    IniciarSesion(view);
                }
                else if (userInvitado.getText().toString().equals(correoRegistrado) && contraInvitado.getText().toString().equals(contraRegistrada)){
                    Toast.makeText(Login_Invitado.this, "Inicio de sesión exitoso", Toast.LENGTH_SHORT).show();
                    IniciarSesion(view);
                }
                else if (userInvitado.getText().toString().isEmpty() && contraInvitado.getText().toString().isEmpty()) {
                    //Inicio de sesión incorrecto
                    Toast.makeText(Login_Invitado.this, "Por favor ingrese los datos requeridos", Toast.LENGTH_SHORT).show();
                    userInvitado.setText("");
                    contraInvitado.setText("");
                }
                else if (!userInvitado.getText().toString().equals(Correo) && !contraInvitado.getText().toString().equals(Contra)){
                    //Inicio de sesión incorrecto
                    Toast.makeText(Login_Invitado.this, "Inicio de sesión fallido, intente otra vez", Toast.LENGTH_SHORT).show();
                    userInvitado.setText("");
                    contraInvitado.setText("");
                }
                 else if(!userInvitado.getText().toString().equals(correoRegistrado) && !contraInvitado.getText().toString().equals(contraRegistrada)){
                    //Inicio de sesión incorrecto
                    Toast.makeText(Login_Invitado.this, "Inicio de sesión fallido, intente otra vez", Toast.LENGTH_SHORT).show();
                    userInvitado.setText("");
                    contraInvitado.setText("");
                }
            }
        });
    }

    public void CancelLogin(View view){
        Intent cancelar_login = new Intent(this, MainActivity.class);
        startActivity(cancelar_login);
    }

    public void RegistrarInvitado(View view){
        Intent registrar_invitado = new Intent(this, RegistroInvitado.class);
        startActivity(registrar_invitado);
    }

    public void IniciarSesion(View view){
        Intent inciarSesion = new Intent(this, ExplicacionCuestionarioDiario.class);
        startActivity(inciarSesion);
    }
}