package com.br.zup;

import java.util.Scanner;

public class Calculadora {
    /* Faça um programa que peça dois números para o usuário e um operador, baseado no operador
     que o usuário digitar
     o programa deve realizar a operação de soma, subtração, multiplicação ou divisão. */
    public static void main(String[] args){
        System.out.println("Digite um número");
        int numeroUm = new Scanner(System.in).nextInt();
        System.out.println("Digite outro número");
        int numeroDois = new Scanner(System.in).nextInt();
        System.out.println("Digite um operador");
        String operador = new Scanner(System.in).nextLine();


        if(operador.equals("+")){
            int totalSoma = numeroUm + numeroDois;
            System.out.println("O total da soma é: "+ totalSoma);
        } else if(operador.equals("-")){
            int totalSubtracao = numeroUm - numeroDois;
            System.out.println("O total da subtração é: "+ totalSubtracao);
        } else if(operador.equals("*")){
            int totalMultiplicacao = numeroUm * numeroDois;
            System.out.println("O total da multiplicação é: "+ totalMultiplicacao);
        } else if(operador.equals("/")) {
            int totalDivisao = numeroUm / numeroDois;
            System.out.println("O total da divisão é: " + totalDivisao);
        }
    }
}
