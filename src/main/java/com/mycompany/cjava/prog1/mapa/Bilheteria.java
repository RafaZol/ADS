package com.mycompany.cjava.prog1.mapa;

import java.util.Scanner;

/**
 *
 * @author Rafael
 */
public class Bilheteria {

    public static void main(String[] args) {
        menu();
    }

    private static void menu() {
        Scanner entrada = new Scanner(System.in);
        int opc = 0;
        while (opc != 5) {
            System.out.println("Selecione sua Opção: ");
            System.out.println(" 1 - Cadastrar Evento:");
            System.out.println(" 2 - Vender ingresso");
            System.out.println(" 3 - Listar Eventos");
            System.out.println(" 4 - Excluir Evento");
            System.out.println(" 4 - Sair");
            opc = entrada.nextInt();
            switch (opc) {
                case 1 :
                    Evento.cadastrarEvento();
                    break;
                case 2 :
                    Evento.venderIngresso();
                    break;
                case 3 :
                    Evento.eventos();
                    break;
                case 4 :
                    Evento.excluir();
                default:
                    System.out.println("Opção inavalida");
            }
        }
    }
}
