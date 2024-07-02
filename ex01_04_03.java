// 4-3 Faça um algoritmo que leia três números e exiba o maior deles.

import java.util.Locale;
import java.util.Scanner;

public class ex01_04_03 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        ler.useLocale(Locale.US);

        System.out.println("Insira o primeiro valor:");
        float n1 = ler.nextFloat();

        System.out.println("Insira o segundo valor:");
        float n2 = ler.nextFloat();
        
        System.out.println("Insira o terceiro valor:");
        float n3 = ler.nextFloat();

        if ((n1 > n2) && n1 > n3) {
            System.out.println("O maior valor é: " + n1);
        } else if ((n2 > n1) && (n2 > n3)) {
            System.out.println("O maior valor é: " + n2);
        } else {
            System.out.println("O maior valor é: " + n3);
        }

        ler.close();
    }
}
