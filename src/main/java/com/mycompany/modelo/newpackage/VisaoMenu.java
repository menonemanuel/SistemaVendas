/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modelo.newpackage;
import com.mycompany.controle.ControleSistema;
import java.util.Scanner;

/**
 *
 * @author emanuel.4966
 */
public class VisaoMenu {
    public static int menuPrincipal(){
        System.out.println("---------SISTEMA DE VENDAS 2.0-----------");
        System.out.println("1 -  Cadastrar produto: ");
        System.out.println("2 -  Alterar produto: ");
        System.out.println("3 -  Remover produto: ");
        System.out.println("4 -  Listar produto: ");
        System.out.println("==============================");
        int opcaoMenu =  new Scanner(System.in).nextInt();
        
        return opcaoMenu;
    }
    
    public static int menuEscolhaProduto(){
        System.out.println("=========CADASTRAR PRODUTO========");
        System.out.println("Qual categoria de produto deseja cadastrar?");
        System.out.println("1- Video Game");
        System.out.println("2- Computador");
        System.out.println("3- Televisão");
        System.out.println("==================================");
        int opcaoProduto =  new Scanner(System.in).nextInt();
        
        return opcaoProduto;
        
    }
    
    public static int menuAlteracaoProduto(){
        System.out.println("===========ALTERAR PRODUTO=======");
        System.err.println("Qual produto deseja alterar?");

        for(int i = 0; 1 < ControleSistema.produtos.size(); i++){
            System.out.println(i + 1 + " | " + ControleSistema.produtos.get(i));
        }
        System.out.println("===============================================");
        int produtoAlterar = new Scanner(System.in).nextInt();

        return produtoAlterar;
    }
      
    public static Object menuAlteracaoProdutoInformacoes(Object object){
        if(object instanceof VideoGame){
            System.out.println("Novo nome: ");
            ((VideoGame)object).setNome(new Scanner(System.in).nextLine());
            System.out.println("Novo preço: ");
            ((VideoGame)object).setPreco(new Scanner(System.in).nextDouble());
            System.out.println("Nova Plataforma: ");
            ((VideoGame)object).setplataforma(new Scanner(System.in).nextLine());
        }else if(object instanceof Computador){
            System.out.println("Novo nome: ");
            ((Computador)object).setNome(new Scanner(System.in).nextLine());
            System.out.println("Novo preço: ");
            ((Computador)object).setPreco(new Scanner(System.in).nextDouble());
            System.out.println("Nova quantidade de memória Ram: ");
            ((Computador)object).setMemoriaRam(new Scanner(System.in).nextDouble());
            System.out.println("Nova processador: ");
            ((Computador)object).setProcessador(new Scanner(System.in).nextLine());
        }else if(object instanceof Televisao){
            System.out.println("Novo nome: ");
            ((Televisao)object).setNome(new Scanner(System.in).nextLine());
            System.out.println("Novo preço: ");
            ((Televisao)object).setPreco(new Scanner(System.in).nextDouble());
            System.out.println("Nova quantidade de memória Ram: ");
            ((Televisao)object).setPolegadas(new Scanner(System.in).nextDouble());
            System.out.println("Nova processador: ");
            ((Televisao)object).setResolucao(new Scanner(System.in).nextLine());
        }

        return object; 
    }
    
    public static Object remover(Object object){
        System.err.println("Qual produto deseja alterar?");

        for(int i = 0; 1 < ControleSistema.produtos.size(); i++){
            System.out.println(i + 1 + " | " + ControleSistema.produtos.get(i));
        }
        System.out.println("===============================================");
        int produtoRemover = new Scanner(System.in).nextInt();

        return produtoRemover;
     }

    public static int menuRemocaoProduto() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
