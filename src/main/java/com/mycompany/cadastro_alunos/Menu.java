package com.mycompany.cadastro_alunos;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    
    private Scanner scanner;
    private ArrayList<Aluno> alunos = new ArrayList<Aluno>();
            
    public Menu(){
        this.scanner = new Scanner(System.in);
    }
    
    public void menuPrincipal(){
         System.out.println("------------- Menu -------------");
         System.out.println("       Cadastro de Alunos       ");
         System.out.println("[1] Cadastrar");
         System.out.println("[2] Alterar");
         System.out.println("[3] Listar Alunos");
         System.out.println("[4] Sair");
         System.out.println("--------------------------------");
         
         System.out.println("Digite a opcao escolhida:");
         int opcao = scanner.nextInt();
         
         switch(opcao){
             case 1:
                Aluno aluno = new Aluno();
                System.out.println("------------- Menu -------------");
                System.out.println("       Cadastro de Alunos       ");
                System.out.println("Matrícula: ");
                aluno.setMatricula(scanner.nextInt());
                scanner.nextLine();
                System.out.println("Nome: ");
                aluno.setNome(scanner.nextLine());
                System.out.println("email: ");
                aluno.setEmail(scanner.nextLine());
                System.out.println("--------------------------------");
                alunos.add(aluno);
                break;
             case 2:
                //alterar
                break;
             case 3:
                System.out.println("------------- Menu -------------");
                System.out.println("       Cadastro de Alunos       ");
                System.out.println("Matrícula: ");
                
                System.out.println("Nome: ");
                
                System.out.println("email: ");
                
                System.out.println("--------------------------------");
                break;               
             case 4:
                System.exit(0);
         }
   }
}
