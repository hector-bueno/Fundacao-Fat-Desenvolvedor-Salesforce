import java.util.Scanner;

// Sequencia dos passos para criação e execução dos arruivos JAVA
// javac nomeDoArquivo.java
// java nomeDoArquivo

public class padrao {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        // 2. instanciando e criando um objeto Scanner
        int idade;
        String nome;

        System.out.printf("Informe a sua idade:\n");
        idade = ler.nextInt(); // 3. entrada de dados (lendo um valor inteiro)

        ler.nextLine(); // esvazia o buffer do teclado

        System.out.printf("\nInforme o seu nome:\n");
        nome = ler.nextLine(); // 3. entrada de dados (lendo uma String)

        System.out.printf("\nResultado:\n");
        System.out.printf("%s tem %d anos.\n", nome, idade);
    }

}
