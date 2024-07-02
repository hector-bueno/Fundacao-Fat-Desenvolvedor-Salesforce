// 2-3 Desenvolva um algoritmo que leia um valor em reais e a cotação do dólar, e exiba o valor convertido para dólares.

import java.util.Locale;
import java.util.Scanner;

public class ex01_02_03 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        ler.useLocale(Locale.US);

        System.out.println("Insira o valor em Reais (R$) para ser convertido em Dólares (US$):");
        float reais = ler.nextFloat();

        System.out.println("Insira a cotação atual do dólar:");
        float cotacao = ler.nextFloat();

        System.out.printf("O valor convertido em Dólares é: R$ %.2f", (reais * cotacao));

        ler.close();
    }
}
