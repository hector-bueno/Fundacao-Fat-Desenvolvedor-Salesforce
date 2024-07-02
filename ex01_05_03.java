// 5-3 Desenvolva um algoritmo que leia números do usuário até que ele digite um número negativo, e então exiba a média dos números positivos digitados usando a estrutura "faça enquanto".

import java.util.Scanner;

public class ex01_05_03 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num = 0;
        int soma = 0;

        do {
            System.out.println("Insira um número positivo para ser somado");
            System.out.println("ou um número negativo para encerrar.");
            num = ler.nextInt();

            if (num > 0) {
                soma = soma + num;
            }

        } while (num >= 0);

        System.out.println("A soma é: " + soma);
        ler.close();
    }
}
