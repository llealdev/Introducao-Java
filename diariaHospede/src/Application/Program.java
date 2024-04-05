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
     * Escreva um programa Java que receba o valor padrão de uma diária e em
       seguida receba vários nomes de hóspedes e suas idades. Caso a idade do
       hóspede seja menor de 4 anos, ele não paga hospedagem – nesses casos, é
       preciso que seja mostrada na tela a mensagem “(Nome do hóspede) possui
       gratuidade”. Hóspedes com mais de 80 anos pagam metade – então dever ser
       mostrado na tela “(Nome do hóspede) paga meia”. O usuário informará hóspedes
       até digitar a palavra “PARE”, que interrompe a entrada de dados. Ao fim, o
       programa deve mostrar a quantidade de gratuidades, a quantidade de meias
       hospedagens e o valor total, considerando todos os hóspedes informados.

     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int gratuidade = 0;
        int meia = 0;
        double sum = 0;
        char continuar = 'S';
        
        System.out.print("Qual valor padrão da diária: R$");
        double diaria = sc.nextDouble();
        sum += diaria;
        
        while (continuar == 'S') {
            System.out.print("Nome do hóspede: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Idade do hóspede: ");
            int idade = sc.nextInt();
            
            if(idade < 4){
                gratuidade++;
                System.out.println(name + " possui gratuidade");
            }
            else if (idade > 80){
                meia++;
                sum += diaria / 2;
                System.out.println(name + " paga meia");
                
            }
            
            
            System.out.print("Deseja continuar cadastrando hóspede? Se sim digite (SIM) se não de (PARE): ");
            sc.nextLine();
            continuar = sc.next().charAt(0);
        }
        
        System.out.printf("Total de hospedagens: R$%.2f; %d gratuidade(s); %d meia(s)%n", sum, gratuidade, meia);
        
        sc.close();
        
    }
    
}
