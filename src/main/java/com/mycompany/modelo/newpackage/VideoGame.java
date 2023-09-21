/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modelo.newpackage;

/**
 *
 * @author emanuel.4966
 */
public class VideoGame extends Produto{
    private String plataforma;

    public VideoGame() {
    }

    public String getplataforma() {
        return plataforma;
    }

    public void setplataforma(String plataforma) {
        this.plataforma = plataforma;
    }
    @Override
        public String toString() {
            return  "Nome: " + super.getNome() +
                    " | Preço: " + super.getPreco() +
                    " | Processador: " + this.plataforma;
        }  

    public void setPlataforma(double parseDouble) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
