import java.util.Scanner;

public class OutroLoopWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double  nota = 0;
        int totalDeNotas = 0;


        while (nota != -1) {
            System.out.print("Digite sua avalização para o filme ou -1 para encerrar: ");
            nota = scan.nextDouble();

            if (nota != -1) {
                mediaAvaliacao += nota;
                totalDeNotas++;
            }


        }

        double result = mediaAvaliacao / totalDeNotas;
        System.out.println(String.format("Média de avaliação %.1f: ", result));
    }
}
