package com.company;
import java.util.ArrayList;

public class ListaFuncionarios {
    Funcionario funcionario;
    String nome;

    ListaFuncionarios(String nome){
        this.nome = nome;
    }

    ArrayList<Funcionario> lista = new ArrayList<>();

void adicionaFuncionario(){
    for (Funcionario funcionario: lista
         ) {
    lista.add(this.funcionario);
    }
}

void mostraListadeFuncionarios(){
    for (Funcionario funcionario: lista
    ) {
        System.out.println(lista);
    }
}
}
