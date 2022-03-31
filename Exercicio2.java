import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite seu endereço: ");
        String endereco = leitor.nextLine();

        System.out.println("O seu pacote será enviado para "+endereco);

    }
}
