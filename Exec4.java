/*
Crie uma aplicação java que peça para o usuário digite uma palavra de 4 caracteres.

Se for digitado mais ou menos de 4 caracteres uma mensagem deverá ser 
apresentado na tela do computador informando o problema e o programa deverá ser encerrado.

*/



 
import java.util.Scanner;


public class Exec4 {
    public static  void main(String[] args) {
        String dado ;

        Scanner ler = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        dado = ler.next();

        if (dado.length() !=4) {
            System.out.println("A palavra digitado não possui 4 caracteres");
            System.exit(0); // encerra a aplicação java
            
        }

        dado = dado.toLowerCase();
        char vet[] = dado.toCharArray(); // posso cria variável qualque lugar do códico
        int contV =0 , contC = 0 , contN = 0 ;
        
        if (vet[0] == 'a' || vet[0] == 'e' || vet[0] == 'i'|| vet[0] == 'o'|| vet[0] == 'u' ) {
            contV++;
        }else{
            if (vet[0] >= 48 && vet[0] <=57) {
                contN++;
            }else
            contC++;
        } if (vet[1] == 'a' || vet[2] == 'e' || vet[1] == 'i'|| vet[1] == 'o'|| vet[1] == 'u' ) {
            contV++;;
        }else{
            if (vet[1] >= 48 && vet[1] <=57) {
                contN++;
            }else
            contC++;
        
        



    } if (vet[2] == 'a' || vet[2] == 'e' || vet[2] == 'i'|| vet[2] == 'o'|| vet[2] == 'u' ) {
        contV++;;
    }else{
        if (vet[2] >= 48 && vet[2] <=57) {
            contN++;
        }else
        contC++;    
        if (vet[3] == 'a' || vet[3] == 'e' || vet[3] == 'i'|| vet[3] == 'o'|| vet[3] == 'u' ) {
            contV++;;
        }else{
            if (vet[3] >= 48 && vet[3] <=57) {
                contN++;
            }else
            contC++;
    
}
     }
     System.out.println("Vogais: " +contV);
     System.out.println("Consoante: " +contC);
     System.out.println("Número: " +contN);
     }
    
}
