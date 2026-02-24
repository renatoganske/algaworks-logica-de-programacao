package CursoLogicaCapitulo03;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        System.out.println("Validação de aprovação de aluno");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota do aluno: ");
        Double nota = scanner.nextDouble();

        Boolean aprovado = nota >= 70;

        if (aprovado) {
            System.out.println("Aluno aprovado!");
        } else {
            System.out.println("Aluno reprovado!");
        }
    }
}
