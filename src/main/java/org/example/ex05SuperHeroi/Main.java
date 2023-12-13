package org.example.ex05SuperHeroi;

import org.example.ex05SuperHeroi.cli.Display;
import org.example.ex05SuperHeroi.exception.OpcaoInvalidaException;

public class Main {
    public static void main(String[] args) {

        try {

            Display display = new Display();
            display.exibirMenu();

        } catch (OpcaoInvalidaException e) {

            System.out.println("Erro: " + e.getMessage());

        }
    }
}
