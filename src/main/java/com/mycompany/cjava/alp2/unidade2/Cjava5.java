package com.mycompany.cjava.alp2.unidade2;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * Elabore um programa que receba o nome e a idade de uma pessoa
 * e informe o nome, a idade, e o valor da mensalidade do plano de saúde.
 *
 * @author Rafael
 */

public class Cjava5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Plano de Saúde");
        System.out.println("Informe seu nome:");
        String nome = entrada.next();
        System.out.print("Informe sua Idade : \n -> ");
        int idade = entrada.nextInt();

        System.out.println(nome);
        System.out.println(idade+"");
        String msg = "O valor do plano para sua faixa etária de idade é R$ ";
        if (idade > 0 && idade <= 18){
            msg += 50;
        } else if (idade >=19 && idade <= 29) {
            msg += 70;
        } else if (idade >= 30 && idade <= 45) {
            msg += 90;
        } else if (idade >= 46 && idade <= 65) {
            msg += 130;
        } else if (idade >= 65 && idade <= 120) {
            msg += 170;
        } else {
            msg = "Idade informada é inválida, por favor verifique!";
        }
        System.out.println(msg);
    }
}
