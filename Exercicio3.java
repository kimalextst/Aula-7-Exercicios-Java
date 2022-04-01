/*Ler um valor e escrever a mensagem É MAIOR QUE 10! se o valor lido
for maior que 10, caso contrário escrever NÃO É MAIOR QUE 10!*/

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero = leitor.nextInt();

        if (numero > 10) {
            System.out.println("É MAIOR QUE 10!");
        } else {
            System.out.println("NÃO É MAIOR QUE 10!");
        }
    }
}
