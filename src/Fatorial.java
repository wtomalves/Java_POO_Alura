import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Fatorial do n°: ");
        int num = scan.nextInt();
        int fatorial = 1;
        for (int i = 0; i < num; i++) {
            fatorial*=(i+1);

        }
        System.out.println(fatorial);
    }
}
