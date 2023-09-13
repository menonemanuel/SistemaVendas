package com.mycompany.calculadoraorientadaobjeto;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author emanuel.4966
 */
    public class CalculadoraCientífica extends Calculadora{
        public Double raizQuadrada(Double a){
            return Math.sqrt(a);
    }
        public Double potencia(Double a, Double b){
            return Math.pow(a, b);
        }
}
