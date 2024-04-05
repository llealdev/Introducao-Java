/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Application;

import java.util.Scanner;
/**
 *
 * @author Matheus Leal
 */
public class Program {

    /**
     * Monte um programa Java que mostre na tela em formato de tabela os
       quartos ocupados e os desocupados. Considere que o hotel tem 4 andares e 3
       quartos por andar. Primeiro, o usuário registrará os quartos ocupados,
       informando para cada ocupação o número do apartamento (andar de 1 a 4 e
       número de quarto de 1 a 3). O programa deverá questionar “Deseja informar
       outra ocupação? (S/N)” e o usuário poderá informar quantos quartos quiser, até
       que responda “N” a essa pergunta. Em seguida, o programa mostrará uma
       tabela, em que o primeiro andar é o inferior e o último, o superior, marcando
       com X o quarto ocupado.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        char continuar;
        int quarto;
        int andar;
        boolean[][] mat = new boolean[4][3];
        
        do {
            System.out.println("Informe o Andar e Quarto: ");
            System.out.print("Andar: ");
            andar = sc.nextInt();
            System.out.print("Quarto: ");
            quarto = sc.nextInt();
            
            if(andar >= 1 && andar<= 4 && quarto >=1 && quarto <= 3){
                 mat[andar - 1][quarto - 1] = true;
            }
            else {
                System.out.println("Andar ou Quarto inválido");
            }
            System.out.print("Deseja informar outra ocupação? (S/N): ");
            continuar = sc.next().charAt(0);
            
            
        }while(continuar == 'S' || continuar == 's');
        
        System.out.println("Ocupação do do hotel: ");
        for(int i = 0; i < 4; i++){
            System.out.println((i+1) + "º andar:");
            for(int j = 0; j < 3; j++){
                if(mat[i][j]){
                    System.out.println("- Quarto " + (j+1) + " ocupado");
                }
                else{
                    System.out.println("- Quarto " + (j+1) + " desocupado");
                }
            }
        }
        
        
        sc.close();
    }
    
}
