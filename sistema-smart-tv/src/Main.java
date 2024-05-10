public class Main {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        smartTv.mudarCanal(17);

        System.out.println("TV Ligada? " + smartTv.ligada);
        System.out.println("Canal  Atual: " + smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo STATUS --> TV Ligada? " + smartTv.ligada);
    }
 
}
