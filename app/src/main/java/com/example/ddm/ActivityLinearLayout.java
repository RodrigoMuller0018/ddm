package com.example.ddm;

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

                int selectedId = rgTipo.getCheckedRadioButtonId();
                String tipo = "";
                if (selectedId != -1) {
                    RadioButton selectedRadio = findViewById(selectedId);
                    tipo = selectedRadio.getText().toString();
                }

                String mensagem = "Nome: " + nome + "\nE-mail: " + email + "\nTipo: " + tipo;
                Toast.makeText(ActivityLinearLayout.this, mensagem, Toast.LENGTH_LONG).show();
            }
        });
    }
}
