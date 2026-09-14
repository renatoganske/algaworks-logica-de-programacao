package CursoLogicaCapitulo05;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        System.out.println("Numero x Dia da semana");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número de 1 a 7 para saber a qual dia da semana ele se refere: ");
        int numero = scanner.nextInt();

        switch (numero) {
            case 1:
                System.out.println("O dia da semana é Domingo.");
                break;
            case 2:
                System.out.println("O dia da semana é Segunda-feira.");
                break;
            case 3:
                System.out.println("O dia da semana é Terça-feira.");
                break;
            case 4:
                System.out.println("O dia da semana é Quarta-feira.");
                break;
            case 5:
                System.out.println("O dia da semana é Quinta-feira.");
                break;
            case 6:
                System.out.println("O dia da semana é Sexta-feira.");
                break;
            case 7:
                System.out.println("O dia da semana é Sábado.");
                break;
            default:
                System.out.println("Número inválido. Por favor, informe um número de 1 a 7.");
        }
    }
}
