package com.tarea.a_care_practica;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;


public class RegistroInvitado extends AppCompatActivity {

    private EditText nombre;
    private EditText apellidoPaterno;
    private EditText apellidoMaterno;
    private EditText correo;
    private EditText contra;
    private EditText confrimarContra;
    private EditText campus;

    public CheckBox proveedor;

    public Button btnContinuar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_invitado);

        nombre = (EditText) findViewById(R.id.txtNombreInivtado);
        apellidoPaterno = (EditText) findViewById(R.id.txtApellidoPinivitado);
        apellidoMaterno = (EditText) findViewById(R.id.txtApellidoMinvitado);
        correo = (EditText) findViewById(R.id.txtEmailInvitado);
        contra = (EditText) findViewById(R.id.txtContrasennaInvitado);
        confrimarContra = (EditText) findViewById(R.id.txtConfirmarContraInvitado);
        campus = (EditText) findViewById(R.id.txtCampusInvitado);

        proveedor = (CheckBox) findViewById(R.id.checkBoxProveedor);

        btnContinuar = (Button) findViewById(R.id.button);

        btnContinuar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String nombre1 = nombre.getText().toString();
                String aPaterno1 = apellidoPaterno.getText().toString();
                String aMaterno1 = apellidoMaterno.getText().toString();
                String correo1 = correo.getText().toString();
                String contra1 = contra.getText().toString();
                String cContra1 = confrimarContra.getText().toString();
                String campus1 = campus.getText().toString();

                if (contra1.equals(cContra1)){
                    Toast.makeText(RegistroInvitado.this, "Registro completo y exitoso", Toast.LENGTH_SHORT).show();
                    RegistroCompleto(view);
                }
                else {
                    Toast.makeText(RegistroInvitado.this, "La contraseña no coincide, intente de nuevo", Toast.LENGTH_SHORT).show();
                    nombre.setText("");
                    apellidoPaterno.setText("");
                    apellidoMaterno.setText("");
                    correo.setText("");
                    contra.setText("");
                    confrimarContra.setText("");
                    campus.setText("");
                }
            }
        });
    }

    public void CancelarRegistro(View view){
        Intent cancelar_registro = new Intent(this, Login_Invitado.class);
        startActivity(cancelar_registro);
    }

    public void RegistroCompleto(View view){
        Intent registroCompleto = new Intent(this, Login_Invitado.class);
        registroCompleto.putExtra("correo", correo.getText().toString());
        registroCompleto.putExtra("contra", confrimarContra.getText().toString());
        startActivity(registroCompleto);
    }
}