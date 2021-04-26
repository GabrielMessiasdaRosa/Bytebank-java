package com.bytebank.app;

public class CriaConta {
    public static void main(String[] args) {
        // primeiraConta

        Conta primeiraConta = new Conta(1001, 123456, new Cliente("Gabriel Messias da Rosa", "012.345.678.99"));
        // segundaConta
        Conta segundaConta = new Conta(1001, 654321, new Cliente("Mariele Aparecida Gusmao", "987.654.321.11"));

        // programa em si
        System.out.println();
        System.out.println("Bem vindo(a), " + primeiraConta.getTitular().getNome() + ", ao ByteBank");
        System.out.println("Seu saldo é de : R$" + primeiraConta.getSaldo());
        System.out.println("Numero da conta : " + primeiraConta.getNumeroConta());
        System.out.println("Sua agencia é : " + primeiraConta.getAgencia());
        System.out.println();
        primeiraConta.deposita(5000);
        System.out.println("Seu saldo é de : R$" + primeiraConta.getSaldo());
        System.out.println();
        primeiraConta.saca(2500);
        System.out.println("Seu saldo é de : R$" + primeiraConta.getSaldo());
        System.out.println();
        primeiraConta.transfere(100, segundaConta);
        System.out.println("Seu saldo é de : R$" + primeiraConta.getSaldo());

        System.out.println();
        System.out.println("Bem vindo(a), " + segundaConta.getTitular().getNome() + ", ao ByteBank");
        System.out.println("Seu saldo é de : " + segundaConta.getSaldo());
        System.out.println("Numero da conta : " + segundaConta.getNumeroConta());
        System.out.println("Sua agencia é : " + segundaConta.getAgencia());
        System.out.println();

    }
}
