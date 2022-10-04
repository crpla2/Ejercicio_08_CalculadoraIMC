package com.example.ejercicio_08_calculadoraimc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void click(View view){
        Intent i = new Intent(this,MainActivity2.class);
        //Cogemos la información del editText, lo almacenamos en el Intent
        EditText et = findViewById(R.id.editTextPeso);
        EditText et2= findViewById(R.id.editTextAltura);
        i.putExtra("peso",Double.parseDouble(et.getText().toString()));
        i.putExtra("altura",Double.parseDouble(et2.getText().toString()));
        startActivity(i);
    }
}