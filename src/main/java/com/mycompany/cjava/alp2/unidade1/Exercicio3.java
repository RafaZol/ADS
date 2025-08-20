package com.mycompany.cjava.alp2.unidade1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Rafael
 */
public class Exercicio3 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        
        double n1 = 0, n2 = 0, n3 = 0, n4 = 0, media = 0, soma = 0;
        List<Double> notas = new ArrayList<>();
        notas.add(n1);
        notas.add(n2);
        notas.add(n3);
        notas.add(n4);
        
        for(int i = 0; i < notas.size(); i++){
            System.out.println("Digite a nota " + i + ":");
            soma += ent.nextDouble();
        }
        
        media = soma / notas.size();
        
        System.out.println("A média é : " + media);
        
    }
    
       
}
