import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Por favor insira seu nome: ");
        String nome = leitor.nextLine();
        System.out.println("Olá "+nome+". Muito prazer em conhecer você!");

        System.out.println("Digite sua idade: ");
        int idade = leitor.nextInt();

        System.out.println("Sua idade é: "+idade);
    }
}
