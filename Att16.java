/*
 Faça um programa que receba o nome de cinco produtos e seus respectivos preços. Calcule e mostre:
    ■■ a quantidade de produtos com preço inferior a R$ 50,00;
    ■■ o nome dos produtos com preço entre R$ 50,00 e R$ 100,00;
    ■■ a média dos preços dos produtos com preço superior a R$ 100,00. 

 @author Kennendy
 */
import java.util.Scanner;
public class Att16 {
   public static void main(String[] args){
      try( Scanner entrada = new Scanner(System.in)){
           String[] nomePro = new String[4];
           double[] prePro = new double[4];
           int quantPro50 = 0;
           double medPre100 = 0;
           
           for(int cont = 0; cont < prePro.length; cont++){   
               System.out.print("Digite o nome do produto ");
               nomePro[cont] = entrada.nextLine();
               System.out.print("Digite o preço do produto: ");
               prePro[cont] = entrada.nextDouble();
               entrada.nextLine();
            }
           System.out.println("A quantidade de produtos com preço inferior a R$ 50,00 é: ");
           for(int test = 0; test < prePro.length; test++){  
                if(prePro[test] < 50){
                  quantPro50 ++;
                }
            }
           System.out.println(quantPro50);
           System.out.println("Os produtos com preço entre R$ 50,00 e R$ 100,00 é: ");
           for(int test2 = 0; test2 < prePro.length; test2++){  
                if(prePro[test2] >= 50 && prePro[test2] < 100){
                    System.out.println(nomePro[test2]+" o preço é de: R$ "+prePro[test2]);
                }
            } 
           System.out.println("A  média dos preços dos produtos com preço superior a R$ 100,00 é de: ");
           for(int test3 = 0; test3 < prePro.length; test3++){
               if(prePro[test3] > 100){
                  medPre100 += prePro[test3];  
               }  
           } 
           System.out.print(medPre100 /prePro.length);
        }  
    } 
}
