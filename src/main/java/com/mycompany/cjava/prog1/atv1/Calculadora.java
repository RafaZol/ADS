package com.mycompany.cjava.prog1.atv1;

import java.util.Scanner;
import javax.swing.text.html.HTML;

/**
 *
 * @author Rafael
 */
public class Calculadora {

    public static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        double valor = 0;
        double resultado = 0;
        int opc = 0;

        while (opc != 6) {

            if (resultado == 0) {
                System.out.println("Digite o primeiro numero : ");
                resultado = entrada.nextDouble();
            }

            System.out.println("Digite o segundo Valor :");
            valor = entrada.nextDouble();

            opc = menu();

            switch (opc) {
                case 1:
                    resultado = NumberUtils.somar(resultado, valor);
                    break;
                case 2:
                    resultado = NumberUtils.subtrair(resultado, valor);
                    break;
                case 3:
                    resultado = NumberUtils.multiplicar(resultado, valor);
                    break;
                case 4:
                    resultado = NumberUtils.dividir(resultado, valor);
                    break;
                case 5:
                    resultado = 0;
                    valor = 0;
                    break;
                default:
                    System.out.println("Opcão inválida");
                    break;
            }
            System.out.printf("Rsultado : %.2f\n", resultado);
            System.out.println("Continuar ? [S/N]\n");
            String repete = entrada.next();
            if(repete.equals("N") || repete.equals("n")){
                opc = 6;
            }
        }

    }

    static private int menu() {
        System.out.println("Selecione a opção :");
        System.out.println("1 - Somar :");
        System.out.println("2 - Subtrair :");
        System.out.println("3 - Multiplicar :");
        System.out.println("4 - Dividir :");
        System.out.println("5 - Zerar :");
        System.out.println("6 - Sair :");
        return entrada.nextInt();
    }
}
