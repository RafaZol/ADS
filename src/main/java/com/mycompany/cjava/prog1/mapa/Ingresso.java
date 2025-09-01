package com.mycompany.cjava.prog1.mapa;

import java.util.Scanner;

/**
 *
 * @author Rafael
 */
public class Ingresso {

    private String nome;
    private String cpf;
    private double valor;
    private Evento evento;
    private static final int VIP = 30;
    private static final int CAMAROTE = 60;

    public Ingresso(double valor, int tipo, String nome, String cpf, Evento evento) {
        this.nome = nome;
        this.cpf = cpf;
        this.evento = evento;
        this.valor = calcularValor(valor, tipo);

    }

    private static double calcularValor(double valor, int tipo) {
        switch (tipo) {
            case 1:
                valor = valor;
                break;
            case 2:
                valor += valor * (VIP / 100);
                break;
            case 3:
                valor += valor * (CAMAROTE / 100);
                break;
            default:
                System.out.println("Opção invalida para tipo de ingresso");
                return 0;
        }
        return valor;
    }

    public static void cadastrarIngressoEvento(Evento evento) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("1 - Pista");
        System.out.println("2 - VIP");
        System.out.println("3 - CAMAROTE");
        int opc = entrada.nextInt();
        double valorIngrsso = calcularValor(evento.getValor(), opc);
        System.out.println("Informe o nome do Cliente : ");
        String nome = entrada.next();
        System.out.println("Informe o cpf sem . e - : ");
        String cpf = entrada.next();

    }

}
