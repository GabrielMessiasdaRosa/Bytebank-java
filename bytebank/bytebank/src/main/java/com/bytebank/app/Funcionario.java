package com.bytebank.app;

public class Funcionario {
    private String nome;
    private String cpf;
    private double salario;
    private int tipo = 0;
    private static int totalFuncionarios;


    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getTipo() {
        return this.tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }




    public Funcionario(String nome, String cpf, double salario ){
        
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        System.out.println("\nFuncionario cadastrado com sucesso! Carta de boas vindas enviada para " + this.nome);
        Funcionario.totalFuncionarios++;
        System.out.println("O total de funcinarios é " + Funcionario.totalFuncionarios);

    }

    public double getBonificacao(){
        if (this.tipo == 0){
            return this.salario * 0.1;
        }else if (this.tipo == 1){
            return this.salario + this.salario;
        }else if (this.tipo == 2){
            return this.salario + (this.salario * 2);
        }
        return salario;
    }


    //0=funcionario Comum - 1=Gerente - 2=Diretor

}