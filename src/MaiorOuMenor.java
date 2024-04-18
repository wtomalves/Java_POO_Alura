import java.util.Scanner;

public class MaiorOuMenor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("""
                Peça ao usuário para inserir dois números inteiros. 
                Compare os números e imprima uma mensagem indicando se são iguais,
                 diferentes, o primeiro é maior ou o segundo é maior.""");


        System.out.print("Digite um número: ");
        int num1 = scan.nextInt();
        System.out.print("Digite outro número: ");
        int num2 = scan.nextInt();
        int maior = 0, menor = 0;


        if (num1 == num2) {
            System.out.println("Os números são iguais!");
        } else {
            System.out.println("Os números são diferentes!");
        }

        if (num1 > num2) {
            System.out.println("O primeiro número digitado é maior");
        } else if (num1 == num2) {
            System.out.println("Nem maior nem menor...");
        } else {
            System.out.println("O segundo número digitado é maior");
        }

    }
}
