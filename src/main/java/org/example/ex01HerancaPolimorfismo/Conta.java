package org.example.ex01HerancaPolimorfismo;

abstract class Conta {

    protected double saldo;

    protected Conta(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    protected double obterSaldoAtual() {
        return saldo;
    }
}

