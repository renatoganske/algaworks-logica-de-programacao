package CursoLogicaCapitulo05;

import java.util.Scanner;

public class Exercicio01 {

    static final Integer NOTA_MINIMA_APROVACAO_PROVA = 60;
    static final Integer SOMA_NOTA_MINIMA_APROVACAO = 150;

    public static void main(String[] args) {

        System.out.println("Verificação de aprovação em concurso público:");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota da prova de português: ");
        Integer notaProvaPortugues = scanner.nextInt();

        System.out.print("Digite a nota da prova de matemática: ");
        Integer notaProvaMatematica = scanner.nextInt();

        Boolean temNotaMinimaPortugues = notaProvaPortugues >= NOTA_MINIMA_APROVACAO_PROVA;
        Boolean temNotaMinimaMatematica = notaProvaMatematica >= NOTA_MINIMA_APROVACAO_PROVA;

        Integer notaTotal = notaProvaPortugues + notaProvaMatematica;

        Boolean temNotaSuficiente = notaTotal >= SOMA_NOTA_MINIMA_APROVACAO;

        Boolean aprovado = temNotaMinimaPortugues && temNotaMinimaMatematica && temNotaSuficiente;

        if (aprovado) {
            System.out.println("Você foi aprovado!");
        } else {
            System.out.println("Você não foi aprovado.");
        }

        scanner.close();

    }

}
