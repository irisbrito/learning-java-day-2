package com.br.zup;

import java.util.Scanner;

public class ParOuImpar {
    /* Faça um programa que ao receber um número do usuário apareça no console se o número é par ou ímpar.
     * */
    public static void main(String[] args){
        System.out.println("Digite um número");
        double numero = new Scanner(System.in).nextDouble();
        if(numero % 2 == 0){
            System.out.println("O número é Par");
        } else {
            System.out.println("O número é Impar");
        }
    }
}
