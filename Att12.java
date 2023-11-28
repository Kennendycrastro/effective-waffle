/*
 * Faça um programa que receba cinco números e mostre a saída a seguir:
 * Digite o 1º número 5
 * Digite o 2º número 3
 * Digite o 3º número 2
 * Digite o 4º número 0
 * Digite o 5º número 2
 * Os números digitados foram: 5 + 3 + 2 + 0 + 2 = 12
 *
 * @author Kennendy
 */
import java.util.Scanner;
public class Att12 {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)){
            double[] num = new double[5];
            double soma = 0;
            for (int cont = 0; cont < num.length; cont++){
                System.out.println("Digite "+ (cont = 1) + "ª numero: ");
                num[cont] = entrada.nextDouble();
                soma += num[cont];
            }
            System.out.println("Os números digitados foram: "+ num[0] +" + "+ num[1] +" + "+ num[2] +" + "+ num[3] +" + "+ num[4]+" = "+soma);
        } 
    }
}
