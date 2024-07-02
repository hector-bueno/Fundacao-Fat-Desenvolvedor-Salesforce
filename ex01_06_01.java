// 6-1 Crie um algoritmo que leia 10 números inteiros e exiba a média deles.

import java.util.Scanner;

public class ex01_06_01 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int[] lista = new int[3];
        int soma = 0;

        for (int i = 0; i < lista.length; i++) {
            System.out.println("Insira o "+ (i+1) + " Valor.");
            lista[i] = ler.nextInt();
        }

        for (int j : lista) {
            soma += j;
        }

        System.out.printf("o Total é: %d", soma);
        ler.close();
    }
}
