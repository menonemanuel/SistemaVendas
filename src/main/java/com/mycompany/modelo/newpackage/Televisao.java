/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modelo.newpackage;

/**
 *
 * @author emanuel.4966
 */
    public class Televisao extends Produto{
    private Double polegadas;
    private Double resolucao;
    
    public Televisao() {
    }
    
    public Double getPolegadas() {
        return polegadas;
    }

    public void setPolegadas(Double plataforma) {
        this.polegadas = plataforma;
    }

    public Double getResolucao() {
        return resolucao;
    }

    public void setResolucao(Double resolucao) {
        this.resolucao = resolucao;
    }
    @Override
        public String toString() {
            return  "Nome: " + super.getNome() +
                    " | Preço: " + super.getPreco() +
                    " | Memória RAM: " + this.polegadas +
                    " | Processador: " + this.resolucao;
        }  
}
    
