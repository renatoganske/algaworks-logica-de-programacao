package CursoLogicaCapitulo08;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        imprimirTraco();

        String[] cursos = new String[]{"Java EE", "Spring", "Java OO Avançado"};

        imprimir("Escolha dentre os cursos abaixo: ");

        for (int i = 0; i < cursos.length; i++) {
            imprimir("[" + i + "] " + cursos[i]);
        }

        System.out.print("O curso que você deseja é o: ");
        Integer posicaoCursoEscolhido = scanner.nextInt();

        Boolean posicaoValida = posicaoCursoEscolhido >= 0 && posicaoCursoEscolhido < cursos.length;

        if (!posicaoValida) {
            encerraProgramaPorPosicaoInvalida();
        }

        imprimirTraco();

        String[] formasPagamento = new String[]{"Cartão", "Boleto"};

        imprimir("Escolha dentre as formas de pagamento abaixo: ");

        for (int i = 0; i < formasPagamento.length; i++) {
            imprimir("[" + i + "] " + formasPagamento[i]);
        }

        System.out.print("Sua forma de pagamento escolhida é: ");
        Integer posicaoFormaPagamentoEscolhida = scanner.nextInt();

        posicaoValida = posicaoFormaPagamentoEscolhida >= 0
                && posicaoFormaPagamentoEscolhida < formasPagamento.length;

        if (!posicaoValida) {
            encerraProgramaPorPosicaoInvalida();
        }

        String cursoEscolhido = cursos[posicaoCursoEscolhido];
        String formaPagamentoEscolhida = formasPagamento[posicaoFormaPagamentoEscolhida];

        imprimirTraco();

        imprimir("O curso escolhido foi " + cursoEscolhido + " e a forma de pagamento é " + formaPagamentoEscolhida);

        scanner.close();
    }

    private static void encerraProgramaPorPosicaoInvalida() {
        System.err.println("Posição inválida!");
        System.exit(1);
    }

    static void imprimirTraco() {

        System.out.println("----------------------------------------------");
    }

    static void imprimir(String texto) {
        System.out.println(texto);
    }
}
