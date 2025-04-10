package com.example.myapplication; // altere para o seu pacote

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityTelaProgramatica extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Criar o LinearLayout
        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setGravity(Gravity.CENTER);

        // Criar os LayoutParams padrão
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        );

        // Criar o TextView
        TextView textView = new TextView(this);
        textView.setText("Olá Mundo");
        textView.setLayoutParams(params);

        // Criar o Button
        Button button = new Button(this);
        button.setText("Clique aqui");
        button.setLayoutParams(params);

        // Evento de clique no botão
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ActivityTelaProgramatica.this, "Botão clicado!", Toast.LENGTH_SHORT).show();
            }
        });

        // Adicionar as Views ao layout
        layout.addView(textView);
        layout.addView(button);

        // Exibir o layout como a tela principal
        setContentView(layout);
    }
}
