package com.mycompany.cjava.alp2.unidade1;

import java.util.Scanner;

/**
 * Elabore um programa que leia Nome, idade e o altura de uma pessoa
 * e exiba o nome, idade, altura e o ano de nascimento dela.
 * para saida de dados utilize a função printf.
 *
 * @author Rafael
 */
public class Cjava3 {
    public static void main(String[] args) {
        /*Leitor do teclado*/
        Scanner entrada = new Scanner(System.in);
        /*Variaveis*/
        int idade, ano;
        float altura;
        String nome;
        
        /*Entrada de dados*/
        System.out.println("Digite sem nome: ");
        nome = entrada.next(); //le a string
        
        System.out.print("Digite sua Idade: \n");
        idade = entrada.nextInt(); // le o inteiro digitado
        
        System.out.printf("Digite o %s Atual \n", "ano");
        ano = entrada.nextInt(); // le o inteiro digitado
        
        System.out.println("Digite sua Altura: ");
        altura = entrada.nextFloat();//le o float digitado
        
        /*Calculo da idade*/
        int anoDeNascimento = ano - idade;
        
        /*Saida de dados*/
        System.out.printf("Seu nome é %s \n",nome);
        System.out.printf("O ano atual é %d e a sua idade é " + idade + "\n", ano);
        System.out.printf("Você nasceu em %d \n", anoDeNascimento);
        System.out.printf("E sua Altura é:%f", altura);
   }
}
