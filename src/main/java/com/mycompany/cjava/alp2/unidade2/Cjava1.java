package com.mycompany.cjava.alp2.unidade2;

import java.util.Scanner;

/**
 *  Escreva um programa que receba um número inteito,
 *  e se, este número for par, imprimir sua raiz quadrada.
 *
 * @author Rafael
 */
public class Cjava1 {
    public static void main(String[] args) {
        /*Objeto que captura os dados inseridos no teclado*/
        Scanner ent = new Scanner(System.in);
        /*variavel para receber o resultado do calculo da raiz quadrada*/
        double raiz = 0;
        /*interação com o usuário*/
        System.out.println("Digite um numero");
        /*Captura do numero digitado no teclado e associado a variavel*/
        int num = ent.nextInt();
        /*se a divisão de num por 2 for resto 0, o numero é par, entra na condição*/
        if(num % 2 == 0){
            /*calculo da raiz quadrada*/
            raiz = Math.sqrt(num);
            /*interação com o usuário*/
            System.out.printf("A raiz de " + num + " é %.2f", raiz);
        }
    }
}
