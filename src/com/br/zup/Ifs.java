package com.br.zup;

import java.util.Scanner;

public class Ifs {
    public static void main(String[] args) {
        if (3 != 2) {
            System.out.println("Verdadeiro");
        }

        String nomeUm = "Iris";
        String nomeDois = "Iris";

        if (nomeUm.equals(nomeDois)) {
            System.out.println("Verdadeiro");
        }

        String nome = new Scanner(System.in).nextLine();

        if ("Vinicius".equals(nome)) {
            System.out.println("Voce é o Vinicius");
        } else if ("Marco".equals(nome)) {
            System.out.println("Voce é o Marco");
        } else {
            System.out.println("Eu não te conheço");
        }

    }
}
