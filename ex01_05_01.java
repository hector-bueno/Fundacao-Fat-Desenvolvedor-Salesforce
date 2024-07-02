// 5-1 Crie um algoritmo que exiba todos os números pares de 1 a 20 usando a estrutura "para".

public class ex01_05_01 {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
