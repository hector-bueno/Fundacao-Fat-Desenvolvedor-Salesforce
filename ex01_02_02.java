// 2-2 Faça um algoritmo que leia o nome e a altura de uma pessoa e exiba uma mensagem dizendo "Nome, você tem X metros de altura".

import java.util.Scanner;

public class ex01_02_02 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Por Favor Insira seu Nome Completo:");
        String nome = ler.nextLine();

        System.out.println("Por Favor Insira sua Altura:");
        float altura = ler.nextFloat();

        // System.out.print(nome + ", você tem " + altura + " metros de altura");
        System.out.printf(nome + ", você tem " + altura + " metros de altura");
        // System.ot.println(nome + ", você tem " + altura + " metros de altura");

    }
}
