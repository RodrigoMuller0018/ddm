package com.ifsc.ddm;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    EditText editPeso, editAltura;
    Button btnCalcularImc;
    private boolean isEditing = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editPeso = findViewById(R.id.editPeso);
        editAltura = findViewById(R.id.editAltura);
        btnCalcularImc = findViewById(R.id.btnCalcularImc);

        editAltura.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {}

            @Override
            public void afterTextChanged(Editable s) {
                if (isEditing) return;
                isEditing = true;

                String clean = s.toString().replaceAll("[^\\d]", "");
                if (!clean.isEmpty()) {
                    try {
                        double alturaCm = Double.parseDouble(clean);
                        double alturaMetros = alturaCm / 100.0;
                        String formatado = String.format(Locale.US, "%.2f", alturaMetros);
                        editAltura.setText(formatado);
                        editAltura.setSelection(formatado.length());
                    } catch (NumberFormatException e) {
                        e.printStackTrace();
                    }
                }

                isEditing = false;
            }
        });

        btnCalcularImc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pesoStr = editPeso.getText().toString().trim();
                String alturaStr = editAltura.getText().toString().trim();

                if (pesoStr.isEmpty()) {
                    editPeso.setError("Informe o peso");
                    return;
                }

                if (alturaStr.isEmpty()) {
                    editAltura.setError("Informe a altura");
                    return;
                }

                try {
                    double peso = Double.parseDouble(pesoStr);
                    double altura = Double.parseDouble(alturaStr);

                    if (altura == 0) {
                        editAltura.setError("Altura não pode ser zero");
                        return;
                    }

                    Intent intent = new Intent(MainActivity.this, ImcActivity.class);
                    intent.putExtra("peso", peso);
                    intent.putExtra("altura", altura);
                    startActivity(intent);

                } catch (NumberFormatException e) {
                    editPeso.setError("Número inválido");
                    editAltura.setError("Número inválido");
                }
            }
        });
    }
}
