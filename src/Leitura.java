import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu filme favorito: ");
        String filme = scan.nextLine();


        //Podemos fazer leitura de qualquer tipo de dados
        System.out.println("Qual ano de lançamento: ");
        int anoDeLancamento = scan.nextInt();

        System.out.println("Diga sua avaliação para o filme: ");
        double  avaliacao = scan.nextDouble();

        System.out.println("Seu filme preferido é: " + filme);
        System.out.println("Ano de lançamento é : " + anoDeLancamento);
        System.out.println("Sua avaliação foi: " + avaliacao);
        byte in = 1;


    }
}
