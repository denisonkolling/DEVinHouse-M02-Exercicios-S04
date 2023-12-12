package org.example.ex02Sobrescrita;

public final class Gerente extends Funcionario{

    @Override
    public String obterCargo() {
        return "Sou Gerente";
    }

}
