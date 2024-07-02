// 4-1 Desenvolva um algoritmo que leia a idade de uma pessoa e determine se ela é maior de idade (idade >= 18).

import java.util.Scanner;

public class ex01_04_01 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Insira a sua Idade (inteiro) para verificar sua Maioridade.");
        int idade = ler.nextInt();

        if (idade >= 18) {
            System.out.println("Estrutura IF");
            System.out.println("Sim, você é maior de idade.");
        }
        
        if (idade >= 18) {
            System.out.println("Estrutura IF/ELSE");
            System.out.println("Sim, você é maior de idade.");
        } else {
            System.out.println("Estrutura IF/ELSE");
            System.out.println("Não, você ainda não é maior de Idade.");
        }

        ler.close();
    }
}
