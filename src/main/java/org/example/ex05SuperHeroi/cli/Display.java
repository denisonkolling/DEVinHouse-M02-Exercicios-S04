package org.example.ex05SuperHeroi.cli;

import org.example.ex05SuperHeroi.exception.OpcaoInvalidaException;
import org.example.ex05SuperHeroi.model.Heroi;
import org.example.ex05SuperHeroi.model.Personagem;
import org.example.ex05SuperHeroi.model.Vilao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Display {

        List<Personagem> listaPersonagens = new ArrayList<>();

    public void exibirMenu() throws OpcaoInvalidaException {
        Scanner scanner = new Scanner(System.in);

        int opcao;
        do {
            System.out.println("Menu de Opções:");
            System.out.println("1 - Cadastrar Herói");
            System.out.println("2 - Cadastrar Vilão");
            System.out.println("3 - Listar Personagens");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    cadastrarHeroi(scanner, listaPersonagens);
                    break;
                case 2:
                    cadastrarVilao(scanner, listaPersonagens);
                    break;
                case 3:
                    listarPersonagens(listaPersonagens);
                    break;
                case 4:
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    throw new OpcaoInvalidaException("Opção inválida. Tente novamente.");
            }
        } while (opcao != 4);
        
        scanner.close();
    }

    private static void cadastrarHeroi(Scanner scanner, List<Personagem> listaPersonagens) {
        System.out.print("Informe o nome do Herói: ");
        String nome = scanner.nextLine();
        System.out.print("Informe o nome na vida real do Herói: ");
        String nomeVidaReal = scanner.nextLine();
        System.out.print("Informe o superpoder do Herói: ");
        String superpoder = scanner.nextLine();

        Heroi heroi = new Heroi(nome, nomeVidaReal, superpoder);
        listaPersonagens.add(heroi);

        System.out.println("Herói cadastrado com sucesso!\n");
    }

    private static void cadastrarVilao(Scanner scanner, List<Personagem> listaPersonagens) {
        System.out.print("Informe o nome do Vilão: ");
        String nome = scanner.nextLine();
        System.out.print("Informe o superpoder do Vilão: ");
        String superpoder = scanner.nextLine();
        System.out.print("Informe o tempo de prisão do Vilão: ");
        Integer tempoPrisao = scanner.nextInt();


        Vilao vilao = new Vilao(nome, superpoder, tempoPrisao);
        listaPersonagens.add(vilao);

        System.out.println("Vilão cadastrado com sucesso!\n");
    }

    private static void listarPersonagens(List<Personagem> listaPersonagens) {
        System.out.println("\nListagem de Personagens:");
        for (Personagem personagem : listaPersonagens) {
            System.out.println(personagem);
        }
        System.out.println();
    }
}
