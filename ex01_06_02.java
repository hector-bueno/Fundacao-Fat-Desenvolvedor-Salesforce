// 6-2 Desenvolva um algoritmo que leia um vetor de 5 posições e exiba os elementos em ordem inversa.

import java.util.Scanner;

public class ex01_06_02 
{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int[] lista = new int[3];

        for (int i = 0; i < lista.length; i++) {
            System.out.println("Insira o "+ (i+1) + " Valor.");
            lista[i] = ler.nextInt();
        }

        for (int i = lista.length-1; i >= 0; i--) {
            System.out.println(lista[i]);
        }

        ler.close();
    }
}
