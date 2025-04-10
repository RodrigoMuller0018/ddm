package com.example.ddm;

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

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setGravity(Gravity.CENTER);
        layout.setPadding(32, 32, 32, 32);

        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        );

        TextView textView = new TextView(this);
        textView.setText("Olá Mundo");
        textView.setGravity(Gravity.CENTER);
        textView.setLayoutParams(params);

        Button button = new Button(this);
        button.setText("Clique aqui");
        button.setLayoutParams(params);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ActivityTelaProgramatica.this, "Botão clicado!", Toast.LENGTH_SHORT).show();
            }
        });

        layout.addView(textView);
        layout.addView(button);

        setContentView(layout);
    }
}
