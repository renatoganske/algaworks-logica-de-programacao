package CursoLogicaCapitulo07;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] tarefas = new String[5];

        System.out.println("Cadastre suas 5 tarefas diárias mais importantes:");

        for (int i = 0; i < tarefas.length; i++) {
            // aqui coloquei um i+1 para ficar mais amigável para o usuário
            System.out.println("Tarefa " + (i + 1) + ": ");
            tarefas[i] = scanner.nextLine();
        }

        System.out.println("Suas principais tarefas do dia são:");

        for (int i = 0; i < tarefas.length; i++) {
            System.out.println(tarefas[i]);
        }

        scanner.close();

    }
}