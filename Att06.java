/*
    Faça um programa que receba o total das vendas de cada vendedor de uma loja e armazene-as em um vetor.
    Receba também o percentual de comissão a que cada vendedor tem direito e armazene-os em outro vetor.
    Receba os nomes desses vendedores e armazene-os em um terceiro vetor. Existem apenas dez vendedores na
    loja. Calcule e mostre:
    ■■ um relatório com os nomes dos vendedores e os valores a receber referentes à comissão;
    ■■ o total das vendas de todos os vendedores;
    ■■ o maior valor a receber e o nome de quem o receberá;
    ■■ o menor valor a receber e o nome de quem o receberá . em java
 *
 * @author Kennendy
 */
import java.util.Scanner;
public class Att06{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numVendedores = 10;
        double[] vendas = new double[numVendedores];
        double[] comissao = new double[numVendedores];
        String[] nomes = new String[numVendedores];

        for (int i = 0; i < numVendedores; i++) {
            System.out.println("Digite o nome do vendedor " + (i + 1) + ":");
            nomes[i] = input.nextLine();

            System.out.println("Digite o total de vendas do vendedor " + nomes[i] + ":");
            vendas[i] = input.nextDouble();

            System.out.println("Digite o percentual de comissão do vendedor " + nomes[i] + " (em %):");
            comissao[i] = input.nextDouble() / 100;
            
            input.nextLine(); // Limpar o buffer do scanner
        }
        System.out.println("\nRelatório de Comissões:");
        for (int i = 0; i < numVendedores; i++) {
            double valorComissao = vendas[i] * comissao[i];
            System.out.println("Vendedor: " + nomes[i] + " - Valor a receber: R$" + valorComissao);
        }

        double totalVendas = 0;
        for (double venda : vendas) {
            totalVendas += venda;
        }
        System.out.println("\nTotal de Vendas de Todos os Vendedores: R$" + totalVendas);

        double maiorComissao = Double.MIN_VALUE;
        String vendedorMaiorComissao = "";
        for (int i = 0; i < numVendedores; i++) {
            if (vendas[i] * comissao[i] > maiorComissao) {
                maiorComissao = vendas[i] * comissao[i];
                vendedorMaiorComissao = nomes[i];
            }
        }
        System.out.println("Maior valor a receber: R$" + maiorComissao + " - Vendedor: " + vendedorMaiorComissao);
        double menorComissao = Double.MAX_VALUE;
        String vendedorMenorComissao = "";
        for (int i = 0; i < numVendedores; i++) {
            if (vendas[i] * comissao[i] < menorComissao) {
                menorComissao = vendas[i] * comissao[i];
                vendedorMenorComissao = nomes[i];
            }
        }
        System.out.println("Menor valor a receber: R$" + menorComissao + " - Vendedor: " + vendedorMenorComissao);
    }
}
