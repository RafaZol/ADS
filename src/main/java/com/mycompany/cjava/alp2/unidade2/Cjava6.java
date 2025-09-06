package com.mycompany.cjava.alp2.unidade2;

import java.util.Scanner;

/**
 * Construa um programa que receba a idade de uma pessoa
 * e identifique sua classe eleitoral
 * idade menor que 16 não vota
 * idade maior que 16, menor que 18 e maior que 65, facultativo
 * idade igual ou maior a 18 e menor que 65, obrigatório.
 *
 * @author Rafael
 */

public class Cjava6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Eleições");
        System.out.print("Digite seu nome :\n >");
        String nome = entrada.next();
        System.out.print("Digite sua idade : \n >");
        int idade = entrada.nextInt();
        String msg = "Prezado(a) " + nome + ", ";
        if (idade < 15){
            msg += "Você ainda não atingiu idade suficiente para poder se tornar um eleitor.";
        } else if (idade >= 16 && idade < 18) {
            msg += "Você já atingiu a idade para se tornar um eleitor, porém não é obrigatório \n " +
                    "caso deseje, dirija-se até o cartório de sua cidade para emitir seu titulo.";
        } else if (idade >= 18) {
            msg += "Você já tem idade para se tornar um eleitor, de forma obrigatória perante a lei, \n" +
                    "dirija-se até o cartório de sua cidade para emitir seu titulo.";
        } else if (idade >= 65) {
            msg = "Você não precisa mais se preocupar com obrigações eleitorais, aproveite e descanse.";
        }
        System.out.println(msg);
    }
}
