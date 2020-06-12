package com.innovasoft.maskotas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Registrate extends AppCompatActivity {

    Button btn_ir_inicioSesion,crear_cuenta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrate);

        btn_ir_inicioSesion=findViewById(R.id.btn_ir_iniciar_sesion);
        crear_cuenta=findViewById(R.id.crear_cuenta);


        btn_ir_inicioSesion.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Registrate.this, Login.class));
                finish();
            }
        });

        crear_cuenta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(Registrate.this, "Registrar Usuarios", Toast.LENGTH_SHORT).show();
                //poner codigo
            }
        });

    }
}