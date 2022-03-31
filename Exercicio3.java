import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Insira o saldo da sua conta: ");
        double saldo = leitor.nextDouble();

        System.out.println("O saldo atual da sua conta é de: R$"+saldo);
    }
    
}
