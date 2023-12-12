package org.example.ex05SuperHeroi.model;

public class Vilao extends Personagem {

    private Integer tempoDePrisao;

    public Vilao(String nome, String superpoder, Integer tempoDePrisao) {
        super(nome, superpoder);
        this.tempoDePrisao = tempoDePrisao;
    }

    @Override
    public String toString() {
        return "Vilao{" +
                "tempoDePrisao=" + tempoDePrisao +
                '}';
    }
}
