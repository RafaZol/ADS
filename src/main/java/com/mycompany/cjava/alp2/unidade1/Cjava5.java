package com.mycompany.cjava.alp2.unidade1;

import java.util.Scanner;

/**
 * Elabore um programa que receba quatro notas e calcule
 * a média aritmética entre elas.
 *
 * @author Rafael
 */
public class Cjava5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float n1, n2, n3, n4, media;
        
        System.out.println("Digite a primeira nota : ");
        n1 = entrada.nextFloat();
        System.out.println("Digite a segunda nota : ");
        n2 = entrada.nextFloat();
        System.out.println("Digite a terceira nota : ");
        n3 = entrada.nextFloat();
        System.out.println("Digite a quarta nota : ");
        n4 = entrada.nextFloat();
        
        media = (n1 + n2 + n3 + n4) / 100;
        System.out.println("");
        System.out.println("");
        System.out.printf("A média entre as quatro notas é %.2f", media);
    }
}
