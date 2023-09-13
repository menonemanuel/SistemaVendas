package com.mycompany.calculadoraorientadaobjeto;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author emanuel.4966
 */
public class Calculadora {
    private float resultado;

    public float getResultado() {
        return resultado;
    }

    public void setResultado(float resultado) {
        this.resultado = resultado;
    }
    
    public Calculadora() {
    }
    
    public float somar(float a, float b){
      //  setResultado (a+b);
      return a + b;
        
    }
    
    public float subtrair(float a, float b){
       // setResultado (a-b);
       return a - b;
    }
    
    public float multiplicar(float a, float b){
   // setResultado (a*b);
   return a * b;
    
    }
    public float dividir(float a, float b){
    if(b > 0)
        return a/b;
      //  setResultado (a/b);
   // else{
      System.out.println("Erro ao inserir o número zero!");
        //setResultado(Float.NaN);
                return Float.NaN;
    }
       }
//}
