package Ordenacao;

import java.util.*;

public class OrdenacaoSet {
    public static void main(String[] args) {
        System.out.println("--\tOrdem Aleatória\t--");
        Set<Series> minhasSeries = new HashSet<>() {{

            add(new Series("got", "fantasia", 60));
            add(new Series("dark", "drama", 60));
            add(new Series("that '70s show", "comédia", 25));
        }};
        for (Series serie : minhasSeries)
            System.out.println(serie.getNome() + " - "
                    + serie.getGenero() + " - "
                    + serie.getTempoEpisodio());


        System.out.println("--\tOrdem de Inserção\t--");
        Set<Series> minhasSeries2 = new LinkedHashSet<>() {{
            add(new Series("got", "fantasia", 60));
            add(new Series("dark", "drama", 60));
            add(new Series("that '70s show", "comédia", 25));

        }};
        for (Series serie : minhasSeries2) {
            System.out.println(serie.getNome() + " - "
                    + serie.getGenero() + " - "
                    + serie.getTempoEpisodio());
        }

        System.out.println("--\tOrdem de Natural\t--");
        Set<Series> minhasSeries3 = new TreeSet<>() {{
            add(new Series("got", "fantasia", 60));
            add(new Series("dark", "drama", 60));
            add(new Series("that '70s show", "comédia", 25));

        }};
        for (Series serie : minhasSeries3) {
            System.out.println(serie.getNome() + " - "
                    + serie.getGenero() + " - "
                    + serie.getTempoEpisodio());
        }

        System.out.println("--\tOrdem Nome/Gênero/Tempo de Episódio\t--");
        Set<Series> minhasSeries4 = new TreeSet<>(new ComparetoNomeGeneroTempoEpisodio());
           minhasSeries4.addAll(minhasSeries);
            for (Series serie: minhasSeries4)
                System.out.println(serie.getNome() + " - "
                        + serie.getGenero() + " - "
                        + serie.getTempoEpisodio());
        ;

    }
}


    class Series implements Comparable<Series>{

        private String nome;
        private String genero;
        private Integer tempoEpisodio;

        public Series(String nome, String genero, Integer tempoEpisodio) {
            this.nome = nome;
            this.genero = genero;
            this.tempoEpisodio = tempoEpisodio;
        }

        public String getNome() {
            return nome;
        }

        public String getGenero() {
            return genero;
        }

        public Integer getTempoEpisodio() {
            return tempoEpisodio;
        }

        @Override
        public String toString() {
            return "Series{" +
                    "nome='" + nome + '\'' +
                    ", genero='" + genero + '\'' +
                    ", tempoEpisodio=" + tempoEpisodio +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Series series = (Series) o;
            return nome.equals(series.nome) && genero.equals(series.genero) && tempoEpisodio.equals(series.tempoEpisodio);
        }

        @Override
        public int hashCode() {
            return Objects.hash(nome, genero, tempoEpisodio);
        }

        @Override
        public int compareTo(Series serie) {

            int tempoEpisodio = Integer.compare(this.getTempoEpisodio(), serie.getTempoEpisodio());
            if (tempoEpisodio != 0) return tempoEpisodio;

            return this.getGenero().compareTo(serie.getGenero() );
        }
    }

    class ComparetoNomeGeneroTempoEpisodio implements Comparator<Series>{

    @Override
        public int compare(Series s1, Series s2){
        int nome = s1.getNome().compareTo(s2.getNome());
        if (nome != 0) return nome;

        int genero = s1.getGenero().compareTo(s2.getGenero());
        if (genero != 0) return  genero;


        return  Integer.compare(s1.getTempoEpisodio(), s2.getTempoEpisodio());
    }


}