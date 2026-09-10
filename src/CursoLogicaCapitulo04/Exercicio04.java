package CursoLogicaCapitulo04;

import java.util.Scanner;

public class Exercicio04 {

    static final Integer IDADE_MINIMA_APOSENTADORIA = 55;
    static final Integer TEMPO_MINIMO_CONTRIBUICAO = 25;

    public static void main(String[] args) {

        System.out.println("Verificação de possibilidade de aposentadoria");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe sua idade:");
        Integer idade = scanner.nextInt();

        System.out.println("Informe o tempo de contribuição:");
        Integer tempoContribuicao = scanner.nextInt();

        Boolean temIdadeMinima = idade >= IDADE_MINIMA_APOSENTADORIA;
        Boolean temTempoContribuicaoMinimo = tempoContribuicao >= TEMPO_MINIMO_CONTRIBUICAO;

        if(temIdadeMinima && temTempoContribuicaoMinimo) {
            System.out.println("O usuário pode se aposentar.");
        } else {
            System.out.println("O usuário não pode se aposentar.");
        }

        scanner.close();

    }
}
