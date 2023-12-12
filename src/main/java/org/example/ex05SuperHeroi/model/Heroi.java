package org.example.ex05SuperHeroi.model;

public class Heroi extends Personagem{

    private String nomeVidaReal;

    public Heroi(String nomeVidaReal, String nome, String superpoder) {
        super(nome, superpoder);
        this.nomeVidaReal = nomeVidaReal;
    }

    @Override
    public String toString() {
        return "Heroi{" +
                "nomeVidaReal='" + nomeVidaReal + '\'' +
                '}';
    }
}
