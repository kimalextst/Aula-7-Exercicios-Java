/*Faça um programa que receba a idade de um usuário e diga se ele é
maior de idade ou não*/ 

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = leitor.nextInt();

        if (idade >= 18) {
            System.out.println("O usuário é maior de idade");
        } else {
            System.out.println("O usuário é menor de idade");
        }
    }
}