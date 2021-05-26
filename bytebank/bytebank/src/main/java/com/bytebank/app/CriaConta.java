package com.bytebank.app;

import java.util.*;

public class CriaConta {

    private String nomeTitular;
    private String cpfTitular;
    private int agencia;
    private int numeroConta;

    public Conta criaConta() {

        Scanner input = new Scanner(System.in);

        System.out.println("Nome do titular > ");
        this.nomeTitular = input.nextLine();

        System.out.println("CPF do Titular");
        this.cpfTitular = input.nextLine();

        System.out.println("Qual sera a agencia do titular ? ");
        this.agencia = input.nextInt();

        System.out.println("Defina um numero para a conta do titular (Metodo provisorio)");
        this.numeroConta = input.nextInt();

        Conta contaCriada = new Conta(agencia, numeroConta, new Cliente(nomeTitular, cpfTitular));
        System.out.println(contaCriada);
        return contaCriada;

    }

    

}
