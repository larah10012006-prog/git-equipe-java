package equipe;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Filme> filmes = new ArrayList<>();

        filmes.add(new Acao("Missão Impossível", "Brian De Palma", 120, 15));
        filmes.add(new Comedia("Deadpool & Wolverine", "Shawn Levy", 120, 60));

        for (Filme f : filmes) {
            System.out.println(f);
            System.out.println(f.reproduzir());
        }
    }
}