import java.util.Scanner;

public class Exercicio02 {

  public static void main() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Sistema Para Cálculo de IMC");

    System.out.print("Informe seu peso em quilos: ");
    Double peso = scanner.nextDouble();

    System.out.print("Informe sua altura em metros: ");
    Double altura = scanner.nextDouble();

    Double quadradoAltura = altura * altura;
    Double imc = peso / quadradoAltura;

    System.out.println("Seu IMC é: " + imc);

    scanner.close();
  }
}
