package com.bytebank.app;

public class CriaConta {
    public static void main(String[] args) {
//primeiraConta
        Conta primeiraConta = new Conta();

        primeiraConta.agencia = "0001";
        primeiraConta.numero = 1;
        primeiraConta.titular = "Gabriel Messias da Rosa";


//segundaConta
        Conta segundaConta = new Conta();

        segundaConta.agencia = "0001";
        segundaConta.numero = 2;
        segundaConta.titular = "Mariele Aparecida Gusmao";


//programa em si
        System.out.println();
        System.out.println("Bem vindo(a), " + primeiraConta.titular + ", ao ByteBank");
        System.out.println("Seu saldo é de : R$" + primeiraConta._saldo);
        System.out.println("Numero da conta : " + primeiraConta.numero);
        System.out.println("Sua agencia é : " + primeiraConta.agencia);
        System.out.println();
        primeiraConta.deposita(5000);
        System.out.println("Seu saldo é de : R$" + primeiraConta._saldo);
        System.out.println();
        primeiraConta.saca(2500);
        System.out.println("Seu saldo é de : R$" + primeiraConta._saldo);
        System.out.println();
        primeiraConta.transfere(100, segundaConta);
        System.out.println("Seu saldo é de : R$" + primeiraConta._saldo);

        
        System.out.println();
        System.out.println("Bem vindo(a), " + segundaConta.titular + ", ao ByteBank");
        System.out.println("Seu _saldo é de : " + segundaConta._saldo);
        System.out.println("Numero da conta : " + segundaConta.numero);
        System.out.println("Sua agencia é : " + segundaConta.agencia);
        System.out.println();


        

    }
}
