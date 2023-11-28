/*
 * Faça um programa que preencha três vetores com dez posições cada um: o primeiro vetor, com os nomes de
 *  dez produtos; o segundo vetor, com os códigos dos dez produtos; e o terceiro vetor, com os preços dos produtos.
 *  Mostre um relatório apenas com o nome, o código, o preço e o novo preço dos produtos que sofrerão aumento
 *
 *  Sabe-se que os produtos que sofrerão aumento são aqueles que possuem código par ou preço superior a
 *  R$ 1.000,00. Sabe-se ainda que, para os produtos que satisfazem as duas condições anteriores, código e
 *  preço, o aumento será de 20%; para aqueles que satisfazem apenas a condição de código, o aumento será
 *  de 15%; e para aqueles que satisfazem apenas a condição de preço, o aumento será de 10%
 *
 *
 * @author Kennendy
 */
import java.util.Scanner;
public class Att09 {
    public static void main(String[] args) {
        try(Scanner entrada = new Scanner(System.in)){
           String[] nomePro = new String[11];
           int[] codiPro = new int[11];
           double[] prePro = new double[11];

           for (int cont = 0; cont < codiPro.length; cont++) {
                System.out.println("Digite o nome do produto: ");
                nomePro[cont] = entrada.nextLine();
            
                System.out.println("Digite o código do produto: ");
                codiPro[cont] = entrada.nextInt();
                entrada.nextLine(); 
        
                System.out.println("Digite o preço do produto: ");
                prePro[cont] = entrada.nextDouble();
                entrada.nextLine(); 
            }
           System.out.println("----------[Relatório]----------");
           for(int cont2 = 0;cont2 < codiPro.length;cont2++){
               System.out.println("Código: "+codiPro[cont2]);
               System.out.println("Nome: "+nomePro[cont2]);
               System.out.println("Preço: "+prePro[cont2]);  
            }
 
            System.out.println("----------<Novo relatório com o a mudança dos preços>----------");
            for(int test = 0; test < codiPro.length; test++){
                if(codiPro[test] % 2 == 0 && prePro[test] > 1000 ){
                    prePro[test] = prePro[test] * 1.20;
                }else if(codiPro[test] % 2 == 0){
                    prePro[test] = prePro[test] * 1.15;
                }else if(prePro[test] < 1000){
                    prePro[test] = prePro[test] * 1.10;
                }
                
            }
             for(int cont2 = 0; cont2 < codiPro.length; cont2++){
               System.out.println("Código: "+codiPro[cont2]);
               System.out.println("Nome: "+nomePro[cont2]);
               System.out.println("Novo preço: "+prePro[cont2]);  
            }
        }
    }
}
