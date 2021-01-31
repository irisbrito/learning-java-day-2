package com.br.zup;

public class Main {

    public static void main(String[] args){
        int[] numeros = new int[3];
        numeros[0] = 123;
        numeros[1] = 455;
        numeros[2] = 42;

        // > se for maior que outro
        // < se for menor que outro
        // == se for exatamente igual
        // != se for diferente do outro

        boolean eIgual = 3 == 3;
        System.out.println(eIgual);
        System.out.println(!eIgual);  // inverte a saída
        System.out.println(2 > 3);
        System.out.println(4 != 4);
        System.out.println(20 < 10);
        System.out.println(100 == 1);
        System.out.println(600 / 3);
        System.out.println(2 / 2 > 2);
        System.out.println(100 * 2 / 3 < 100);

        System.out.println(2 ^ 2);
    }
}
