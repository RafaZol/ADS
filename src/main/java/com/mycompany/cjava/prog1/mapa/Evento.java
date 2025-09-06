package com.mycompany.cjava.prog1.mapa;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Rafael
 */
public class Evento {
    private String nome;
    private Date data;
    private double valor;
    private int qtdMax;
    private List<Ingresso> totalVendidos = new ArrayList<>();
    private static List<Evento> todosEventos;

    public Evento(String nome, String data, double valor, int qtdMax) {
        this.nome = nome;
        this.data = dataConvertida(data);
        this.valor = valor;
        this.qtdMax = qtdMax;
    }

    private Date dataConvertida(String dataS) {
        try {
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
            data = format.parse(dataS);
            return data;
        } catch (Exception e) {
            return new Date();
        }
    }

    public static boolean cadastrarEvento() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o nome do evento :");
        String nome = entrada.next();
        System.out.println("Digite a data do evento no formato 10/04/2000");
        String dataEv = entrada.next();
        System.out.println("Digite o valor do ingresso ");
        double valorI = entrada.nextDouble();
        System.out.println("Digite a Quantidade Maxima de pessoas :");
        int qtd = entrada.nextInt();
        System.out.println("Continuar ? s, Desistir ? n");
        String cont = entrada.next();

        if (cont.equals("s") || cont.equals("S")) {
            todosEventos = new ArrayList<>();

            Evento evento = new Evento(nome, dataEv, valorI, qtd);
            todosEventos.add(evento);
            return true;
        }
        return false;
    }

    public static void venderIngresso() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o numero correspondente do Evento");
        int opc = entrada.nextInt();

        if(todosEventos == null){
            System.out.println("Nenhum evento encontrado pelo indice informado!");
            return;
        }

        for(int i =0; i < todosEventos.size(); i++){
            if(i == todosEventos.size() - 1){
                Ingresso.cadastrarIngressoEvento(todosEventos.get(i));
                break;
            }
        }
    }

    public static boolean excluir() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o numero correspondente do Evento que deseja excluir");
        int opc = entrada.nextInt();
        System.out.println("Tem certeza que deseja excluir o evento ? s/n");
        String conf = entrada.next();
        entrada.nextLine();
        if(conf.equals("n") || conf.equals("N")){
            return false;
        }

        for(int i =0; i < todosEventos.size(); i++){
            if(i == todosEventos.size() - 1){
                todosEventos.remove(i);
                return true;
            }
        }
        return false;
    }

    public static void eventos() {
        if(todosEventos.isEmpty()){
            System.out.println("Nenhum evento Cadastrado");
            return;
        }
        
        for (int i = 0; i < todosEventos.size(); i++){
            System.out.println((i+1) +" - " + todosEventos.get(i).toString() + "\n");
        }
    }

    public static void ingressosPorEvento() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o numero correspondente do Evento");
        int opc = entrada.nextInt();
        entrada.nextLine();
        for(int i =0; i < todosEventos.size(); i++){
            if(i == todosEventos.size() - 1){
                List<Ingresso> ingressos = Ingresso.getIngressosVendidosPorEvento(todosEventos.get(i));
                if(ingressos != null){
                    for(Ingresso ing : ingressos){
                        System.out.println(ing.toString());
                    }
                }
                break;
            }
        }
    }

    @Override
    public String toString() {
        String ingressosDisponiveis = qtdMax - (totalVendidos== null ? 0 : totalVendidos.size()) + "";
        return "Evento: " + nome + " \n"
                + " Save The Date : " + data + "\n"
                + " Ingressos disponiveis : " + ingressosDisponiveis;
    }

    public double getValor(){
        return this.valor;
    }
}
