package iphone;

public class AparelhoTelefonico {
    private boolean ligado;
    private boolean chamadaRecebida;

    public AparelhoTelefonico() {
        this.ligado = false;
        this.chamadaRecebida = false;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public void ligar() {
        if (!ligado) {
            ligado = true;
            System.out.println("Aparelho telefônico ligado.");
        } else {
            System.out.println("O aparelho telefônico já está ligado.");
        }
    }

    public void atender() {
        if (ligado) {
            if (chamadaRecebida) {
                System.out.println("Atendendo chamada telefônica.");
            } else {
                System.out.println("Não há chamada para atender.");
            }
        } else {
            System.out.println("O aparelho telefônico não está ligado. Ligue o aparelho antes de atender chamadas.");
        }
    }

    public void iniciarCorreioVoz() {
        if (ligado) {
            System.out.println("Iniciando correio de voz.");
        } else {
            System.out.println("O aparelho telefônico não está ligado. Ligue o aparelho antes de iniciar o correio de voz.");
        }
    }

    public void receberChamada() {
        chamadaRecebida = true;
        System.out.println("Chamada recebida.");
    }
}
