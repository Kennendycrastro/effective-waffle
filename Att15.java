/*
 * Faça um programa que receba o nome de oito clientes e armazene-os em um vetor. Em um segundo vetor,
 * armazene a quantidade de DVDs locados em 2011 por cada um dos oito clientes. Sabe-se que, para cada
 * dez locações, o cliente tem direito a uma locação grátis. Faça um programa que mostre o nome de todos
 * os clientes, com a quantidade de locações grátis a que ele tem direito.
 *
 *
 * @author Kennendy
 */
import java.util.Scanner; 
public class Att15 {
    public static void main(String[] args) {
        try(Scanner entrada = new Scanner(System.in)){
            String[] nome = new String[4];
            int[] dvds = new int[4];
            
            for(int cont = 0; cont < nome.length; cont++){
                System.out.println("Digite o nome do"+(cont + 1)+" cliente: ");
                nome[cont] = entrada.nextLine();
                System.out.println("digite a quantidade de DVDs locados por "+nome[cont]+": ");
                dvds[cont] = entrada.nextInt();
                entrada.nextLine();
            } 
            
            System.out.println("Os Clientes que podem ter locações grátis são: ");
            for( int test = 0;test <nome.length;test++){
                if(dvds[test] == 10 ){
                    System.out.println("O cliente "+nome[test]+" tem o direito a 1 locação grátis");
                }else if(dvds[test] >= 10){
                        System.out.println("O cliente "+nome[test]+" tem o direito á "+ (dvds[test] - 10)+" locações grátis");
                }
            }         
        }     
    } 
}
