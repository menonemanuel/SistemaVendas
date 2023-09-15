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
public class MédiaPonderada {
      Scanner scanner = new Scanner (System.in);
        
        public float  mediaPonderada (float num1, float num2, float peso1, float peso2) {
        return (num1 * peso1 + num2 * peso2) / (peso1 + peso2);
             
        
    }
}