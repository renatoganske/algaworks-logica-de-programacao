package CursoLogicaCapitulo03;

import java.util.Scanner;

public class Exercicio01 {

  static void main() {
    System.out.println("Cálculo do Quadrado");

    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite um número: ");
    Integer numero = scanner.nextInt();

    Integer quadrado = numero * numero;

    System.out.println("O quadrado de " + numero + " é: " + quadrado);

    scanner.close();
  }
}
