// Faça um procedimento que receba um vetor de 10 inteiros e exiba os valores na tela.

import java.util.Scanner;

/**
 * ex01_07_02
 */
public class ex01_07_02 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int[] lista = new int[3];

        for (int i = 0; i < lista.length; i++) {
            System.out.println("Insira o "+ (i+1) + " Valor.");
            lista[i] = ler.nextInt();
        }

        exibirLista(int[] lista);
    }

    public static void exibirLista(String[] lista) {
        for (int i = 0; i < lista.length; i++) {
            System.out.println(lista[i]);
        }
    }
}