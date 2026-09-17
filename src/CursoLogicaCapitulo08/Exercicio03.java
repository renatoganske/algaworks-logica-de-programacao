package CursoLogicaCapitulo08;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem vindo à calculadora raiz");

        imprimeLinhas();

        System.out.print("Informe o primeiro número: ");
        Integer numero1 = scanner.nextInt();

        System.out.print("Informe o seguinte número: ");
        Integer numero2 = scanner.nextInt();

        imprimeLinhas();

        Integer operacao = recebeAOperacao(scanner);

        Integer resultado = realizaCalculo(operacao, numero1, numero2);

        System.out.print("O resultado do cálculo é: " + resultado);

        scanner.close();
    }

    private static void imprimeLinhas() {
        System.out.println("---------------------------------------");
    }

    static Integer realizaCalculo(Integer operacao, Integer numero1, Integer numero2) {
        Integer resultado = 0;

        switch (operacao) {
            case 0:
                resultado = adicao(numero1, numero2);
                break;
            case 1:
                resultado = subtracao(numero1, numero2);
                break;
            default:
                System.err.println("Operação inválida");
                System.exit(0);
        }
        return resultado;

    }

    static Integer subtracao(Integer numero1, Integer numero2) {
        return numero1 - numero2;
    }

    static Integer adicao(Integer numero1, Integer numero2) {
        return numero1 + numero2;
    }

    static Integer recebeAOperacao(Scanner scanner) {
        String[] operacoes = new String[]{"Adicao", "Subtracao"};

        System.out.println("Essas são as operações disponíveis: ");

        for (int i = 0; i < operacoes.length; i++) {
            System.out.println("[" + i + "] " + operacoes[i]);
        }

        System.out.print("Informe a operação desejada: ");
        return scanner.nextInt();
    }

}
