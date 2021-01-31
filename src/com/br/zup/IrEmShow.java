package com.br.zup;

import java.util.Scanner;

public class IrEmShow {
    /* Pode entrar no show: +18 anos e ter ingresso
    // && porta E (AND)
    // || porta ou (OR)

    * */
    public static void main(String[] args){
        System.out.println("Digite true ou false se você tem ingresso: ");
        boolean temIngresso = new Scanner(System.in).nextBoolean();
        System.out.println("Digite a idade: ");
        int idade = new Scanner(System.in).nextInt();
        boolean podeEntrar = (idade >= 18 && temIngresso);

        boolean teste = (idade < 18 ^ temIngresso);

        System.out.println(podeEntrar);
        System.out.println(teste);


        if(idade >= 18 && temIngresso){
            System.out.println("Pode entrar");
        } else {
            System.out.println("Você não pode entrar");
        }
    }

}
