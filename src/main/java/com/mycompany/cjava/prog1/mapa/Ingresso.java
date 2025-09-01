package com.mycompany.cjava.prog1.mapa;

import java.util.ArrayList;
import java.util.List;
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
    private static List<Ingresso> ingressosVendidos = new ArrayList<>();

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

    public static boolean cadastrarIngressoEvento(Evento evento) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("1 - Pista");
        System.out.println("2 - VIP");
        System.out.println("3 - CAMAROTE");
        int opc = entrada.nextInt();
        double valorIngresso = evento.getValor();
        System.out.println("Informe o nome do Cliente : ");
        String nome = entrada.next();
        System.out.println("Informe o cpf sem . e - : ");
        String cpf = entrada.next();
        Ingresso ingresso = new Ingresso(valorIngresso, opc, nome, cpf, evento);
        if(ingressosVendidos.add(ingresso)){
            return true;
        }
        return false;
    }

    public static List<Ingresso> getIngressosVendidosPorEvento(Evento evento){
        List<Ingresso> ingressoEvento = new ArrayList<>();
        for(Ingresso i : ingressosVendidos){
            if(i.evento.equals(evento)){
                ingressoEvento.add(i);
            }
        }
        if(ingressoEvento.isEmpty()){
            System.out.println("Nenhum Ingresso vendido neste evento");
            return null;
        }

        return ingressoEvento;
    }

    public String toString() {
        return "Nome: " + nome + "\nCPF: " + cpf + "\nValor: " + valor + "\nEvento: " + evento.toString() + "\b";
    }



}
