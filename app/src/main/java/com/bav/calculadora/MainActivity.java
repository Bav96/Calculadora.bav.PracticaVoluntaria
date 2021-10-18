package com.bav.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //Declaraciones de botones
    private Button Sumar;
    private Button Restar;
    private Button Division;
    private Button Multiplicacion;
    private Button Limpiar;

    //Declaraciones de text box
    private TextView Resultado;

    private EditText Operacion1;
    private EditText Operacion2;









    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Resultado=findViewById(R.id.Resultado);
        Operacion1=findViewById(R.id.Operacion1);
        Operacion2=findViewById(R.id.Operacion2);









        // Inicialización de botones.
        Sumar = findViewById(R.id.Sumar);
        Sumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Resultado.setText( suma( Integer.parseInt(Operacion1.getText().toString()),Integer.parseInt(Operacion2.getText().toString()) )+"");
            }
        });

        Restar = findViewById(R.id.Restar);
        Restar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Resultado.setText( resta( Integer.parseInt(Operacion1.getText().toString()),Integer.parseInt(Operacion2.getText().toString()) )+"");
            }
        });

        Multiplicacion = findViewById(R.id.Multiplicacion);
        Multiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Resultado.setText( multiplicacion( Integer.parseInt(Operacion1.getText().toString()),Integer.parseInt(Operacion2.getText().toString()) )+"");
            }
        });
        Division = findViewById(R.id.Division);
        Division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Resultado.setText( division( Integer.parseInt(Operacion1.getText().toString()),Integer.parseInt(Operacion2.getText().toString()) )+"");
            }
        });

        Limpiar = findViewById(R.id.Limpiar);
        Limpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              Operacion1.setText("");
              Operacion2.setText("");
              Resultado.setText("");

            }
        });


    }
    public int suma (int a, int b){
    return a+b;


    }
    public int resta (int a, int b){
        return a-b;


    }
    public int division (int a, int b){
        return a/b;


    }
    public int multiplicacion (int a, int b){
        return a*b;


    }
}