package com.example.ejercicio_08_calculadoraimc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        Bundle b = intent.getExtras();
        String resultado="";
        ConstraintLayout cl=findViewById(R.id.Main2);

        TextView tv =findViewById(R.id.textViewResultado);
        resultado=Calculadora.calculo(b.getDouble("peso"),b.getDouble("altura"));
        tv.setText(resultado);
        System.out.println(resultado);
        if(resultado.equals("Peso muy bajo")){
            cl.setBackgroundColor(getResources().getColor(R.color.morado));
        }else if(resultado.equals("Peso bajo")){
            cl.setBackgroundColor(getResources().getColor(R.color.azul));
        }else if(resultado.equals("Normal")){
            cl.setBackgroundColor(getResources().getColor(R.color.verde));
        }else if(resultado.equals("Sobrepeso")){
            cl.setBackgroundColor(getResources().getColor(R.color.amarillo));
        }else if(resultado.equals("Obesidad")){
            cl.setBackgroundColor(getResources().getColor(R.color.rojo));
        }
    }
}