package CursoLogicaCapitulo04;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        System.out.println("Calculadora");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        Integer numero1 = scanner.nextInt();

        System.out.print("Digite a operação desejada ( 1 - adição, 2 - subtração, 3 - multiplicação, 4 - divisão: ");
        String operacao = scanner.next();

        System.out.print("Digite o segundo número: ");
        Integer numero2 = scanner.nextInt();

        Integer resultado = null;

        if(operacao.equals("1")) {
            resultado = numero1 + numero2;
        } else if(operacao.equals("2")) {
            resultado = numero1 - numero2;
        } else if(operacao.equals("3")) {
            resultado = numero1 * numero2;
        } else if(operacao.equals("4")) {
            resultado = numero1 / numero2;
        }

        System.out.println("O resultado da operação é: " + resultado);

        scanner.close();

    }
}
