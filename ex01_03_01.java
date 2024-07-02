// 3-1 Crie um algoritmo que leia dois números e exiba se o primeiro é maior, menor ou igual ao segundo.

import java.util.Scanner;

public class ex01_03_01 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Insira o Primeiro Valor.");
        int n1 = ler.nextInt();

        System.out.println("Insira o Segundo Valor.");
        int n2 = ler.nextInt();

        if (n1 > n2) {
            System.out.println("O primeiro número é maior do que o segundo.");
        } else if (n1 < n2) {
            System.out.println("O segundo número é maior do que o primeiro.");
        } else {
            System.out.println("Os números são iguais.");
        }

        ler.close();
    }
}
