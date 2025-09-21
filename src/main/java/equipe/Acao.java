package equipe;

public class Acao extends Filme {
    private int numeroExplosoes;

    public Acao(String titulo, String diretor, int duracao, int numeroExplosoes) {
        super(titulo, diretor, duracao);
        this.numeroExplosoes = numeroExplosoes;
    }

    @Override
    public String reproduzir() {
        return getTitulo() + " está cheio de cenas de ação e explosões!";
    }

    public int getNumeroExplosoes() {
        return numeroExplosoes;
    }

    @Override
    public String toString() {
        return super.toString() + ", Explosões: " + numeroExplosoes;
    }
}