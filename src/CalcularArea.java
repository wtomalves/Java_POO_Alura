import java.util.Scanner;

public class CalcularArea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);



        int opc = 0;
        int areaQuadrado = 0;
        double areaCirculo = 0;
        int quadrado;
        double raio = 0;
        double PI = 3.142;


        while (opc != 3) {
            System.out.println("""
            MENU
            
            1 - Calcular área do quadrado 
            2 - Calcular área do circulo 
            3 - Parar excução 
            """);

            System.out.print("Digite a opção: ");
            opc = scan.nextInt();
            if (opc == 1) {
                System.out.println("Calculando a área de um quadrado...");
                System.out.println("Digite os metros do quadrado: ");
                quadrado = scan.nextInt();
                areaQuadrado = quadrado * quadrado;
                System.out.println("A área tem " + areaQuadrado + "m²");
                System.out.println("--------------");
            }
            if (opc == 2) {
                System.out.println("Calculando a área de um circulo...");
                System.out.print("Digite o raio do circulo: ");
                raio = scan.nextInt();
                areaCirculo = PI * (raio * raio);
                System.out.println("A área tem " + areaCirculo + "cm²");
                System.out.println("--------------");
            }
        }
        System.out.println("Saiu");








    }
}