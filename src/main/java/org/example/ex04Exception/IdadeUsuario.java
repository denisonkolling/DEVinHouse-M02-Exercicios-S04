package org.example.ex04Exception;

import java.util.Scanner;

public class IdadeUsuario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Informe sua idade: ");
                int idade = scanner.nextInt();

                verificarIdade(idade);

                System.out.println("Olá, você tem " + idade + " anos de idade!");
                break;

            } catch (IllegalArgumentException e) {
                System.out.println("Erro: " + e.getMessage());

                scanner.nextLine();

            } catch (Exception e) {
                System.out.println("Erro: Informe uma idade válida.");

                scanner.nextLine();
            }
        }
        scanner.close();
    }


    private static void verificarIdade(int idade) {
        if (idade < 0 || idade > 100) {
            throw new IllegalArgumentException("Idade inválida. Informe uma idade entre 0 e 100.");
        }
    }

}
