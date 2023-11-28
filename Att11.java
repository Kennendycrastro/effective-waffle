/**
 * Faça um programa que receba dez números inteiros e armazene-os em um vetor.  
 * Calcule e mostre dois  vetores resultantes: o primeiro com os números pares e o segundo, com os números ímpares. 
 *
 *
 * @author Kennendy
*/

import java.util.Scanner;
public class Att11 {
    public static void main(String[] args) {
      try(Scanner entrada = new Scanner(System.in)){
          int[] num = new int[10];
          int totPar = 0;
          int totImp = 0;
          
          
          System.out.println("Digite 10 números inteiros.");
          for(int cont = 0; cont < num.length; cont++){
              System.out.print((cont + 1)+ "ª número:");
              num[cont] = entrada.nextInt();
              if(num[cont] % 2 == 0){
                totPar++;  
              }else{
                  
                  totImp++;   
                }
            }
          
          int[] par = new int[totPar];
          int[] impar = new int[totImp];
          totPar = 0;
          totImp = 0;
          for(int test = 0;test < num.length; test++){
              if(num[test] % 2 == 0){
                  par[totPar] = num[test];
                  totPar++;
                }else{
                  impar[totImp] = num[test];
                  totImp++;
                }    
            }
          System.out.println("Os números pares são: ");
          for(int cont2 = 0; cont2 <par.length; cont2++){
              System.out.println(par[cont2]);
            }
          System.out.println("Os impares  são:");
          for(int cont3 = 0; cont3 <impar.length; cont3++){
              System.out.println(impar[cont3]);
            }
        }
    }   
}
