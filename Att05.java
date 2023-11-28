/*
 Uma escola deseja saber se existem alunos cursando, simultaneamente, as disciplinas Lógica e Linguagem de
 Programação. Coloque os números das matrículas dos alunos que cursam Lógica em um vetor, quinze alunos.
 Coloque os números das matrículas dos alunos que cursam Linguagem de Programação em outro vetor, dez
 alunos. Mostre o número das matrículas que aparecem nos dois vetores. 
 *
 * @author Kennendy
 */
       import java.util.Scanner;

public class Att05 {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)){
            int[] logic = new int[5];
            int[] ling = new int[4];
            int countCommon = 0;
            
            System.out.println("--------------------[Cadastro das disciplinas]--------------------");
           
            for(int cont = 0; cont < logic.length; cont++){
                System.out.println("Digite o número da matrícula de pessoas cursando Lógica de Programação: ");
                logic[cont] = entrada.nextInt();
            }
            
            for(int cont2 = 0; cont2 < ling.length; cont2++){
                System.out.println("Digite o número da matrícula de pessoas cursando Linguagem de Programação: ");
                ling[cont2] = entrada.nextInt();
            }
            
            System.out.println("Matrículas que estão simultaneamente em Lógica e Linguagem de Programação: ");
            for(int i = 0; i < logic.length; i++){
                for(int j = 0; j < ling.length; j++){
                    if(logic[i] == ling[j]){
                        System.out.println(logic[i]);
                        countCommon++;
                    }
                }
            }
            
            if(countCommon == 0){
                System.out.println("Não há matrículas comuns entre as disciplinas.");
            }
        }
    }
}
