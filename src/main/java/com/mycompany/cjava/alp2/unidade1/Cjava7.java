package com.mycompany.cjava.alp2.unidade1;

import java.util.Scanner;

/**
 *
 * @author Rafael
 */
public class Cjava7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        float n1, n2, total;
        
        System.out.println("Digite o primeiro numero : ");
        n1 = entrada.nextFloat();
        System.out.println("Digite o segundo numeto : ");
        n2 = entrada.nextFloat();
        
        total = (float) Math.pow(n1, n2); //cast obrigando o metodo de exponenciação retornar um float
        
        System.out.println("O numero " + n1 + " elevado a " + n2 + " é igual a " + total);
    }
}
