/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage.visao;

import com.mycompany.modelo.newpackage.VideoGame;
import java.util.Scanner;

/**
 *
 * @author emanuel.4966
 */
public class VisaoVideoGame {
    public static VideoGame menuCadastroVideoGame(){
        VideoGame videoGame = new VideoGame();
        
        System.out.println("Nome: ");
        videoGame.setNome(new Scanner(System.in).nextLine());
        System.out.println("Preço: ");
        videoGame.setPreco(new Scanner( System.in).nextDouble());
        System.out.println("Plataforma: ");
        videoGame.setplataforma(new Scanner(System.in).nextLine());
        
        return videoGame;
        
        
        
    }
}
