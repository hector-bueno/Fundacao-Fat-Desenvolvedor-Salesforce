// 1-2 Faça um algoritmo que leia o nome, a idade e o salário de uma pessoa e exiba essas informações formatadas.

import java.util.Scanner;

public class ex01_01_02 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String nome;
        int idade;
        double salario;

        System.out.println("Por favor, insira seu nome");
        nome = ler.nextLine();

        System.out.println("Por favor, insira sua idade");
        idade = ler.nextInt();

        ler.nextLine();

        System.out.println("Por favor, insira seu salário");
        salario = ler.nextDouble();

        System.out.printf("Olá, %s sua idade é %d e seu salário é %.2f", idade, nome, salario);

        ler.close();
    }
}
