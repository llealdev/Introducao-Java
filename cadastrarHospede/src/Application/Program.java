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
    static Scanner sc = new Scanner(System.in);
    static String name;
    static String[] vect = new String[15]; 
    static int opcao = 0;
    static int i = 0;
   
    /**
     * Monte um algoritmo em que o usuário poderá cadastrar e pesquisar hóspedes. O
       algoritmo deve oferecer um menu com três opções ao usuário: 1- cadastrar; 2-
       pesquisar; 3- sair. A opção “cadastrar” deve permitir que o usuário informe um
       nome de hóspede, gravando-o em memória (máximo de 15 cadastros; caso atinja
       essa quantidade, mostre “Máximo de cadastros atingido”). A opção “pesquisar” deve
       permitir que o usuário informe um nome e, caso seja encontrado um nome
       exatamente igual, mostre a mensagem “Hóspede (nome) foi encontrado no índice
       (índice onde foi cadastrado)”. Se o nome não foi encontrado, mostre “Hóspede não
       encontrado”. O algoritmo deve permitir que o usuário realize essas operações
       repetidas vezes, até que use a opção “3”, que encerra o algoritmo.

     */
    public static void main(String[] args) {
 
        
        while (opcao != 3){
            System.out.println("------ Menu ------");
            System.out.println("1- cadastrar");
            System.out.println("2- pesquisar");
            System.out.println("3- sair");
            System.out.print("Digite: ");
            opcao = sc.nextInt();
            sc.nextLine();
            
            switch (opcao){
                    case 1:
                        cadastrar();
                        break;
                    case 2:
                        pesquisar();
                        break;
                    case 3:
                        System.out.println("Programa finalizado");
                        break;
                    default:
                        System.out.println("Opção inválida! ");
                        break;
            }
                        
        }
 
        sc.close();
        
    }
    
    public static void cadastrar(){
        System.out.print("Digite o nome do hóspede: ");
        name = sc.nextLine();
        
        int cadastroFeito = 0;
        for(String name : vect){
            if(name != null){
                cadastroFeito++;
            }
        }
         
        if (cadastroFeito < 15){
            for(i = 0; i < 15; i++){
                if(vect[i] == null){
                    vect[i] = name;
                    break;
                }
            }
        }
        else{
            System.out.println("Máximo de cadastro atigindo.");
        }

    }
    public static void pesquisar(){
        
        System.out.print("Digite o nome do hospede: ");
        name = sc.nextLine();
        boolean encontrado = false;
        for(int i = 0; i < vect.length; i++){
            if(name.equals(vect[i])){
                System.out.println("Hóspede "+ name + " foi encontrado no índice " + i);
                encontrado = true;
                 break;
            }
        }
        if(encontrado == false){
            System.out.println("Hóspede não encontrado");
        }
    }

}
