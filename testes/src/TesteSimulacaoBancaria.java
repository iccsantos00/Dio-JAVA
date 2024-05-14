import java.util.Scanner;

public class TesteSimulacaoBancaria{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        double saldo = 0; 
        boolean sistema = true;
        while (sistema) { 
            int opcao = scanner.nextInt(); 

            switch(opcao){
             case 1:
              float deposito = scanner.nextInt();
               saldo = saldo + deposito;
               System.out.println("Saldo atual: " + saldo);
               break;

             case 2:
              float saque = scanner.nextInt();
              if (saque <= saldo){
                saldo = saldo - saque;
                System.out.println("Saldo atual: " + saldo);
              }
              else{
                System.out.println("Saldo insuficiente.");
              }
               break;

             case 3:
              System.out.println("Saldo atual: " + saldo);
               break;

             case 0:
              System.out.println("Programa encerrado.");
              sistema = false;
               break;
               
             default:
              System.out.println("\nOpção inválida. Tente novamente."); 
            }
        }
    }
}