package CursoLogicaCapitulo04;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {

        System.out.println("Validação de cobrança de frete");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do produto: ");
        Double valorProduto = scanner.nextDouble();

        Boolean cobrarFrete = valorProduto < 100.0;

        Double valorFinalDoProduto = valorProduto;

        if (cobrarFrete) {
            valorFinalDoProduto += 15.0;
        }

        System.out.println("Valor final do produto: " + valorFinalDoProduto);

        scanner.close();
    }
}
