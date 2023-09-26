package iphone;

public class iphone {
    private boolean ligado = true;
    public iphone.reprodutorMusical.ReprodutorMusical reprodutor;
    private AparelhoTelefonico aparelhoTelefonico;
    private NavegadorInternet navegadorInternet;

    public iphone(AparelhoTelefonico aparelhoTelefonico) {
        this.aparelhoTelefonico = aparelhoTelefonico;
        reprodutor = new iphone.reprodutorMusical.ReprodutorMusical();
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }



    // REPRODUTOR MUSICAL

    public void tocarMusica(String musica) {
        if (ligado) {
            reprodutor.tocarMusica(musica);
        } else {
            System.out.println("O iPhone não está ligado. Ligue o iPhone antes de tocar música.");
        }
    }

    public void pausarMusica() {
        if (ligado) {
            reprodutor.pausarMusica();
        } else {
            System.out.println("O iPhone não está ligado. Ligue o iPhone antes de pausar a música.");
        }
    }

    public void selecionarMusica(String novaMusica) {
        if (ligado) {
            reprodutor.selecionarMusica(novaMusica);
        } else {
            System.out.println("O iPhone não está ligado. Ligue o iPhone antes de selecionar uma música.");
        }
    }




    // APARELHO TELEFONICO

    public void atenderChamada() {
        this.aparelhoTelefonico.atender();
    }

    public void iniciarCorreioVoz() {
        this.aparelhoTelefonico.iniciarCorreioVoz();
    }

    public void receberChamada() {
        aparelhoTelefonico.receberChamada();
    }


    // NAVEGAR NA INTERNET

    public void exibirPaginaWeb(String url) {
        navegadorInternet.exibirPagina(url);
    }

    public void adicionarNovaAba() {
        navegadorInternet.adicionarNovaAba();
    }

    public void atualizarPagina() {
        navegadorInternet.atualizarPagina();
    }

}
