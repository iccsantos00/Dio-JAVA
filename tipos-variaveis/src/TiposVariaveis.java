/* Tipos primitivos : 
byte 1byte, short 2bytes, int 4bytes, long 8bytes
float 4bytes (sempre terminar com F ex: 3.14F), double 8bytes
String
boolean

DECLARAÇÃO: <tipo> <nomeDaVariavel> <valorOpcional>
*/

public class TiposVariaveis { /* CLASSE */
    public static void main(String[] args) throws Exception { /* MÉTODO */

        //VARIÁVEIS
        byte idade = 127; /* ATRIBUTO */
        short ano = 3276;
        int cep = 214748364;
        long cpf = 1223372036;
        float pi = 3.14F;
        double salario = 1560.33;
        String meuNome = "Isacc Victor";

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        boolean simNao = numeroCurto == numeroCurto2;
        //System.out.println(simNao); = true

        //CONSTANTES
        final double VALOR_DE_PI = 3.14;
        final int MEU_NASCIMENTO = 2003;

        /*OPERADORES
           ARITMÉTRICOS
        = atribuição
        + adição
        - subtração
        * multiplicação
        / divisão
        % resto

           UNITÁRIOS/CONTATENADORES
        + concatenação
        ++ incrementador
        -- decrementador
        ! negação

           CONDICIONAIS
        ?: operador ternário --> String resultado = a == b ? "verdadeiro" : "falso" (se a for igual a b atribua verdadeiro, senão, atribua falso)
        ?: operador ternário --> int resultado = a == b ? 1 : 0 (se a for igual a b atribua 1, senão, atribua 0)

           RELACIONAIS
        == igualdade
        != diferença
        > maior
        >= maior igual
        < menor
        <= menor igual

           LÓGICOS
        && E
        || OU

        Métodos e Atributos de uma CLASSE
        Métodos devem ser nomeados com verbo

        

        */
    }
}
