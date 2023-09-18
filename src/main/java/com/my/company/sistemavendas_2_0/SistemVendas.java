/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.my.company.sistemavendas_2_0;

import com.mycompany.controle.ControleSistema;
import com.mycompany.modelo.newpackage.VideoGame;
import com.mycompany.modelo.newpackage.VisaoMenu;
import newpackage1.outros.Constantes;

/**
 *
 * @author emanuel.4966
 */
public class SistemVendas {
    public static void main(String[] args){
        int opcaoMenu;
        
        while(true){
            opcaoMenu = VisaoMenu.menuPrincipal();
            
            if(opcaoMenu == Constantes.CADASTRAR){
                ControleSistema.cadastrar();
                
            }else if(opcaoMenu == Constantes.ALTERAR){
                ControleSistema.alterar(VisaoMenu.menuAlteracaoProduto());
                
            }else if(opcaoMenu == Constantes.REMOVER){
                ControleSistema.remover(VisaoMenu.menuRemocaoProduto());
                
            }else if(opcaoMenu == Constantes.LISTAR){
                ControleSistema.listar(ControleSistema.produtos);
            }
        }
    }
}
