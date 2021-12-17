package com.company;
import java.util.ArrayList;
import java.util.stream.IntStream;

public class ListaFuncionarios {
    Funcionario funcionario;
    String nome;

    ListaFuncionarios(String nome){
        this.nome = nome;
    }

    ArrayList<Funcionario> lista = new ArrayList<>();

void adicionaFuncionario(){
    IntStream.range(0, lista.size()).forEach(i -> lista.add(funcionario));
    }


void mostraListadeFuncionarios(){
    for (Funcionario funcionario: lista
    ) {
        System.out.println(lista);
    }
}
}
