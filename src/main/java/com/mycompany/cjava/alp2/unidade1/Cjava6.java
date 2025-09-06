package com.mycompany.cjava.alp2.unidade1;

import java.util.Scanner;

/**
 * Faça um programa que receba um valor de depósito eo valor da taxa de juros,
 * calcule e apresente o valor do rendimento e o valor total.
 *
 * @author Rafael
 */
public class Cjava6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        float deposito, taxa, rendimento, total;
        
        System.out.println("Informe o valor de deposito : ");
        deposito = entrada.nextFloat();
        
        System.out.println("Informe o valor de taxa : ");
        taxa = entrada.nextFloat();
        
        rendimento = deposito * (taxa / 100);
        
        total = deposito + rendimento;
        
        System.out.println("o valor de rendimento é : " + rendimento);
        
        System.out.println("o valor total com rendimento é : " + total);
        
    }
}
