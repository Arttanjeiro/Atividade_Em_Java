import java.util.Scanner;

/**
 O código abaixo deve ser reescrito  criando dois métodos além do método main. A parte do código em negrito deve estar dentro de um método de nome validar e parte em itálico deve estar em outro método de nome computarPrimos. Os dois métodos devem ser chamadas a partir do método main. Ao executar o programa ele deve ter o mesmo comportamento visual do programa Prog5.java (contido na Aula8).
Os métodos criados podem ser com retorno ou sem retorno, com passagem de parâmetros ou sem passagem de parâmetros podendo ser método de classe ou de objeto, você programador deve decidir isso.
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