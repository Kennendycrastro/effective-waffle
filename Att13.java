/*
 *  Faça um programa que receba o nome e a nota de oito alunos e mostre o relatório a seguir:
    Digite o nome do 1ª aluno: Carlos
    Digite a nota do Carlos: 8
    Digite o nome do 2ª aluno: Pedro
    Digite a nota do Pedro: 5
    Relatórios de notas
    Carlos 8.0
    Pedro 5.0
    ..
    ..
    ..
    Média da classe = ??
 *
 *
 * @author Kennendy
 */
import java.util.Scanner;
public class Att13 {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)){
            String[] nome = new String[8];
            double[] nota = new double[8];
            double somaNota = 0;
            for(int cont = 0;cont < nota.length; cont++){
                System.out.println("Digite o nome do "+ (cont + 1)+" ª aluno: "); 
                nome[cont] = entrada.nextLine();
                System.out.println("Digite a nota do(a) "+nome[cont]+":");
                nota[cont] = entrada.nextDouble();
                entrada.nextLine();
                somaNota += nota[cont];  
            }
            System.out.println("----------<Relatório de notas>----------");
            for(int cont2 = 0; cont2 < nota.length; cont2++){
                System.out.println(nome[cont2]+" "+nota[cont2]);
            }
            System.out.println("A media da classe é:%.1f "+ somaNota / nota.length);
        }
    }
}
