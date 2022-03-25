/*
Interligando duas palavras , ultilizando laço de repetição com while
*/
import java.util.Scanner;

public class Exec7 {
    public static void main(String[] args) {
        char p1[], p2[];
        char r [] = new char [8];
        Scanner ler = new Scanner(System.in);

        System.out.print("Palavra1: ");
        p1 = ler.next().toCharArray();
        System.out.print("Palavra2: ");
        p2 = ler.next().toCharArray();

        if (p1.length != 4 || p2.length !=4) {
            System.out.println("Não tem 4 caracteres");
        } else {
            int i =0;
            while (i < 4) {
                r[(i*2)] = p1[i];
                r [(i*2) +1] = p2[i];
                i++;
            }
        }
        String v = new String(r);
        System.out.println(v+"\n");
        
        System.out.println("Tranformando em maiúscula");
        System.out.println(v.toUpperCase());
    }
    
}
