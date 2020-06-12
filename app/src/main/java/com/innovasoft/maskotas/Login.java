package com.innovasoft.maskotas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    Button btn_ir_crearCuenta, iniciar_sesion ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btn_ir_crearCuenta=findViewById(R.id.btn_ir_crearCuenta);
       iniciar_sesion=findViewById(R.id.iniciar_sesion);


        btn_ir_crearCuenta.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Login.this, Registrate.class));
                finish();
            }
        });
        iniciar_sesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Login.this,"Bienvenido",Toast.LENGTH_SHORT).show();
                //aqui codigo
            }
        });

    }
}