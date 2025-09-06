package com.mycompany.cjava.alp2.unidade2;

import java.util.Scanner;

/**
 * Esccreva um programa que receba um número inteiro e se,
 * este numero for par imprima sua raiz quadrada, senão,
 * imprima o número ao quadrado.
 *
 * @author Rafael
 */
public class Cjava2 {
    public static void main(String[] args) {
        /*Objeto que captura os dados inseridos no teclado*/
        Scanner ent = new Scanner(System.in);
        /*Variaveis para receber o resultado da raiz ou da elevação do numero*/
        double raiz = 0, quadrado = 0;
        
        /*interação com o usuário*/
        System.out.println("Digite o numero : ");
        /*variavel que recebera oque for digitado no teclado*/
        double num = ent.nextDouble();
        /*Caso o resultado da divisão de num por 2 for resto 0, condição é verdadeira e faz a raiz*/
        if(num % 2 == 0){
            System.out.println("O numero é par");
            System.out.printf("sua raiz é : %.0f", Math.sqrt(num));
        }
        /*Caso o resultado da divisão de num por 2 não for resto 0, condição é falsa e faz a elevação*/
        else {
            System.out.println("O numero é impar");
            System.out.printf("e seu quadrado é %.0f", num * num);
        }
        
    }
}
