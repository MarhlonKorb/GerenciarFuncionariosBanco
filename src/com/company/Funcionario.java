package com.company;
import java.util.Scanner;

public class Funcionario {
    Scanner leitor = new Scanner(System.in);

    String nome;
    String rg;
    String dataInicio;
    double salario;
    double bonificacao;
    double salarioAnual;

    Funcionario() {}

    Funcionario(String nFuncionario, String rgFuncionario, String dataInicial, double salario, double bonus) {
        this.nome = nFuncionario;
        this.rg = rgFuncionario;
        this.dataInicio = dataInicial;
        this.salario = salario;
        this.bonificacao = bonus;
    }

    void menu(){
        System.out.println("---- MENU ----");
        System.out.println("Escolha uma opção");
        System.out.println("1 - Digitar dados do funcionario:");
        System.out.print("2 - Consultar dados do funcionário:");
        System.out.print("\n0 - Sair:");
        int escolhido = leitor.nextInt();

        if (escolhido == 1){
            lerDadosFuncionario();
        }
        else if (escolhido == 2){
            dadosFuncionario();
        }
        else if (escolhido == 0){
            System.out.println("\n----- Programa encerrado -----");
        }
        else{opcaoInvalida();
        }
    }

    void lerDadosFuncionario() {
        nome();
        getRg();
        dataInicio();
        salario();
        ganhoAnual();
        ganhoAnualComBonificacao(bonificacao);
        taxaBonus();
        dadosFuncionario();

        leitor.close();
    }

    void dadosFuncionario() {
        if (this.nome != null){
        System.out.println("Nome do funcionário: " + this.nome.toLowerCase());}
        else{
            System.out.println("Nome: não informado");
        }
        System.out.println("RG: " + this.rg);
        System.out.println("Data de início: " + this.dataInicio);
        System.out.println("Salário(R$): " + this.salario);
        System.out.println("Taxa de bonus(%): " + this.bonificacao);
        System.out.println("Salário com bonificação(R$): " + salarioComBonificacao(this.bonificacao));
        System.out.println("Projeção do salário anual sem bonificação(R$): " + this.salarioAnual);
        System.out.println("Projeção do salário anual com bonificação de "+this.bonificacao+"(%): " + ganhoAnualComBonificacao(this.bonificacao));
    }

    void nome() {
        System.out.println("Digite o nome do funcionário: ");
        this.nome = leitor.next();
    }

    void getRg() {
        System.out.println("Digite o RG do funcionário: ");
        this.rg = leitor.next();
        while (this.rg.length() != 10) {
            System.out.println("Quantidade de números incorreta!");
            getRg();
        }
    }

    void salario() {
        System.out.println("Digite o salário do funcionário: ");
        this.salario = leitor.nextDouble();
        if (this.salario < 0) {
            System.out.println("Esse campo não aceita valor negativo!");
            salario();
        }
    }

    void dataInicio() {
        System.out.println("Digite a data de entrada do funcionario: ");
        dataInicio = leitor.next();
        if(dataInicio.length() > 10 || dataInicio.length() < 6){
            dataInicio();
            System.out.println("Valor inválido para data!");
        }
    }

    void taxaBonus() {
        System.out.println("Digite a taxa de bonus do funcionário(%): ");
        this.bonificacao = leitor.nextDouble();
        if (this.salario < 0) {
            System.out.println("Esse campo não aceita valor negativo!");
            taxaBonus();
        }
    }

    void ganhoAnual() {
        salarioAnual = salario * 12;
    }

    double salarioComBonificacao(double bonificacao) {
        return (salario * bonificacao) / 100 + salario;
    }

    double ganhoAnualComBonificacao(double bonificacao) {
        return salarioComBonificacao(bonificacao) * 12;
    }

    void opcaoInvalida(){
        System.out.println("Opção inválida!\nSelecione uma opção válida.");
        menu();
    }
}
