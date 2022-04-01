/*Ler dois valores (considere que não serão lidos valores iguais) e
escrever o maior deles.*/

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int valor1 = leitor.nextInt();
        System.out.println("Digite o segundo número: ");
        int valor2 = leitor.nextInt();

        if (valor1 > valor2) {
            System.out.println("O maior número é "+valor1);
        } else {
          System.out.println("O maior número é "+valor2);  
        }
    }
    
}
