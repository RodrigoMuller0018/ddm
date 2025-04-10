package com.example.ddm;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btnProgramatica, btnLinear, btnFormulario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnProgramatica = findViewById(R.id.btnProgramatica);
        btnLinear = findViewById(R.id.btnLinear);
        btnFormulario = findViewById(R.id.btnFormulario);

        btnProgramatica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ActivityTelaProgramatica.class));
            }
        });

        btnLinear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ActivityLinearLayout.class));
            }
        });

        btnFormulario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ActivityFormularioConstraint.class));
            }
        });
    }
}
