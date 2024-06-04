public class Iphone implements AparelhoTelefonico, NavegadorNaInternet, ReprodutorMusical {

    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        iphone.ligar("99999999");
        iphone.atender();
        iphone.iniciarCorreioVoz();
        iphone.exibirPagina("www.google.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica("Creep");


    }
    @Override
     public void ligar(String numero) {
        System.out.println("Ligando para: "+ numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: "+ url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adiciona nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualiza pagina");
    }

    @Override
    public void tocar() {
        System.out.println("Tocar");
    }

    @Override
    public void pausar() {
        System.out.println("Pausar");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando musica: " + musica);
    }
}
