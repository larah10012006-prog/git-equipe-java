package equipe;

public class Filme {
    private String titulo;
    private String diretor;
    private int duracao;

    public Filme(String titulo, String diretor, int duracao) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.duracao = duracao;
    }

    public String exibirInfo() {
        return "Título: " + titulo + ", Diretor: " + diretor + ", Duração: " + duracao + "min";
    }

    public String reproduzir() {
        return titulo + " está sendo reproduzido.";
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDiretor() {
        return diretor;
    }

    public int getDuracao() {
        return duracao;
    }

    @Override
    public String toString() {
        return exibirInfo();
    }
}