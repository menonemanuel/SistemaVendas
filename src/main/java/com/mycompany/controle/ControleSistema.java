/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.controle;

import com.mycompany.modelo.newpackage.Computador;
import com.mycompany.modelo.newpackage.Televisao;
import com.mycompany.modelo.newpackage.VideoGame;
import com.mycompany.modelo.newpackage.VisaoMenu;
import java.util.ArrayList;
import java.util.Scanner;
import newpackage.visao.VisaoComputador;
import newpackage.visao.VisaoTelevisao;
import newpackage.visao.VisaoVideoGame;
import newpackage1.outros.Constantes;

/**
 *
 * @author emanuel.4966
 */
public class ControleSistema {
    public static ArrayList<Object> produtos = new ArrayList();
    
    public static void cadastrar(){
        int opcaoProduto = VisaoMenu.menuEscolhaProduto();
        
        if(opcaoProduto == 1){
            produtos.add(VisaoVideoGame.menuCadastroVideoGame());
        }else if(opcaoProduto == 2){
            produtos.add(VisaoComputador.menuCadastroComputador());
        }else if(opcaoProduto == 3){
            produtos.add(VisaoTelevisao.menuCadrastroTelevisao());
        }
    }
    
    public static void alterar(int indiceProduto){
        indiceProduto = indiceProduto - 1;
        
        Object object = produtos.get(indiceProduto);
        
        if(object instanceof VideoGame){
            VideoGame videoGame = new VideoGame();
            videoGame = (VideoGame) object;

            System.out.println("Alterando o produto: " + videoGame.toString());

            videoGame = (VideoGame) VisaoMenu.menuAlteracaoProdutoInformacoes(videoGame);
            ControleSistema.produtos.set(indiceProduto, videoGame);
            //videoGame = (VideoGame) VisaoVideoGame.
        }else if(object instanceof Computador){
            Computador computador = new Computador();
            computador = (Computador) object;
            
            System.out.println("Alterando o produto: " + computador.toString());
            
            computador = (Computador) VisaoMenu.menuAlteracaoProdutoInformacoes(computador);
            ControleSistema.produtos.set(indiceProduto, computador);
         }else if(object instanceof Televisao){
            Televisao televisao = new Televisao();
            televisao = (Televisao) object;
            
            System.out.println("Alterando o produto: " + televisao.toString());
            
            televisao = (Televisao) VisaoMenu.menuAlteracaoProdutoInformacoes(televisao);
            ControleSistema.produtos.set(indiceProduto, televisao);
        }
    }
    
    public static void listar(ArrayList<Object> produtos){
        for(int i = 0; i < produtos.size(); i++){
            Object object = produtos.get(i);
            
            if(object instanceof VideoGame videoGame){
                System.out.println(videoGame.toString());
                
            }else if (object instanceof Computador){
               Computador computador = (Computador) object;
               System.out.println(computador.toString());
               
            }else if (object instanceof Televisao){
                Televisao televisao = (Televisao) object;
               System.out.println(televisao.toString());
            }
        }
    }
        
    public static void remover(int indiceProduto){
        
        indiceProduto = indiceProduto - 1;
        
        Object object =  produtos.get(indiceProduto);
        
       System.out.println("Deseja realmente remover o produto?");
       String sn = new Scanner(System.in).next().toLowerCase();
        
        if(sn.equals(Constantes.REMOVER_SIM)){
            if(object instanceof VideoGame){
                VideoGame VideoGame = new VideoGame();
                VideoGame = (VideoGame) object;
            }if (object instanceof Computador){
                Computador computador =  new Computador();
                computador = (Computador) object;
                System.err.println("Deseja realmente remover o produto" + computador.getNome() + "? (S/N)");
            }if (object instanceof Televisao){
                Televisao televisao =  new Televisao();
                televisao = (Televisao) object;
                System.err.println("Deseja realmente remover o produto" + televisao.getNome()+ "? (S/N)");
            }
            
            if(sn.equals(Constantes.REMOVER_SIM)){
                
            }
          try{
        produtos.remove(indiceProduto);
        System.out.println("Produto removido com sucesso!");
            }catch(Exception e){
                System.out.println("Produto inexistente!");
            }
        }
    }
}