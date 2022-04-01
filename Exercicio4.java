/*Escreva um algoritmo para ler as dimensões de um retângulo (base
e altura), calcular e escrever a área do retângulo;*/

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o valor da base do retângulo: ");
        int base = leitor.nextInt();
        System.out.println("Digite o valor da altura do retângulo: ");
        int altura = leitor.nextInt();

        int area = base * altura;

        System.out.println("A área do retângulo é de "+area+"cm");
    }
}
