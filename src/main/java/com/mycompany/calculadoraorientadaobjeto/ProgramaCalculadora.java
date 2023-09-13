/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadoraorientadaobjeto;

import java.util.Scanner;

/**
 *
 * @author emanuel.4966
 */
public class ProgramaCalculadora {
    public static void main (String[] args){
        Calculadora calculadora = new Calculadora();
        CalculadoraCientífica cc = new CalculadoraCientífica();
        
        Scanner scanner = new Scanner (System.in);
        
        float soma, subtração, multiplicação, divisão, num1, num2;
        
        System.out.println("Informe o primeiro número: ");
         num1 = scanner.nextFloat();
        
        System.out.println("Informe o segundo número: ");
         num2 = scanner.nextFloat();
        //calculadora.subtrair(12, 1);
        
         soma = calculadora.somar(num1, num2);
         subtração = calculadora.subtrair(num1, num2);
         multiplicação = calculadora.multiplicar(num1, num2);
         divisão = calculadora.dividir(num1, num2);
        
        System.out.println("Resultado da soma: " + soma);
        System.out.println("Resultado da subtração: " + subtração);
        System.out.println("Resultado da multiplicação: " + multiplicação);
        System.out.println("Resultado da divisão: " + divisão);
        
        System.out.println("Agora, informe um número para saber a sua raíz quadrada: ");
        Double numRq = scanner.nextDouble();
        
        Double rq = cc.raizQuadrada(numRq);
        
        System.out.println("Raiz quadrade de " + numRq + "é" +  rq);
        
        System.out.println("Informe um número: ");
        Double num = scanner.nextDouble();
        
        System.out.println("Informe uma potência: ");
        Double numPot = scanner.nextDouble();
        Double pow = cc.raizQuadrada(num + numPot);
        
        System.out.println(num + "elevado a " + numPot +" é " + pow);
        
        // System.out.println(calculadora.getResultado());
    }
}
