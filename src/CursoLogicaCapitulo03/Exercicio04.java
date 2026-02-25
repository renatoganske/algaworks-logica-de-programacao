package CursoLogicaCapitulo03;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        System.out.println("Cálculo de valor total de compra");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do produto: ");
        Double valorProduto = scanner.nextDouble();

        System.out.print("Digite a quantidade do produto: ");
        Integer quantidadeProduto = scanner.nextInt();

        Double valorTotal = valorProduto * quantidadeProduto;

        Boolean atacado = quantidadeProduto >= 10;

        Double percentualDoDesconto = 0.0;

        if (atacado) {
            percentualDoDesconto = 10.0;
        }

        Double valorDoDesconto = valorTotal * percentualDoDesconto / 100;
        Double valorFinal = valorTotal - valorDoDesconto;

        System.out.println("Valor total da compra: " + valorFinal);

        scanner.close();
    }
}
