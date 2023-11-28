/*
 * Faça um programa que preencha um vetor com dez números inteiros e um segundo vetor com cinco números inteiros,
 * calcule e mostre dois vetores resultantes. O primeiro vetor resultante será composto pela
 * soma de cada número par do primeiro vetor somado a todos os números do segundo vetor. O segundo
 * vetor resultante será composto pela quantidade de divisores que cada número ímpar do primeiro vetor
 * tem no segundo vetor
 *   
 *
 *
 * @author Kennendy
 */
import java.util.Scanner;

public class Att10 {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)){
            int[] num = new int[10];
            int[] num2 = new int[5];
            
            // Preenchendo o primeiro vetor com 10 números inteiros
            System.out.println("Preencha o primeiro vetor com 10 números inteiros:");
            for(int cont = 0; cont < num.length; cont++){
                System.out.println("Digite um número: ");
                num[cont] = entrada.nextInt();
            }

            System.out.println("Preencha o segundo vetor com 5 números inteiros:");
            for(int cont = 0; cont < num2.length; cont++){
                System.out.println("Digite um número: ");
                num2[cont] = entrada.nextInt();
            }

            int[] resultadoSoma = new int[num.length];
            for(int i = 0; i < num.length; i++){
                if(num[i] % 2 == 0){
                    for(int j = 0; j < num2.length; j++){
                        resultadoSoma[i] += num[i] + num2[j];
                    }
                }
            }

            int[] resultadoDivisores = new int[num.length];
            for(int i = 0; i < num.length; i++){
                if(num[i] % 2 != 0){
                    for(int j = 0; j < num2.length; j++){
                        if(num2[j] != 0 && num[i] % num2[j] == 0){
                            resultadoDivisores[i]++;
                        }
                    }
                }
            }
            System.out.println("Vetor resultante da soma:");
            for(int i = 0; i < resultadoSoma.length; i++){
                System.out.print(resultadoSoma[i] + " ");
            }
            System.out.println();
            System.out.println("Vetor resultante da quantidade de divisores:");
            for(int i = 0; i < resultadoDivisores.length; i++){
                System.out.print(resultadoDivisores[i] + " ");
            }
            System.out.println();
        }
    }
}
