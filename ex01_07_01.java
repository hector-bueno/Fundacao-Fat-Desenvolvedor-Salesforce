// 7-1 Crie uma função que receba um número inteiro e retorne seu fatorial.

import java.util.Scanner;

public class ex01_07_01 {
    public static int executaFatorial(int numero) {
        int fatorial = 0;
        
        for (int i = numero - 1; i > 0; i--) {
            System.out.println(fatorial);
            fatorial += numero * i;
        }

        return fatorial;
    }

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("Insira o número (INTEIRO) a ser gerado o Fatorial:");
        int num = ler.nextInt();

        int resultado = executaFatorial(num);
        System.out.print(resultado);

        ler.close();
    }
}
