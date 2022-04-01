/*Crie um algoritmo que receba 4 notas de um aluno, calcule a média
e exiba se o aluno foi aprovado ou não.
Obs: a média de aprovação é 7*/

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a nota do 1° Bimestre: ");
        float n1 = leitor.nextFloat();
        System.out.println("Digite a nota do 2° Bimestre: ");
        float n2 = leitor.nextFloat();
        System.out.println("Digite a nota do 3° Bimestre: ");
        float n3 = leitor.nextFloat();
        System.out.println("Digite a nota do 4° Bimestre: ");
        float n4 = leitor.nextFloat();

        float media = (n1 + n2 + n3 + n4) / 4;

        if (media >= 7) {
            System.out.println("Aluno Aprovado com média "+media);
        } else {
            System.out.println("Aluno Reprovado com média "+media);
        }
    }
}
