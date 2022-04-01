/*Ler o nome de 2 times e o número de gols marcados na partida (para
cada time). Escrever o nome do vencedor. Caso não haja vencedor
deverá ser impressa a palavra EMPATE*/

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner leitortime1 = new Scanner(System.in);
        Scanner leitortime2 = new Scanner(System.in);

        System.out.println("Qual o nome do time?");
        String time1 = leitortime1.nextLine();
        System.out.println("Quantos gols "+time1+" fez na partida?");
        int gols1 = leitortime1.nextInt();

        System.out.println("Qual o nome do time oponente?");
        String time2 = leitortime2.nextLine();
        System.out.println("Quantos gols "+time2+" fez na partida?");
        int gols2 = leitortime2.nextInt();

        if (gols1 > gols2) {
            System.out.println("O time vencedor foi "+time1);
        } else if (gols1 < gols2) {
            System.out.println("O time vencedor foi "+time2);
        } else {
            System.out.println("O resultado foi empate");
        }{
            
        }
    }
    
}
