package com.mycompany.cjava.alp2.unidade2;

import java.util.Scanner;

/**
 * Ecreva um programa que permita o usuário escolher
 * qual operação deseja realizar com dois números,
 * (soma, subtração, multiplicação ou divisão)
 * e retorne o resultado da operação.
 *
 * @author Rafael
 */
public class Cjava3 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        double n1, n2, soma;
        System.out.println("Digite o primeiro numero : ");
        n1 = ent.nextDouble();
        System.out.println("Digite o segundo numero : ");
        n2 = ent.nextDouble();
        
        System.out.println("selecione a opção ");
        System.out.println("1-Soma: ");
        System.out.println("2-Subtração ");
        System.out.println("3-Multiplicação ");
        System.out.println("4-Divisão ");
        int op = ent.nextInt();
        
        switch (op) {
            case 1:
                soma = n1 + n2;
                break;
            case 2:
                soma = n1 - n2;
                break;
            case 3:
                soma = n1 * n2;
                break;
            case 4: 
                soma = n1 / n2;
                break;
            default:
                System.out.println("Opção invalida");
                throw new AssertionError();
        }
        if(soma != 0){
            System.out.println("o resultado é " + soma);
        }
    }
}
