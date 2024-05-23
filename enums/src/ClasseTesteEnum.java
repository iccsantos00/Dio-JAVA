import java.util.Scanner;

public class ClasseTesteEnum{
    EnumPlanetas planeta;

    ClasseTesteEnum(String planeta){
        this.planeta = EnumPlanetas.valueOf(planeta);
    }

    public void viajarPlaneta(){
        switch (planeta) {
            case Mercurio:
                System.out.println("Muito quente por lá");
                break;
            case Terra:
                System.out.println("Já estamos aqui");
                break;
            case Urano:
                System.out.println("Muito longe");
                break;
            default:
                System.out.println("Acabaram as passagens");
                break;
        }
    }
}