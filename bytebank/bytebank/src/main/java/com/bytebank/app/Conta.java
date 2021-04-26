package com.bytebank.app;

public class Conta {
    double _saldo;
    String agencia; // atributos da classe Conta insto é apenas uma especificaçao do obejeto;
    int numero;
    String titular;

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
