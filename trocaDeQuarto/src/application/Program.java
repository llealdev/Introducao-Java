/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package application;

import java.util.Scanner;

/**
 *
 * @author Matheus Leal
 */
public class Program {

    /**
     * Escreva um programa Java que faça a troca de quartos entre dois hospedes. É
       preciso que ele receba o nome de um cliente e sua idade; o cliente a princípio será
       hospedado no quarto A. Depois, o programa deve receber o nome de outro cliente
       e sua idade; se o cliente for mais jovem, ficará no quarto B, mas, se a idade deste
       for maior que a do primeiro cliente, ele ficará no quarto A e o primeiro cliente ficará
       no quarto B. Além disso, se a pessoa mais velha for idosa (com 60 anos ou mais),
       terá desconto de 40%. O programa deve mostrar ao final o nome do cliente que
       ficou no quarto A e o desconto, se houver, e o nome do cliente que ficou no quarto
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Nome do hospede: ");
        String hospede1 = sc.nextLine();
        System.out.println("Quantos anos o hospede tem:");
        int years1 = sc.nextInt();
        
        System.out.println();
        System.out.println("Nome do segundo hospede: ");
        sc.nextLine();
        String hospede2 = sc.nextLine();
        System.out.println("Quantos anos o segundo hospede tem:");
        int years2 = sc.nextInt();
        
        if (years1 > years2){
            if(years1 >= 60 & years2 >= 60){
                System.out.println("Quarto A: "+ hospede1 + " com desconto de 40%; Quarto B: " + hospede2 + " com desconto de 40%");
            }
            else if(years1 >= 60){
                System.out.println("Quarto A: "+ hospede1 + " com desconto de 40%; Quarto B: " + hospede2);
            }
        }
        else if (years2 > years1){
            if(years2 >= 60 & years1 >= 60){
                System.out.println("Quarto A: "+ hospede2 + " com desconto de 40%; Quarto B: " + hospede1 + " com desconto de 40%");
            }
            else if(years2 >= 60){
                System.out.println("Quarto A: "+ hospede2 + " com desconto de 40%; Quarto B: " + hospede1);
            }
        }
        else {
            System.out.println("Quarto A: "+ hospede1 + "; Quarto B: " + hospede2);
        }
        
        sc.close();
    }
    
}
