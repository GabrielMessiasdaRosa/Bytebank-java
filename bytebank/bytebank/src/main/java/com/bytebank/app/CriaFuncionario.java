package com.bytebank.app;
import java.util.*;
public class CriaFuncionario {
    
        
    
        private String nomeFuncionario;
        private String cpfFuncionario;
        private double salario;
        
    
        public Funcionario cadastraFuncionario() {
    
            Scanner input = new Scanner(System.in);
    
            System.out.println("Nome do Funcionario > ");
            this.nomeFuncionario = input.nextLine();
    
            System.out.println("CPF do Funcionario");
            this.cpfFuncionario = input.nextLine();
    
            System.out.println("Qual sera o salario do funcionario? ");
            this.salario = Double.parseDouble(input.nextLine());
    
            Funcionario  funcionarioCadastrado = new Funcionario(nomeFuncionario, cpfFuncionario, salario);
            return funcionarioCadastrado;
    
        }
    
    }
    





