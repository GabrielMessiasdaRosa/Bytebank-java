package com.bytebank.app;

public class Conta {
    double saldo;
    String agencia; // atributos da classe Conta insto é apenas uma especificaçao do obejeto;
    int numero;
    String titular;

    // comportamentos da classe Conta

    public void deposita(double valor) {
        if (valor > 0) {
            this.saldo = saldo + valor;
            System.out.println("Depositado R$" + valor);
        }
        return;

    };

    public void sacar(double valor){
        if(this.saldo > 0 && valor <= this.saldo){
            this.saldo = saldo - valor;
            System.out.println("Sacado R$" + valor);
        }else{
            System.out.println("Saldo Insuficiente");
        }
        return;
    }
    public void transferir(double valor, Conta contaDestino){
        if(this.saldo > 0 && valor <= this.saldo){
            this.saldo = saldo - valor;
            contaDestino.saldo+=valor;
            System.out.println("Transferido o valor de R$"+valor+" Para "+contaDestino.titular);
        }else{
            System.out.println("Saldo Insuficiente");
        }
    }

}
