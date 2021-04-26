package com.bytebank.app;

public class Conta {
    private double _saldo;
    private int agencia; // atributos da classe Conta insto é apenas uma especificaçao do obejeto;
    private int numeroConta;
    private Cliente titular;
    private static int total;
    //Construtor
    public Conta(int agencia, int numeroConta, Cliente titular) {
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.titular = titular;
        System.out.println("\nConta criada com sucesso! Titular da Conta; " + this.titular.getNome());
        Conta.total++;
        System.out.println("O total de contas é " + Conta.total);
    }

    // getters e setters
    // saldo(nao há setter para o saldo)
    public double getSaldo() {
        return this._saldo;
    }

    // Agencia
    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getAgencia() {
        return this.agencia;
    }

    // Numero Da Conta
    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public int getNumeroConta() {
        return this.numeroConta;
    }

    // Titular
    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getTitular() {
        return this.titular;
    }

    // total de contas
    public static int getTotal() {
        return Conta.total;
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
            System.out.println(this.getTitular().getNome() + ", tranferencia realizada com sucesso para "
                    + contaDestino.getTitular().getNome() + " No valor de > R$" + valor);
            return true;
        } else {
            System.out.println("_saldo Insuficiente");
            return false;
        }
    }

}
