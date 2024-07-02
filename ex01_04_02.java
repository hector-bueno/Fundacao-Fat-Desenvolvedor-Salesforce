// 4-2 Crie um algoritmo que leia a nota de um aluno e exiba se ele foi aprovado (nota >= 6) ou reprovado (nota < 6).

import java.util.Locale;
import java.util.Scanner;

public class ex01_04_02 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        ler.useLocale(Locale.US);

        System.out.println("Insira a Nota Final do Aluno:");
        float nota = ler.nextFloat();

        if (nota >= 6) {
            System.out.printf("Aluno APROVADO com nota %.2f", nota);
        } else {
            System.out.printf("Aluno REPROVADO com nota %.2f", nota);
        }

        ler.close();
    }
}
