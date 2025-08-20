package com.mycompany.cjava.alp2.unidade1;

import java.util.Scanner;

/**
 *
 * @author Rafael
 */
public class Cjava4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num, ant, suc;
        
        System.out.println("Digite um numero inteiro:");
        num = entrada.nextInt();
        
        ant = num - 1;
        suc = num + 1;
        
        System.out.println("Com base no numero " + num 
                            + "\n o seu antecessor é : " + ant
                            + "\n e o seu sucessor é : " + suc);
    }
    
}
