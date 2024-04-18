import java.util.Scanner;

public class ProjetoContaBancaria {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("""
                ****************************************
                Dados iniciais do cliente:
                
                Nome:               Tempestade Mozart
                Tipo de conta:      Poupança
                Saldo inicial:      R$2500,00
                ****************************************
                """);

        int opc = 0;
        double valorReceber;
        double saldo = 2500.0;
        double valorTransferido;
        while(opc != 4) {
            System.out.println("""
               
               Operações
               
               1 - Consultar saldos
               2 - Receber valor
               3 - Transferir valor
               4 - Sair
                """);

            System.out.print("Digite a opção desejada: ");
            opc = scan.nextInt();

            if (opc == 1) {
                System.out.println("Saldo atual: " + saldo);
            } else if (opc == 2) {
                System.out.print("Informe o valor a receber:");
                valorReceber = scan.nextDouble();
                saldo += valorReceber;
                System.out.println("Saldo atualizado: " + saldo);
            } else if (opc == 3) {
                System.out.print("informe o valor que deseja transferir: ");
                valorTransferido = scan.nextDouble();
                if (valorTransferido > saldo) {
                    System.out.println("não foi possível fazer a transferência. Saldo insuficiente!");
                } else {
                    saldo-=valorTransferido;
                    System.out.println("Saldo atualizado: " + saldo);
                }
            } else if (opc < 0 || opc > 4){
                System.out.println("Erro. Digite uma opção válida!");
            }

        }

    }
}
