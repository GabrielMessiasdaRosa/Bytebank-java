package com.bytebank.app;

public class Conta {
    private double _saldo;
    private int agencia; // atributos da classe Conta insto é apenas uma especificaçao do obejeto;
    private int numeroConta;
    private String titular;
    
    //geters e seters
    //saldo(nao há seter para o saldo)
    public double getSaldo(){
        return this._saldo;
    }

    //Agencia
    public void setAgencia(int novaAgencia){
        this.agencia = novaAgencia;
    }
    public int getAgencia(){
        return this.agencia;
    }

    //Numero Da Conta
    public void setNumeroConta(int novoNumeroConta){
        this.numeroConta = novoNumeroConta;
    }
    public int getNumeroConta(){
        return this.numeroConta;
    }

    //Titular
    public void setTitular(String novoTitular){
        this.titular = novoTitular;
    }
    public String getTitular(){
        return this.titular;
    }





    // comportamentos da classe Conta

    public void deposita(double valor) {
        if (valor > 0) {
            this._saldo = _saldo + valor;
            System.out.println("Depositado R$" + valor);
        }
        return;

    };

    public boolean saca(double valor) {
        if (this._saldo > 0 && valor <= this._saldo) {
            this._saldo -= valor;
            System.out.println("Sacado R$" + valor);
            return true;
        } else {
            System.out.println("_saldo Insuficiente");
            return false;
        }
       
    }

    public boolean transfere(double valor, Conta contaDestino) {
        if (this._saldo > 0 && valor <= this._saldo) {
            this._saldo -= valor;
            contaDestino._saldo += valor;
            System.out.println("Transferido o valor de R$" + valor + "De "+this.titular+" Para " + contaDestino.titular);
            return true;
        } else {
            System.out.println("_saldo Insuficiente");
            return false;
        }
    }
    

}
