// 4-4 Desenvolva um algoritmo que calcule a média de três notas e determine se o aluno está aprovado (média >= 6) ou reprovado (média < 6).

import java.util.Locale;
import java.util.Scanner;

public class ex01_04_04 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        ler.useLocale(Locale.US);

        System.out.println("Insira o primeiro valor:");
        float nota1 = ler.nextFloat();

        System.out.println("Insira o segundo valor:");
        float nota2 = ler.nextFloat();
        
        System.out.println("Insira o terceiro valor:");
        float nota3 = ler.nextFloat();

        float media = (nota1 + nota2 + nota3) / 3;

        if (media >= 6) {
            System.out.printf("Aluno APROVADO com nota %.2f", media);
        } else {
            System.out.printf("Aluno REPROVADO com nota %.2f", media);
        }

        ler.close();
    }
}
