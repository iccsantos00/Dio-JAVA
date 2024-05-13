import java.util.concurrent.ThreadLocalRandom;

public class ExemploRep {
    public static void main(String[] args) throws Exception {

        //FOR
        for(int n = 1; n <= 20; n++){
            System.out.println("Contando n: " + n);
        }

        //FOR COM ARRAY
        String alunos[] = {"ISACC", "ERICK", "MARCOS"};
        for(int x=0; x<alunos.length; x++){
            System.out.println("O aluno no indice " + x + " é o " + alunos[x]);
        }

        //OU
        int x = 0;
        for(String aluno : alunos){
            System.out.println("O nome do aluno " + x + " é: " + aluno);
            x++;
        }

        //BREAK - finaliza tudo
        //CONTINUE - finaliza a operação atual, mas continua o laço

        //WHILE
        double mesada = 50.0;
        int n = 0;

        while (mesada > 0) {
            double valorDoce = valorAleatorio();

            System.out.println("Valor do doce: " + valorDoce);
            mesada = mesada - valorDoce;

            if(valorDoce > mesada)
             System.out.println("Mesada: " + mesada);
             System.out.println("Quantidade de doces: " + n);

            n++;
        }

        //DO WHILE
        do {
            double valorDoce = valorAleatorio();

            System.out.println("Valor do doce: " + valorDoce);
            mesada = mesada - valorDoce;

            if(valorDoce > mesada)
             System.out.println("Mesada: " + mesada);
             System.out.println("Quantidade de doces: " + n);

            n++;
        } while (mesada > 0);




    }

    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2,8);
    }
}

