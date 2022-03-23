/*
Faça uma aplicação java que solicite ao usuário que digite um número de até 4 algarismo e
 programa

deverá apresentar na tela quantas
 unidades, dezenas, centenas e milhares existe no número digitado.

*/


package Atividades;

import java.util.Scanner;

public class Exec5 {
    public static void main(String[] args) {
        int numero;
       
        System.out.print("Digite um número de 4 caracteres: ");
        numero = new Scanner(System.in).nextInt();
       
       
             
         
        
        int mil = numero / 1000;
        int cent = (numero%1000 )/ 100;
        int dez = (numero%100)/10;
        int uni = ((numero%100) % 10);
       
       
       
        System.out.println("Milhar: " +mil);
        System.out.println("Centena: "+cent);
        System.out.println("Dezena: "+dez);
        System.out.println("Unidade:"+uni);
        
       
       

       

    }
   
    
}
