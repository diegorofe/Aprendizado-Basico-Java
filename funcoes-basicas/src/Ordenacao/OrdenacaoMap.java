package Ordenacao;

import colecoes.ImprimirTexto;

import java.util.*;

public class OrdenacaoMap {
    public static void main(String[] args) {
        ImprimirTexto texto = new ImprimirTexto();

        texto.tituloCentro("Ordem aleatória");

        Map<String, Livro> meusLivros = new HashMap<>(){{
           put("Hanking, Stephen", new Livro("Uma breve História do Tempo", 256));
           put("Dushigg, Charles", new Livro("O poder do hábito", 488));
           put("Harari, Yuval Noah", new Livro("21 lições para o século 21", 432));

        }};
        for (Map.Entry<String, Livro> livro : meusLivros.entrySet()){
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }

        texto.tituloCentro("Ordem de Inserção");
        Map<String, Livro> meusLivros2 = new LinkedHashMap<>(){{
            put("Hanking, Stephen", new Livro("Uma breve História do Tempo", 256));
            put("Dushigg, Charles", new Livro("O poder do hábito", 488));
            put("Harari, Yuval Noah", new Livro("21 lições para o século 21", 432));
        }};
        for (Map.Entry<String, Livro> livro : meusLivros2.entrySet()){
            System.out.println(livro.getKey() +" - "+ livro.getValue().getNome());
        }

    texto.tituloCentro("Ordem alfabética dos autores");

        Map<String, Livro> meusLivros3 = new TreeMap<>(meusLivros);
        for (Map.Entry<String, Livro> livro : meusLivros3.entrySet()){
            System.out.println(livro.getKey() + " - "+ livro.getValue().getNome());
        }
    texto.tituloCentro("Ordem alfabetica dos livros");
        Set<Map.Entry<String, Livro>> meusLivros4 = new TreeSet<>(new ComparatorNome());
        meusLivros4.addAll(meusLivros.entrySet());

       for(Map.Entry<String, Livro> livro : meusLivros4){
           System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
       }

  /*      texto.tituloCentro("Ordem alfabetica das páginas");
        Set<Map.Entry<String, Livro>> meusLivros4 = new TreeSet<>(new Comparator<Map.Entry<String, Livro>>() {
            @Override
            public int compare(Map.Entry<String, Livro> cont1, Map.Entry<String, Livro> cont2) {
                return Integer.compare(cont1.getValue().getPaginas(), cont2.getValue().getPaginas());
            }

        });*/


    }

}

class Livro  {
    private String nome;
    private Integer paginas;

    public Livro(String nome, Integer paginas) {
        this.nome = nome;
        this.paginas = paginas;
    }

    public String getNome() {
        return nome;
    }

    public Integer getPaginas() {
        return paginas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return nome.equals(livro.nome) && paginas.equals(livro.paginas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, paginas);
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", paginas=" + paginas +
                '}';
    }
}

class ComparatorNome implements Comparator<Map.Entry<String, Livro>>{

    @Override
    public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
        return l1.getValue().getNome().compareToIgnoreCase(l2.getValue().getNome());
    }
}
