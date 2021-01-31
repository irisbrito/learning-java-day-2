package com.br.zup;

import java.util.Scanner;

public class MenuCleanedCode {
    public static void main(String[] args){
        String tipo= "";
        String som="";
        System.out.println("De qual animal vc vai digitar o nome: \ngato \ncachorro \ngalo");
        String resposta = new Scanner(System.in).nextLine();

        System.out.println("Digite o nome");
        String nome = new Scanner(System.in).nextLine();

        if(resposta.equalsIgnoreCase("gato")){
            som = "miau";
        }else if(resposta.equalsIgnoreCase("cachorro")) {
            som = "auau";
        } else if(resposta.equalsIgnoreCase("galo")){
            som = "cocoricó";
        }
        System.out.println("Meu " + resposta + " se chama " + nome + " e faz " + som);
    }
}
