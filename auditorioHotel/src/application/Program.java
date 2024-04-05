/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package application;

import java.util.Scanner;

/**
 * 1. Relativo ao atendimento de eventos, o hotel necessita de uma funcionalidade
      que indique qual de seus dois auditórios é o mais adequado para um evento. O
      auditório Alfa conta com 150 lugares e espaço para até 70 cadeiras adicionais. O
      auditório Beta conta com 350 lugares, sem espaço para mais cadeiras. Desenvolva
      um programa Java que receba o número de convidados do evento e faça uma
      verificação sobre esse número: se for maior que 350 ou menor que zero, deverá ser
      mostrada a mensagem “Número de convidados inválido”. Se o valor informado é
      válido, deverá ser mostrado na tela qual dos auditórios é o mais adequado. No caso
      do auditório Alfa, será preciso calcular ainda quantas cadeiras adicionais serão
      necessárias, observando o limite citado anteriormente.
 
 * @author Matheus Leal
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Quantos covidados terão nessa festa? ");
        int convidados = sc.nextInt();
        
        if (convidados > 0 & convidados <= 220){
            if(convidados <= 150){
                System.out.println("Use auditório Alfa");
            }
            else{
                System.out.println("Use auditório Alfa e inclua mais "+ ( convidados - 150) + " cadeiras");
            }
        }
        else if(convidados > 0 & convidados <= 350){
            System.out.println("Use auditório Beta");
        }
        else  {
            System.out.println("Número de convidados inválidos");
        }

        sc.close();
    }
    
}
