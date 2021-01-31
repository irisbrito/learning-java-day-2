package com.br.zup;

import java.util.Scanner;

public class ExercicioMenu {
    /* Faça um programa que pergunte para o usuário qual o nome ele quer cadastrar:
     nome de cachorro, nome de gato, nome do galo, nome da praia favorita.
    O usuário deverá escolher uma dessas opções e digitar qual delas ele quer usar.
    Por último o programa de exibir uma frase específica para cada uma das opções.

    Caso cachorro : seu cachorro se chama NOME e faz au au
    Caso gato: seu gato se chama NOME e faz miau
    Caso galo: Meu galo se chama NOME e faz cocorocó
    Caso praia: Vamos para a praia NOME com u
    * */
    public static void main(String[] args){
        System.out.println("Digite o que deseja cadastrar: \n nome do gato \n nome do cachorro \n nome do galo \n nome da praia favorita");
        String cadastroNome = new Scanner(System.in).nextLine();
        if(cadastroNome.equalsIgnoreCase("nome do cachorro")){
            System.out.println("Digite o nome do cachorro");
            String nomeCachorro = new Scanner(System.in).nextLine();
            System.out.println("Seu cachorro se chama " + nomeCachorro + " e faz au au");

        } else if(cadastroNome.equalsIgnoreCase("nome do gato")){
            System.out.println("Digite o nome do gato");
            String nomeGato = new Scanner(System.in).nextLine();
            System.out.println("Seu gato se chama " + nomeGato + " e faz miau");

        } else if(cadastroNome.equalsIgnoreCase("nome do galo")){
            System.out.println("Digite o nome do galo");
            String nomeGalo = new Scanner(System.in).nextLine();
            System.out.println("Seu galo se chama " + nomeGalo + " e faz cocoricó");
        } else {
            System.out.println("Digite o nome da sua praia favorita");
            String nomePraia = new Scanner(System.in).nextLine();
            System.out.println("Vamos para a praia " + nomePraia + " com uma brasilia amarela");
        }

    }
}
