package com.example.ejercicio_08_calculadoraimc;

public class Calculadora {
     private double peso;
     private double altura;
    
    public static String calculo(double peso, double altura){

        String resultado = null;
        double result;
        result=peso/(altura*altura);

        if (result<16){
            resultado="Peso muy bajo";
        }
        if (result>=16 && result<18.50){
            resultado="Peso bajo";
        }
        if (result>=18.5 && result<25){
            resultado="Normal";
        }
        if (result>=25.00 && result<30){
            resultado="Sobrepeso";
        }
        if (result>=30.00){
            resultado="Obesidad";
        }
        
        return resultado;
    }
    
}
