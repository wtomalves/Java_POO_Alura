import java.util.Scanner;

public class NumerosPositivoENegativo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("""
                            Crie um programa que solicite ao usuário digitar um 
                            número. Se o número for positivo, exiba "Número positivo", 
                            caso contrário, exiba "Número negativo".
                            """
                            );
        System.out.println("Digite um número: ");
        int num = scan.nextInt();

        if (num == 0) {
            System.out.println("Número neutro");
        } else if (num >= 1){
            System.out.println("Número positivo");
        } else {
            System.out.println("Numero negativo");
        }
    }
}
