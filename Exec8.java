import java.util.Scanner;

/**
 * Exec8
 */
public class Exec8 {
    static  int num , cont =0;
    public static void validar(){
       
        for(;;){
            System.out.print("Digite um numero: ");
            num = new Scanner(System.in).nextInt();
            if(num> 10)
            break;
            else{
                System.out.println("O NUMERO DIGITADO TEM QUE SER MAIO QUE 10°");
                    System.out.println("Repita a operação");
            }
        }


    }
    public static void computarPrimos () {
        System.out.println("Os NÚMEROS PRIMOS SÃO: ");
        for(;num > 1;){
           cont = 1;
           int i=2;
            for (;i<= num/2;) {
                if (num %i == 0) {
                    cont++;
                    if(cont > 1)
                    break;

                }
                i++;
            }
            if (cont <=1) {
                System.out.println(num);
            }

            num --;

        }

    }
    public static void main(String[] args) {
        validar();
        computarPrimos();
        
    }
    
}