package org.example.ex03Interfaces;

public class Produto implements Tributavel{

    private double valor;
    private double valorImposto;

    public Produto(double valor, double valorImposto) {
        this.valor = valor;
        this.valorImposto = valorImposto;
    }

    @Override
    public double calcularValorComImposto() {
        return valor + valorImposto;
    }

}
