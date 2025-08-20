package com.mycompany.cjava.alp2.unidade2;

import java.util.Scanner;

/**
 *
 * @author Rafael
 */
public class Cjava4 {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        System.out.println("Digite o numero");
        int num = ent.nextInt();
        if(num % 5 == 0){
            System.out.printf("O numero %d é divisivel por 5", num);
        } else {
            System.out.printf("O numero %d não é divisivel por 5", num);
        }
        
        

    }
}
