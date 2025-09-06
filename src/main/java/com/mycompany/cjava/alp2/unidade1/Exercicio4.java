package com.mycompany.cjava.alp2.unidade1;

import java.util.Scanner;

/**
 * Escreva um programa que, dado o raio de um circulo, calcule
 * sua área e o perímetro.
 *
 * @author Rafael
 */
public class Exercicio4 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        
        System.out.println("Digite o raio: ");
        Double raio = ent.nextDouble();
        Double area = raio * raio;
        area *= Math.PI;
        Double perimetro = raio * 2;
        perimetro *= Math.PI;
        
        System.out.printf("Dado raio %.0f: \n", raio);
        System.out.printf("Sua area é : %.4f \n", area);
        System.out.printf("e seu perimetro é: %.4f", perimetro);
        
        
        
        
        
    }
}
