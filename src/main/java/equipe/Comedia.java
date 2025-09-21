package equipe;

public class Comedia extends Filme {
    private int numeroPiadas;

    public Comedia(String titulo, String diretor, int duracao, int numeroPiadas) {
        super(titulo, diretor, duracao);
        this.numeroPiadas = numeroPiadas;
    }

    @Override
    public String reproduzir() {
        return getTitulo() + " está fazendo todo mundo rir com suas piadas!";
    }

    public int getNumeroPiadas() {
        return numeroPiadas;
    }

    @Override
    public String toString() {
        return super.toString() + ", Piadas: " + numeroPiadas;
    }
}