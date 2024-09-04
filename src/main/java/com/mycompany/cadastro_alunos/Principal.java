package com.mycompany.cadastro_alunos;

import java.util.Scanner;
import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       Menu menu = new Menu();
        for(;;){
            menu.menuPrincipal();
        }
        
    }             
}