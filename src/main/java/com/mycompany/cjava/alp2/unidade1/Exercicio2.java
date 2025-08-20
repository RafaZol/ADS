package com.mycompany.cjava.alp2.unidade1;

import java.util.Scanner;

/**
 *
 * @author Rafael
 */
public class Exercicio2 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        
        System.out.println("Digite o numero que você quer saber o quadrado e a raiz quadrada :");
        int expoente = ent.nextInt();
        
        
        double raiz = Math.sqrt(expoente);
        
        System.out.printf("%d ao quadrado é : " + (expoente*expoente) + "\n"
                +   "e sua raiz quadrada é : " + raiz, expoente);
    }
}
