package com.bytebank.app;

public class CriaConta {
    public static void main(String[] args) {
        //primeiraConta
        Conta primeiraConta = new Conta();

        primeiraConta.saldo = 1200;
        primeiraConta.agencia = "0001";
        primeiraConta.numero = "0000001";
        primeiraConta.titular = "Gabriel Messias da Rosa";
        System.out.println();
        System.out.println("Bem vindo(a), " + primeiraConta.titular + ", ao ByteBank");
        System.out.println("Seu saldo é de : " + primeiraConta.saldo);
        System.out.println("Numero da conta : " + primeiraConta.numero);
        System.out.println("Sua agencia é : " + primeiraConta.agencia);
        System.out.println();


        //segundaConta
        Conta segundaConta = new Conta();

        segundaConta.saldo = 3500;
        segundaConta.agencia = "0002";
        segundaConta.numero = "0000002";
        segundaConta.titular = "Mariele Aparecida Gusmao";
        System.out.println();
        System.out.println("Bem vindo(a), " + segundaConta.titular + ", ao ByteBank");
        System.out.println("Seu saldo é de : " + segundaConta.saldo);
        System.out.println("Numero da conta : " + segundaConta.numero);
        System.out.println("Sua agencia é : " + segundaConta.agencia);
        System.out.println();


        

    }
}
