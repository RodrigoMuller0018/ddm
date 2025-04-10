package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

public class ActivityLinearLayout extends AppCompatActivity {

    EditText etNome, etEmail;
    RadioGroup rgTipo;
    Button btnEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_layout);

        etNome = findViewById(R.id.etNome);
        etEmail = findViewById(R.id.etEmail);
        rgTipo = findViewById(R.id.rgTipo);
        btnEnviar = findViewById(R.id.btnEnviar);

        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nome = etNome.getText().toString();
                String email = etEmail.getText().toString();

                int checkedId = rgTipo.getCheckedRadioButtonId();
                String tipo = "";
                if (checkedId != -1) {
                    RadioButton rb = findViewById(checkedId);
                    tipo = rb.getText().toString();
                }

                String msg = "Nome: " + nome + "\nE-mail: " + email + "\nTipo: " + tipo;
                Toast.makeText(ActivityLinearLayout.this, msg, Toast.LENGTH_LONG).show();
            }
        });
    }
}
