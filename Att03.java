/*
Faça um programa para controlar o estoque de mercadorias de uma empresa.
Inicialmente,| o programa deverá preencher dois vetores com dez posições cada,
onde o primeiro corresponde ao código do produto e o segundo, ao total desse produto em estoque|.
|Logo após, o programa deverá ler um conjunto indeterminado de dados
contendo o código de um cliente e o código do produto que ele deseja comprar,
juntamente com a quantidade. Código do cliente igual a zero indica fim do programa.
O programa deverá verificar:

se o código do produto solicitado existe. Se existir, tentar atender ao pedido; caso contrário, exibir
mensagem Código inexistente|;

cada pedido feito por um cliente só pode ser atendido integralmente. Caso isso não seja possível,
escrever a mensagem Não temos estoque suficiente dessa mercadoria. Se puder atendê-lo, escrever
a mensagem Pedido atendido. Obrigado e volte sempre;

efetuar a atualização do estoque somente se o pedido for atendido integralmente;
no final do programa, escrever os códigos dos produtos com seus respectivos estoques já atualizados
*/
import java.util.Scanner;
public class Att03 {
  public static void main(String[] args){
     Scanner entrada = new Scanner(System.in);
     String[] codProd = new String[10];
     int[] qtdProd = new int[10];

    for(int cont = 0; cont < codProd.length; cont++){
      System.out.println("Digite o código do produto: ");
      codProd[cont] = entrada.nextLine();
      System.out.println("Digite a quantidade do produto: ");
      qtdProd[cont] = entrada.nextInt();
    }
    System.out.println("----------Seja bem vindo a nossa loja!!!!----------");
 
   } 
 }


