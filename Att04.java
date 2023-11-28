/*
* Faça um programa que preencha um vetor com quinze elementos inteiros e
* verifique a existência de elementos iguais a 30, mostrando as posições em que
* apareceram.



  @author Kennendy
*/
import java.util.Scanner;
public class Att04 {
    
    public static void main(String[] args) {
        try(Scanner entrada = new Scanner(System.in)){
           int[] num = new int[4];
           
            System.out.println("Digite 15 números inteiros: ");
           for (int cont = 0; cont < num.length; cont++) {
               System.out.print("Digite o "+(cont + 1)+"ª número:");
               num[cont] = entrada.nextInt();
               
            }
            System.out.println("O(s) números 30 estão na posição(as posições começar no 0): ");
            for (int test = 0; test < num.length; test++) {
                if(num[test] == 30){
                    System.out.println(test);
                }     
            }
        } 
    }
}
