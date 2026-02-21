package CursoLogicaCapitulo03;

import java.util.Scanner;

public class Exercicio02 {

  public static void main(String[] args) {
    System.out.println("Impressão de nome e sobrenome");

    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite seu nome: ");
    String nome = scanner.nextLine();

    System.out.print("Digite seu sobrenome: ");
    String sobrenome = scanner.nextLine();

    System.out.println("Seu nome completo é: " + nome + " " + sobrenome);

    scanner.close();
  }
}
