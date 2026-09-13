package CursoLogicaCapitulo05;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem vindo ao cálculo de bônus:");

        System.out.println("Informe a meta de faturamento anual da empresa para o ano que passou:");
        Double metaFaturamentoAnoAnterior = scanner.nextDouble();

        System.out.println("Informe o faturamento real da empresa no último ano:");
        Double faturamentoRealAnoAnterior = scanner.nextDouble();

        System.out.println("Informe a média salarial do funcionário para o ano anterior.");
        Double mediaSalarioAnoAnterior = scanner.nextDouble();

        if (faturamentoRealAnoAnterior >= metaFaturamentoAnoAnterior) {
            System.out.println("Parabéns, a meta foi atingida e seu bônus será de 100%! Ele será no valor de R$ " + mediaSalarioAnoAnterior);
        } else if (faturamentoRealAnoAnterior >= (metaFaturamentoAnoAnterior * 0.8)) {
            Double bonus = mediaSalarioAnoAnterior * 0.8;

            System.out.println("Você alcançou a meta para o bônus de 80%. Ele será de R$ " + bonus);
        } else {
            System.out.println("Infelizmente a meta não foi atingida. Você não receberá bônus.");
        }

    }
}
