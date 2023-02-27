package com.example.calcularimc;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textResultado;
    private EdiText editPeso;
    private EditText editAltura;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textResultado = findViewById(R.id.textResultado);
        editPeso = findViewById(R.id.editPeso);
        editAltura = findViewById(R.id.editAltura);

    }

    public void calcularIMC(View view) {

        double peso = Double. parseDouble(editPeso.getText().toString());
        double altura = Double.parseDouble(editAltura.getText().toString());
        double resultado = peso / (altura * altura);

        if(resultado < 18.5) {
            textResultado.setText("Abaixo do peso.");
        } else if (resultado >= 18.5 && resultado <= 24.9) {
            textResultado.setText("Peso normal.");
        } else if (resultado > 24.9 && resultado <= 29.9) {
            textResultado.setText("Excesso de peso.");
        } else if (resultado > 29.9) {
            textResultado.setText("Obesidade tipo I.");
        }
    }
}