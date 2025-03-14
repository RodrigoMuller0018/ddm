package com.ifsc.contaclick;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    int contaCliques = 0;
    Button button;
    TextView contaCliquesText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        contaCliquesText = findViewById(R.id.contaCliquesText);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contaCliques++;
                contaCliquesText.setText("Clique contagem: " + contaCliques);
            }
        });
    }
}
