/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage.visao;

import com.mycompany.modelo.newpackage.Computador;
import com.mycompany.modelo.newpackage.Televisao;
import java.util.Scanner;

/**
 *
 * @author emanuel.4966
 */
public class VisaoTelevisao {
    public static Televisao menuCadrastroTelevisao(){
            
             Televisao televisao = new Televisao();
        
        System.out.println("Nome: ");
        televisao.setNome(new Scanner(System.in).nextLine());
        System.out.println("Preço: ");
        televisao.setPreco(new Scanner(System.in).nextDouble());
        System.out.println("Quantidade de Polegadas: ");
        televisao.setPolegadas(new Scanner(System.in).nextDouble());
        System.out.println("Resolução: ");
        televisao.setResolucao(new Scanner(System.in).nextDouble());
        System.out.println("===============================================");
        
        return televisao;  
    }
}
