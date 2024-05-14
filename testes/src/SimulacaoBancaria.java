import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        double saldo = 0; 
        boolean sistema = true;
        while (sistema) { 
            System.out.println("Digite o número da opção desejada: ");
            System.out.println("1 - Depositar\r\n" + //
                               "2 - Sacar\r\n" + //
                               "3 - Consultar Saldo\r\n" + //
                               "4 - Encerrar");
            int opcao = scanner.nextInt(); 

            switch(opcao){
             case 1:
              System.out.println("\n---- Depositar ----");
              System.out.println("Digite um valor para DEPOSITAR: ");
              float deposito = scanner.nextInt();
              System.out.println("\nDeseja confirmar um DEPÓSITO no valor de R$" + deposito + " ?");
              System.out.println("1 - Confirmar \n2 - Cancelar ");
              int confirmar = scanner.nextInt(); 
              if(confirmar == 1){
               saldo = saldo + deposito;
               System.out.println("\nValor depositado: " + deposito + "\n Saldo atual: " + saldo + "\n");
              } 
              else{
                 System.out.println("\nDeposito de R$" + deposito + " CANCELADO");
                 System.out.println("Saldo atual: R$" + saldo + "\n");
                }
               break;

             case 2:
              System.out.println("---- Sacar ----");
              System.out.println("Saldo atual: R$" + saldo + "\n");
              System.out.println("Digite um valor para SACAR: ");
              float saque = scanner.nextInt();
              System.out.println("\nDeseja confirmar um SAQUE no valor de R$" + saque + " ?");
              System.out.println("1 - Confirmar \n2 - Cancelar ");
              confirmar = scanner.nextInt(); 
              if (saque <= saldo && confirmar == 1){
                saldo = saldo - saque;
                System.out.println("\nSaque de R$" + saque + " realizado com sucesso!");
                System.out.println("Saldo atual: R$" + saldo + "\n");
              } 
              else if(saque >= saldo && confirmar == 1){
                System.out.println("\nSaque de R$" + saque + " CANCELADO POR FALTA DE SALDO");
                System.out.println("Saldo atual: R$" + saldo + "\n");
              }
              else{
                System.out.println("\nSaque de R$" + saque + " CANCELADO");
                System.out.println("Saldo atual: R$" + saldo + "\n");
              }
               break;

             case 3:
              System.out.println("---- Consultar Saldo ----");
              System.out.println("Saldo atual: R$" + saldo + "\n");
               break;

             case 4:
              System.out.println("\nObrigado por ultilizar nossos serviços!");
              sistema = false;
               break;
               
             default:
              System.out.println("\nOpção inválida. Tente novamente."); 
            }
        }
    }
}