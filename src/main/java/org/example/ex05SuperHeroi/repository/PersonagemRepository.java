package org.example.ex05SuperHeroi.repository;

import org.example.ex05SuperHeroi.model.Personagem;

import java.util.ArrayList;
import java.util.List;

public class PersonagemRepository {

    private List<Personagem> listaPersonagens = new ArrayList<>();

    public void inserirPersonagem(Personagem personagem) {
        listaPersonagens.add(personagem);
    }

    public List<Personagem> consultarPersonagens() {
        return new ArrayList<>(listaPersonagens);
    }

}

