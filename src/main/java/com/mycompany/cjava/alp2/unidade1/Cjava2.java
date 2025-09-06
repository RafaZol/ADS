package com.mycompany.cjava.alp2.unidade1;

/**
 * Programa que apresenta alguns exemplos de uso da função
 * printf. para facilitar o entendimento.
 *
 * @author Rafael
 */
public class Cjava2 {
    public static void main (String[] args){
        System.out.println("Estou aprendendo a programar em Java"); //pula linha println
        System.out.printf("Estou lendo a %d unidade do livro \n", 1); // \n para pular a linha f de format
        System.out.printf("%s e uma disciplina importante do curso \n","esta"); //%d - inteiro, %s - string
        System.out.printf("%.2f", 57.25); // %f - ponto flutuante .2f - duas casas decimais
    }
}
