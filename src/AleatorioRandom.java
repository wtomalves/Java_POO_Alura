import java.util.Random;
import java.util.Scanner;

public class AleatorioRandom {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int ia, num, acertou = 0, errou = 0;

        System.out.println("5 Tentativas, vamos ver quanto você acerta!");
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o número que a IA está pensando... :");
            num = scan.nextInt();
            System.out.println("Tentativa " + (i+1) + "°...");
            ia = new Random().nextInt(10);
            if (num == ia) {
                System.out.println("parabéns... você acertou!");
                acertou++;
                break;
            } else {
                errou++;
                System.out.println("A IA pensou... " + ia + "\n Tente novamente!");
                System.out.println("--------------------------------------------");
            }
        }
        System.out.println("Acertos: " + acertou);
        System.out.println("Erros: " + errou);
    }
}
