import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double  nota = 0;


        for (int i = 0; i < 3; i++) {
            System.out.print("Digite sua avalização para o filme: ");
            nota = scan.nextDouble();
            mediaAvaliacao += nota;

        }

        double result = mediaAvaliacao / 3;
        System.out.println(String.format("Média de avaliação %.1f: ", result));
        

    }
}
