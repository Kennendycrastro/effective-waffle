

/*
 * Faça um programa que preencha um vetor com os nomes de sete alunos e carregue outro vetor com a média
 * final desses alunos. Calcule e mostre:
 *  ■ o nome do aluno com maior média (desconsiderar empates);
 *  ■ para cada aluno não aprovado, isto é, com média menor que 7,
 *  mostrar quanto esse aluno precisa tirar na prova de exame final para ser aprovado.
 *  Considerar que a média para aprovação no exame é 5.
 *
 * @author Kennendy
*/
import java.util.Scanner;
public class Att08 {
    public static void main(String[] arg){
        try (Scanner entrada = new Scanner(System.in)){
            String[] nome = new String[8];
            double[] media = new double[8];
            double maiorMed = 0;
            String auxNome = "";
            double medMini = 0;
            
            for( int cont = 0;cont < media.length; cont++){
                System.out.println("Digite o nome do aluno: ");
                nome[cont] = entrada.nextLine();
                System.out.println("Digite a média final do(a)"+nome[cont]+": ");
                media[cont] = entrada.nextDouble();
                entrada.nextLine();
            }
            for(int test = 0; test < media.length; test++){
               if(maiorMed < media[test]){
                  maiorMed = media[test];
                  auxNome = nome[test];
               }   
            }
            System.out.println("O aluno(a) com a maior média é o(a) : "+auxNome+". Sua média é: "+maiorMed);
            for(int test2 = 0; test2 < media.length; test2++){
                if(media[test2] < 5 ){
                    medMini = (2 * 5) - media[test2];
                    System.out.println("O aluno(a) "+nome[test2]+" precisa tirar "+medMini+ " no exame final.");
                }
                
            }
            
       
        }
    }
}
