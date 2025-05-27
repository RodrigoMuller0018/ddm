package com.ifsc.ddm;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ImcActivity extends AppCompatActivity {

    TextView txtResultado;
    ImageView imgCategoria;
    Button btnVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imc);

        txtResultado = findViewById(R.id.txtResultado);
        imgCategoria = findViewById(R.id.imgCategoria);
        btnVoltar = findViewById(R.id.btnVoltar);

        double peso = getIntent().getDoubleExtra("peso", 0);
        double altura = getIntent().getDoubleExtra("altura", 0);

        double imc = peso / (altura * altura);
        String categoria;

        if (imc < 18.5) {
            categoria = "Abaixo do peso";
            imgCategoria.setImageResource(R.drawable.abaixopeso);
        } else if (imc < 24.9) {
            categoria = "Peso normal";
            imgCategoria.setImageResource(R.drawable.normal);
        } else if (imc < 29.9) {
            categoria = "Sobrepeso";
            imgCategoria.setImageResource(R.drawable.sobrepeso);
        } else if (imc < 34.9) {
            categoria = "Obesidade Grau 1";
            imgCategoria.setImageResource(R.drawable.obesidade1);
        } else if (imc < 39.9) {
            categoria = "Obesidade Grau 2";
            imgCategoria.setImageResource(R.drawable.obesidade2);
        } else {
            categoria = "Obesidade Grau 3";
            imgCategoria.setImageResource(R.drawable.obesidade3);
        }

        String resultado = String.format("IMC: %.2f\nCategoria: %s", imc, categoria);
        txtResultado.setText(resultado);

        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish(); // Volta para a MainActivity
            }
        });
    }
}
