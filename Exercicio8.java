/*Faça um programa que receba 6 números e exiba se:
● A é igual a B;
● C é diferente D;
● E é maior F;*/

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int listaNumeros[] = new int[6];

        for(int i = 0; i < listaNumeros.length; i++){
            int numero = i + 1;
            System.out.print("Digite o "+numero+"° número: ");
            listaNumeros[i] = leitor.nextInt();
        }

        //for(int i = 0; i < listaNumeros.length; i++){
            if(listaNumeros[0] == listaNumeros[1]){
                System.out.println("A é igual a B");
            }
            else{
                System.out.println("A não é igual a B");
            }
            if(listaNumeros[2] != listaNumeros[3]){
                System.out.println("C é diferente a D");
            }
            else{
                System.out.println("C não é diferente a D");
            }
            if(listaNumeros[4] > listaNumeros[5]){
                System.out.println("E é maior a F");
            }
            else{
                System.out.println("E não é maior a F");
            }
       // }
    }
}