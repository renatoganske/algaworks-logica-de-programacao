package CursoLogicaCapitulo08;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        imprimirTraco();

        String[] cursos = new String[]{"Java EE", "Spring", "Java OO Avançado"};

        imprimir("Escolha dentre os cursos abaixo: ");

        iteraEExibePosicoesDoVetor(cursos);

        Integer posicaoCursoEscolhido = receberOpcaoDigitadaPeloUsuario("O curso que você deseja é o: ", scanner);

        Boolean posicaoValida = verificarPosicaoEscolhida(posicaoCursoEscolhido, cursos);

        if (!posicaoValida) {
            encerraProgramaPorPosicaoInvalida();
        }

        imprimirTraco();

        String[] formasPagamento = new String[]{"Cartão", "Boleto"};

        imprimir("Escolha dentre as formas de pagamento abaixo: ");

        iteraEExibePosicoesDoVetor(formasPagamento);

        Integer posicaoFormaPagamentoEscolhida = receberOpcaoDigitadaPeloUsuario("Sua forma de pagamento escolhida é: ", scanner);

        posicaoValida = verificarPosicaoEscolhida(posicaoFormaPagamentoEscolhida, formasPagamento);

        if (!posicaoValida) {
            encerraProgramaPorPosicaoInvalida();
        }

        String cursoEscolhido = cursos[posicaoCursoEscolhido];
        String formaPagamentoEscolhida = formasPagamento[posicaoFormaPagamentoEscolhida];

        imprimirTraco();

        imprimir("O curso escolhido foi " + cursoEscolhido + " e a forma de pagamento é " + formaPagamentoEscolhida);

        scanner.close();
    }

    static Integer receberOpcaoDigitadaPeloUsuario(String texto, Scanner scanner) {
        imprimirEContinuarNaMesmaLinha(texto);
        return scanner.nextInt();
    }

    static Boolean verificarPosicaoEscolhida(Integer posicao, String[] vetor) {
        return posicao >= 0 && posicao < vetor.length;
    }

    private static void iteraEExibePosicoesDoVetor(String[] formasPagamento) {
        for (int i = 0; i < formasPagamento.length; i++) {
            imprimir("[" + i + "] " + formasPagamento[i]);
        }
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

    static void imprimirEContinuarNaMesmaLinha(String texto) {
        System.out.print(texto);
    }
}
