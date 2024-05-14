import java.util.concurrent.ThreadLocalRandom;

public class Processo {
    static int [] ICandidatosSelecionados = {1, 2, 3, 4, 5};
    static double [] ISalarioSelecionados = {1, 2, 3, 4, 5};
    static String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};
    public static void main(String[] args) throws Exception {
        SelecaoCandidatos();
        ImprimirSelecionados();

        
    }

    public static void ImprimirSelecionados(){
        System.out.println("Imprimindo a lista de APROVADOS no processo: ");

        for(int x = 0; x < 5; x++){
            int y = ICandidatosSelecionados[x];
            System.out.println(candidatos[y] + ", salário pretendido: " + ISalarioSelecionados[x]);
        }
    }

    public static void SelecaoCandidatos() {
        int candidatosSelecionados = 0;
        int x = 0;
        double salarioBase = 2000.0;

        while (candidatosSelecionados < 5 && x < candidatos.length) {
            String candidato = candidatos[x];
            double salarioPretendido = ValorPretendido();

            //System.out.println("O candidato " + candidato + " solicitou este valor de salário: " + salarioPretendido);

            if(salarioBase >= salarioPretendido){
              //System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
              ICandidatosSelecionados[candidatosSelecionados] = x;
              ISalarioSelecionados[candidatosSelecionados] = salarioPretendido;
              candidatosSelecionados++;
            }
            x++; 
        }
    }

    public static void AnalisarCandidato (double salarioPretendido){
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido)
         System.out.println("Ligar para o Candidato");
        else if(salarioBase == salarioPretendido)
         System.out.println("Ligar para o candidato com contra proposta");
        else
         System.out.println("Aguardando o resultado dos demais candidatos");
    }

    public static double ValorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
}
