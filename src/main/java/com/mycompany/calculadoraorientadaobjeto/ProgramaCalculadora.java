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
        CalculadoraDeMedia CalcM = new CalculadoraDeMedia();
        MédiaPonderada mp = new MédiaPonderada();
        
        Scanner scanner = new Scanner (System.in);
        
      float soma, subtração, multiplicação, divisão, num1, num2, num3, num4, peso1, peso2;
        
        System.out.println("Vamos ver a soma, subtração, multiplicação e adicação de 2 números, insira-os: ");
      
        System.out.println("Informe o primeiro número: ");
        num1 = scanner.nextFloat();
        
        System.out.println("Informe o segundo número: ");
         num2 = scanner.nextFloat();
        
        System.out.println("Resultado da soma: " + calculadora.somar(num1, num2));
        System.out.println("Resultado da subtração: " + calculadora.subtrair(num1, num2));
        System.out.println("Resultado da multiplicação: " + calculadora.multiplicar(num1, num2));
        System.out.println("Resultado da divisão: " + calculadora.dividir(num1, num2));
        
        System.out.println("|-----------------------------------|");
        
        System.out.println("Agora, informe um número para saber a sua raíz quadrada: ");
        Double numRq =  scanner.nextDouble();
        Double rq = cc.raizQuadrada(numRq);
        
        System.out.println("A raiz quadrada de " + numRq + " é " +  rq);
        
        System.out.println("|-----------------------------------|");
        
        System.out.println("Vamos calcular a potência de um número: ");
        
        System.out.println("Informe um número: ");
        Double num = scanner.nextDouble();
        
        System.out.println("Informe uma potência: ");
        Double numPot = scanner.nextDouble();
        Double pow = cc.raizQuadrada(num + numPot);
        
        System.out.println("|-----------------------------------|");
        
        System.out.println(num + " elevado a " + numPot +" é " + pow);
        
        System.out.println("|-----------------------------------|");
        
        System.out.println("Informe 4 números para saber a sua média: ");
        num1 = scanner.nextFloat();
        num2 = scanner.nextFloat();
        num3 = scanner.nextFloat();
        num4 = scanner.nextFloat();
        
         System.out.println("A média é: " + CalcM.mediaSimples(num1, num2, num3, num4));
         
         System.out.println("|-----------------------------------|");
         
         System.out.println("Calcule a média ponderada: ");
         
         System.out.println("Insira dois números: ");
         num1 = scanner.nextFloat();
         num2 = scanner.nextFloat();
         
          System.out.println("Insira dois pesos: ");
         peso1 = scanner.nextFloat();
         peso2 = scanner.nextFloat();
         
         mp.mediaPonderada(num1, num2, peso1, peso2);
         
         System.out.println("A sua média ponderada é: " + mp.mediaPonderada(num1, num2, peso1, peso2));
         
    }
}