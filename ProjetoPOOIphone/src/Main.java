public class Main {
    public static void main(String[] args) {
        IPhone meuIPhone = new IPhone("iPhone 13");
        System.out.println("Modelo: " + meuIPhone.getModelo());

        // Teste de funcionalidades
        meuIPhone.tocar();
        meuIPhone.pausar();
        meuIPhone.selecionarMusica("Imagine - John Lennon");

        meuIPhone.ligar("123456789");
        meuIPhone.atender();
        meuIPhone.iniciarCorreioVoz();

        meuIPhone.exibirPagina("https://www.apple.com");
        meuIPhone.adicionarNovaAba();
        meuIPhone.atualizarPagina();
    }
}
