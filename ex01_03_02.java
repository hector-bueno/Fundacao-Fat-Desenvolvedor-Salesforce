// 3-2 Faça um algoritmo que leia três números e exiba se todos são iguais.

import java.util.Scanner;

public class ex01_03_02 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Insira o Primeiro Valor.");
        int n1 = ler.nextInt();

        System.out.println("Insira o Segundo Valor.");
        int n2 = ler.nextInt();

        System.out.println("Insira o Terceiro Valor.");
        int n3 = ler.nextInt();

        if ((n1 == n2) && (n1 == n3)) {
            System.out.println("Os números são iguais");
        } else {
            System.out.println("Pelo menos Um dos Números é Diferente!");
        }

        ler.close();
    }        
}
