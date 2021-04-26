package com.bytebank.app;

public class CriaConta {
    public static void main(String[] args) {
//primeiraConta
        Conta primeiraConta = new Conta();

        primeiraConta.setAgencia(1001);
        primeiraConta.setNumeroConta(1230001);
        primeiraConta.setTitular("Gabriel Messias da Rosa");


//segundaConta
        Conta segundaConta = new Conta();

        segundaConta.setAgencia(1001);
        segundaConta.setNumeroConta(1230002);;
        segundaConta.setTitular("Mariele Aparecida Gusmao");;


//programa em si
        System.out.println();
        System.out.println("Bem vindo(a), " + primeiraConta.getTitular()+ ", ao ByteBank");
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
        System.out.println("Bem vindo(a), " + segundaConta.getTitular() + ", ao ByteBank");
        System.out.println("Seu _saldo é de : " + segundaConta.getSaldo());
        System.out.println("Numero da conta : " + segundaConta.getNumeroConta());
        System.out.println("Sua agencia é : " + segundaConta.getAgencia());
        System.out.println();


        

    }
}
