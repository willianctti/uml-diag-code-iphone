package iphone;

public class NavegadorInternet {
    private boolean ligado;
    private String paginaAtual;

    public NavegadorInternet() {
        this.ligado = false;
        this.paginaAtual = null;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public void exibirPagina(String url) {
        if (ligado) {
            paginaAtual = url;
            System.out.println("Exibindo página: " + url);
        } else {
            System.out.println("O navegador não está ligado. Ligue o navegador antes de exibir uma página.");
        }
    }

    public void adicionarNovaAba() {
        if (ligado) {
            System.out.println("Nova aba adicionada.");
        } else {
            System.out.println("O navegador não está ligado. Ligue o navegador antes de adicionar uma nova aba.");
        }
    }

    public void atualizarPagina() {
        if (ligado && paginaAtual != null) {
            System.out.println("Atualizando página: " + paginaAtual);
        } else {
            System.out.println("Não há página para atualizar.");
        }
    }
}
