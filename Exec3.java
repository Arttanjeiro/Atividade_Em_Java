/*
Faça uma aplicação java que solicite ao programa que o usuário digite uma palavra. O programa deverá alterar a palavra substituindo todas as consonantes pela próxima consoante do alfabeto, 
se não houver uma consoante posterior o programa não deverá alterar a consoante original.

*/


package Atividades;

import java.util.Scanner;

public class Exec3 {

    public static void main(String[] args) {


        char dado[];
        Scanner ler = new Scanner(System.in);
        System.out.print("Informe uma palavra: ");

        dado = ler.next().toLowerCase().toCharArray();

        for ( int i =0; i < dado.length; i++) {
            if (dado[i] != 'z' && dado[i] != 'a' && dado[i] != 'e' && dado[i] != 'i' &&
            dado[i] != 'o' && dado[i] != 'u' )  {
                dado[i] = ++dado[i];
                if (dado[i] == 'a' || dado[i] == 'e' || dado[i] == 'i' || dado[i] == 'o' ||
                dado[i] == 'u' ) {
                    dado[i] = ++dado[i];
                    
                }
                
            }
           
        }
        System.out.println("Resultado");
        System.out.println(dado);
    }
}


 
