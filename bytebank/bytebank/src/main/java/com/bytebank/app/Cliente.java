package com.bytebank.app;

public class Cliente {

    private String nome;
    private String _cpf;
    
    //Construtor
    public Cliente(String nome, String _cpf) {
        this.nome = nome;
        this._cpf = _cpf;
    }

    // getters e setters

    // titular
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // CPF
    public String getCpf() {
        return this._cpf;
    }

    public void setCpf(String _cpf) {
        this._cpf = _cpf;
    }

}
