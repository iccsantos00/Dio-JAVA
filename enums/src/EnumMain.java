import java.util.Scanner;

public class EnumMain {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Para qual planeta quer viajar?");
        String planeta = entrada.nextLine();
        String capitalized = capitalizeFirstLetter(planeta);
        ClasseTesteEnum pl = new ClasseTesteEnum(capitalized);
        pl.viajarPlaneta();
    }

    public static String capitalizeFirstLetter(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }
}