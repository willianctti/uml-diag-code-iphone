package iphone;

public class reprodutorMusical {
    public static class ReprodutorMusical {
        private boolean reproduzindo;
        private String musicaAtual;

        public ReprodutorMusical() {
            this.reproduzindo = false;
            this.musicaAtual = null;
        }

        public boolean isReproduzindo() {
            return reproduzindo;
        }

        public void tocarMusica(String musica) {
            reproduzindo = true;
            musicaAtual = musica;
            System.out.println("Tocando música: " + musica);
        }

        public void pausarMusica() {
            if (reproduzindo) {
                reproduzindo = false;
                System.out.println("Pausando música: " + musicaAtual);
            } else {
                System.out.println("Não há música tocando para pausar.");
            }
        }

        public void selecionarMusica(String novaMusica) {
            if (reproduzindo) {
                System.out.println("Pare a música antes de selecionar outra.");
            } else {
                musicaAtual = novaMusica;
                System.out.println("Selecionando nova música: " + novaMusica);
            }
        }
    }
}
