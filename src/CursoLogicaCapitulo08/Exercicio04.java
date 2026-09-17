package CursoLogicaCapitulo08;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Tabuada");

        System.out.print("Digite um número para que seja calculada a tabuada: ");
        Integer multiplicando = scanner.nextInt();

        imprimirTabuada(multiplicando, 0);
    }

    static void imprimirTabuada(Integer multiplicando, Integer multiplicador) {
        System.out.println(multiplicando + " x " + multiplicador + " = " + multiplicando * multiplicador);

        if (++multiplicador <= 10) {
            imprimirTabuada(multiplicando, multiplicador);
        }
    }
}
