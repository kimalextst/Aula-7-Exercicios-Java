import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite seu peso(kg): ");
        double peso = leitor.nextDouble();
        System.out.println("Digite sua altura(m): ");
        double altura = leitor.nextDouble();

        double IMC = peso / (altura * altura);

        if(IMC < 18.5) {
            System.out.printf("Você esta abaixo do peso - Magreza: %.1f",IMC);
        } else if(IMC >= 18.5 && IMC <= 24.9) { 
            System.out.printf("Você está no peso ideal - Normal: %.1f",IMC);
        } else if(IMC >= 25 && IMC <= 29.9) { 
            System.out.printf("Você está com sobrepeso - Obesidade grau I: %.1f",IMC);
        } else if(IMC >=30 && IMC <= 39.9) { 
            System.out.printf("Você está com obesidade - Obesidade grau II: %.1f",IMC);
        } else{ 
            System.out.printf("Você está com obesidade grave (Obesidade grau III: %.1f",IMC);
        }
    }   
}
