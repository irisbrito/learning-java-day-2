package com.br.zup;

import java.util.Scanner;

public class MaiorNumero {
    //Exercício 2 - receber 2 números e mostrar no console o maior deles
    public static void main(String[] args){
        System.out.println("Digite um número");
        int numero = new Scanner(System.in).nextInt();
        System.out.println("Digite outro número");
        int numero2 = new Scanner(System.in).nextInt();

        if(numero > numero2){
            System.out.println("O maior número informado é " + numero);
        } else if(numero == numero2) {
            System.out.println("Os números informados são iguais: " + numero2);
        } else {
            System.out.println("O maior número informado é " + numero2);

        }
    }
}
