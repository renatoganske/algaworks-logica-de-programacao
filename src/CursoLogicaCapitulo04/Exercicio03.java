package CursoLogicaCapitulo04;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {

        System.out.println("Calculadora de gastos familiares");

        Scanner scanner = new Scanner(System.in);

        Double totalGastosFamiliares = 0.0;

        System.out.print("Digite o valor da conta de luz: ");
        totalGastosFamiliares += scanner.nextDouble();

        System.out.print("Digite o valor da conta de água: ");
        totalGastosFamiliares += scanner.nextDouble();

        System.out.print("Digite o valor da conta de telefone: ");
        totalGastosFamiliares += scanner.nextDouble();

        System.out.print("Digite o valor da escola do seu filho: ");
        totalGastosFamiliares += scanner.nextDouble();

        System.out.print("Digite o valor da fatura do cartão de crédito: ");
        totalGastosFamiliares += scanner.nextDouble();

        System.out.print("Digite o valor gasto com supermercado: ");
        totalGastosFamiliares += scanner.nextDouble();

        System.out.println("Total de gastos familiares é: " + totalGastosFamiliares);

        scanner.close();
    }
}
