import java.util.Scanner;

public class Excec9 {
    public static int vogais(char f[]) {
        int contv =0;

        //for (int i = 0; i < f.length; i++) {
            /*if (f[i] == 'a' || f[i] =='e' || f[i] == 'i' || f[i] == 'o' || f[i] == 'u') 
                contv++;*/

               for (char x : f) 

                if (x == 'a' || x =='e' || x == 'i' || x == 'o' || x == 'u') 
                contv++;

                return contv;
               

        
    }
    public static int conPalavras(char f[]) {
        int conp=1;

       /* for (int i = 0; i < f.length; i++) {
            if(f[i] == ' ')
            conp++;
        }*/
        
        for (char c : f)
            if(c == ' ')

            conp++;

        return conp;
    }
    public static void inicialMaisculo(char f[]) {
        if(f[0] >=97 && f[0] <= 122){
        f[0] -=32;
    }
    for (int i = 1; i < f.length; i++) {
        if(f[i -1] == ' ')
            f[i] -=32;
        }
    }
    public static void diferente(char f[]) {
        if(f[0] !=97 && f[0]!= 122)
        f[0] = 122;
        for (char c : f) {
            if(f [i -1] == ' ')
            f[i] = 122;
    public static void main(String[] args) {
        
        char frase[];

        Scanner dd = new Scanner(System.in);

        System.out.print("Digite uma palavras: ");

        frase = dd.nextLine().toCharArray();

        // outra forma de fazer
        // frase = new Scanner(System.in).nextLine().toCharArray(); 

        System.out.println(" Na frase existe " +vogais(frase)  + " vogais ");

        System.out.println(" Na frase existe " +conPalavras(frase)+ " palavras ");

        inicialMaisculo(frase);

        System.out.print("Incial Maiúscula: ");

        System.out.println(frase);

    }
    
}

