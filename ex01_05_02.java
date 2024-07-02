// 5-2 Faça um algoritmo que leia 5 números e exiba a soma deles usando a estrutura "enquanto".

import java.util.Locale;
import java.util.Scanner;

public class ex01_05_02 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        ler.useLocale(Locale.US);

        int i = 1;
        int soma = 0;

        while (i <= 5) {
            System.out.println("Insira o " + i + "º número:");
            int num = ler.nextInt();

            soma = soma + num;

            i++;
        }

        System.out.print("A soma dos valores é: " + soma);
        ler.close();
    }
}
