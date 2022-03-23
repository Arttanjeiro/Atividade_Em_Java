package Atividades;

import java.util.Scanner;
/*
Faça uma aplicação java que ao ser executado peça
 para que o usuário digite os seguintes dados:

Nome:

Idade:

Endereço:

Fone:
*/

public class Exec2 {
    public static void main(String[] args) {
        String nome;
        int idade;
        String endereco;
        int numero;
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        nome = ler.nextLine();
        System.out.print("Digite sua idade: ");
        idade = ler.nextInt();
        ler.nextLine();
        System.out.print("Digite seu indereço: ");
        endereco = ler.nextLine();
        System.out.print("Digite seu número: ");
        numero = ler.nextInt();
        System.out.println("********************************************");

        System.out.println("Seu nome é: " +nome);
        System.out.println("Sua idade é: " +idade + " anos ");
        System.out.println("Seu endereço é: " +endereco);
        System.out.println("Seu número é: " +numero);
      
    }
    
}
