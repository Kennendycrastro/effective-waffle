/*
Faça um programa que receba o nome e duas notas de seis alunos e mostre o relatório a seguir. Relatório
de notas:
ALUNO       1aPROVA        2aPROVA      MÉDIA       SITUAÇÃO
Carlos         8,0           9,0         8,5        Aprovado
Pedro          4,0           5,0         4,5        Reprovado

■■ média da classe = ?
■■ percentual de alunos aprovados = ?%
■■ percentual de alunos de exame = ?%
■■ percentual de alunos reprovados = ?% 
 *
 * @author Kennendy
*/
import java.util.Scanner;
public class Att14{
    public static void main(String[] args) {
        try(Scanner entrada = new Scanner(System.in)){
            String[] nomeAlu = new String[6];
            double[] nota1 = new double[6];
            double[] nota2 = new double[6];
            double[] medAlu = new double[6];
            String[] situ = new String[6];
            double somNot = 0, apro = 0, exa = 0,rep = 0 ;
            
            for(int cont = 0; cont < nomeAlu.length; cont++){
                System.out.print("Digite o nome do "+(cont + 1)+ "ª aluno: ");
                nomeAlu[cont] = entrada.nextLine();
                System.out.println("DIgite a nota da 1ª prova do(a) "+nomeAlu[cont]+": ");
                nota1[cont] = entrada.nextDouble();
                System.out.println("DIgite a nota da 2ª prova do(a) "+nomeAlu[cont]+": ");
                nota2[cont] = entrada.nextDouble();
                entrada.nextLine();
                medAlu[cont] = (nota1[cont] + nota2[cont]) / 2;
                somNot += (nota1[cont] + nota2[cont]);
                
            }
            System.out.println("---------------------[Relatorio de nota]--------------------");
            System.out.println("ALUNO      1ªPROVA     2ªPROVA     MÉDIA      SITUAÇÃO");
            for(int test = 0; test < nomeAlu.length; test++){
               if(medAlu[test] >= 7 ){
                   situ[test] = "Aprovado";
                   apro++;
               }else if(medAlu[test] <= 4 ){
                   situ[test] =  "Exame";
                   exa++;
                }else{
                   situ[test] = "Reprovado";
                   rep++;
                }
               
                
                System.out.printf("%-12s %-12.1f %-12.1f %-11f %s\n", nomeAlu[test], nota1[test], nota2[test], medAlu[test], situ[test]);
               
            } 
            System.out.println("Média da classe:%.1f "+somNot/8);
            System.out.println("Percentual de alunos aprovados = "+(apro / nomeAlu.length)*100+"%");
            System.out.println("Percentual de alunos de exame = "+(exa / nomeAlu.length)*100+"%");
            System.out.println("Percentual de alunos de reprovados = "+(rep / nomeAlu.length)*100+"%");
        }     
    }         
}