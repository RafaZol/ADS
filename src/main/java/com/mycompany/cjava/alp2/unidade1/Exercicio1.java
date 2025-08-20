package com.mycompany.cjava.alp2.unidade1;

import java.util.Scanner;

/**
 *
 * @author Rafael
 */
public class Exercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite seu nome : ");
        String nome = entrada.next();
        
        System.out.printf("Bem Vindo a disciplina de Algoritmos e Lógica de Programação, %s", nome);
    }
}
