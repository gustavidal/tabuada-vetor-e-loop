package br.senai.sp.jandira.tabuada.model;

import java.util.Scanner;

public class Usuario {

    int multiplicando;
    int multiplicadorInicial;
    int multiplicadorFinal;
    int resultado;

    public void obterInfomacoes(){
        Scanner leitor = new Scanner(System.in);

        System.out.print("Informa de qual número será a tabuada: ");
        multiplicando = leitor.nextInt();

        System.out.print("Informe qual será o número a qual iniciará a multiplicação: ");
        multiplicadorInicial = leitor.nextInt();

        System.out.print("Informe qual será o número a qual terminará a multiplicação: ");
        multiplicadorFinal = leitor.nextInt();

        System.out.println(multiplicando);
        System.out.println(multiplicadorInicial);
        System.out.println(multiplicadorFinal);
    }
}
