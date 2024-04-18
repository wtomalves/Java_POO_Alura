import java.util.Scanner;

public class Taboada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número pra saber a Taboaoda... ");
        int taboada = scan.nextInt();

        for (int i = 0; i < 10; i++) {
            System.out.println(taboada + " x " + (i+1) + " = " + taboada * (i+1));
        }
    }
}
