// 1-1 Crie um algoritmo que leia dois números inteiros e exiba a soma, subtração, multiplicação e divisão deles.

import java.util.Scanner;

public class ex01_01_01 {
        public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        // 2. instanciando e criando um objeto Scanner
        int n1;
        int n2;

        System.out.printf(": : : Operações matemáticas : : :\n");
        System.out.printf("Informe o primeiro número:\n");
        n1 = ler.nextInt(); // 3. entrada de dados (lendo um valor inteiro)

        System.out.printf("Informe o segundo número:\n");
        n2 = ler.nextInt(); // 3. entrada de dados (lendo um valor inteiro)

        ler.nextLine(); // esvazia o buffer do teclado
        
        int soma = n1 + n2;
        System.out.printf("\nA soma dos Valores é: " + soma);

        int sub = n1 - n2;
        System.out.printf("\nA subtração dos Valores é: " + sub);

        int mult = n1 * n2;
        System.out.printf("\nA multiplicação dos Valores é: " + mult);

        float div = (float)n1 / n2;
        System.out.printf("\nA divisão dos Valores é: " + div);

        ler.close();
    }
}
