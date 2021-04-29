package com.bytebank.app;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        menu();
        System.out.println("TUDO FOI APAGADO ! SISTEMA EM FASE DE DESENVOLVIMENTO ");
    }

    static void menu() { // menu principal
        Scanner input = new Scanner(System.in);
        int opcao = 0;
        do {
            System.out.println("\n\n### bBSYS - Sistema byteBank ###");
            System.out.println("\n              #############################");
            System.out.println("              |     1 - Cria Conta        |");
            System.out.println("              |     2 - Cria Funcionario  |");
            System.out.println("              |     3 - Listar contas     |");
            System.out.println("              |     0 - Sair              |");
            System.out.println("              #############################\n");

            opcao = input.nextInt();
            System.out.print("\n");
            switch (opcao) {
            case 1:
                CriaConta criaConta = new CriaConta();
                criaConta.criaConta();
                break;
            case 2:
                CriaFuncionario criaFuncionario = new CriaFuncionario();
                criaFuncionario.cadastraFuncionario();
                break;
            case 3:
                ListaDeContas listaDeContas = new ListaDeContas();
                listaDeContas.listarContas();
                break;
            case 0:
                break;
            default:
                System.out.println("Opção Inválida!");
                break;
            }
        } while (opcao != 0);
        return;
    }

}
