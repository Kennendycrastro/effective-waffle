/******************************************************************************

  Faça um programa que preencha um vetor com sete números inteiros, calcule e mostre:
   os números múltiplos de 2;
   os números múltiplos de 3;
   os números múltiplos de 2 e de 3.
    @author Kennendy
*******************************************************************************/

import java.util.Scanner;
public class Att02{
    public static void main(String[] args){
        try (Scanner entrada = new Scanner(System.in)) {
            int num[] = new int [7];
            
            for(int cont = 0; cont <= 6; cont++ ){
                
                System.out.print("digite um número: ");
                num[cont] = entrada.nextInt();
            }
            System.out.print("Os números que múltiplos de 2 é: ");
            for (int test = 0; test <= 6; test++){
                if (num[test]  % 2 == 0){
                    System.out.println(num[test]);
                }
            }
            System.out.println("Os números que são múltiplos de 3 é: ");
            for (int test = 0; test <= 6; test++){
                if(num[test] % 3 == 0){
                    System.out.println(num[test]);
                    
                }
            }
            System.out.println("Os números são  múltiplos de 2 e 3 é: ");
            for(int test = 0; test <= 6; test++){
                if (num[test] % 2  == 0 && num[test] % 3 == 0){
                    System.out.println(num[test]);
                }
            }
            System.out.println("Os números que não são múltiplos de 2 e 3 é: ");
            for(int test = 0;  test <= 6; test++){
                if (num[test] % 2  != 0 && num[test] % 3 != 0){
                    System.out.println(num[test]);
                }
            }
        }
    }
}
