// 4-5 Desenvolva um algoritmo que leia a temperatura em graus Celsius e determine se está frio (abaixo de 15), ameno (entre 15 e 25) ou quente (acima de 25).

import java.util.Locale;
import java.util.Scanner;

public class ex01_04_05 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        ler.useLocale(Locale.US);

        System.out.println("Insira a Temperatura em ºC (Celsius):");
        float temperatura = ler.nextFloat();

        if (temperatura <= 15) {
            System.out.printf("A temperatura está FRIA.");
        } else if (temperatura <= 25) {
            System.out.printf("A temperatura está AMENA.");
        } else {
            System.out.printf("A temperatura está QUENTE.");
        }

        ler.close();
    }
}
