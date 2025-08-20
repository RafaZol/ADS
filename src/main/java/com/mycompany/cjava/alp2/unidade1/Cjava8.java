package com.mycompany.cjava.alp2.unidade1;

import java.util.Scanner;

/**
 *
 * @author Rafael
 */
public class Cjava8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float n1, n2, altura, area;
        
        System.out.println("Digite o valor da base maior : ");
        n1 = entrada.nextFloat();
        System.out.println("Digite o valor da base menor : ");
        n2 = entrada.nextFloat();
        System.out.println("Digite o valor da altura : ");
        altura= entrada.nextFloat();
        area = n1 + n2;
        area = area * altura;
        area = area /2;
        System.out.printf("A area do trapézio é %.2f", area);
        
    }
}
