// 2-1 Crie um algoritmo que leia três números inteiros e exiba a média deles.

import java.util.Scanner;

public class ex01_02_01 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double n1;
        double n2;
        double n3;
        double media;

        System.out.println(": : : Média entre 3 números : : :");
        System.out.println("Informe o primeiro valor (inteiro):");
        n1 = ler.nextDouble();
        
        System.out.println("Informe o segundo valor (inteiro):");
        n2 = ler.nextDouble();
        
        System.out.println("Informe o terceiro valor (inteiro):");
        n3 = ler.nextDouble();

        media = (n1 + n2 + n3) / 3;

        System.out.printf("A média é: %.2f", media);
        ler.close();
    }
}
