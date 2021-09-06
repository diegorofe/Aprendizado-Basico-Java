package colecoes;

import java.util.Comparator;
import java.util.Objects;

public class LinguagemFavorita implements Comparable<LinguagemFavorita> {
    private String nome;
    private Integer anoDeCriacao;
    private String ide;

    public LinguagemFavorita(String nome, Integer anoDeCriacao, String ide) {
        this.nome = nome;
        this.anoDeCriacao = anoDeCriacao;
        this.ide = ide;
    }

    @Override
    public String toString() {
        return "LinguagemFavorita{" +
                "nome='" + nome + '\'' +
                ", anoDeCriacao=" + anoDeCriacao +
                ", ide='" + ide + '\'' +
                '}';
    }


    public String getNome() {
        return nome;
    }

    public Integer getAnoDeCriacao() {
        return anoDeCriacao;
    }

    public String getIde() {
        return ide;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LinguagemFavorita that = (LinguagemFavorita) o;
        return nome.equals(that.nome) && anoDeCriacao.equals(that.anoDeCriacao) && ide.equals(that.ide);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, anoDeCriacao, ide);
    }


    @Override
    public int compareTo(LinguagemFavorita ling) {

        int linguagem = String.CASE_INSENSITIVE_ORDER.compare(this.getNome(), ling.getNome());
        if(linguagem != 0){
            return linguagem;
        }

        return this.getNome().compareTo(ling.getNome());
    }
}
class ComparatorIde implements Comparator<LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        int ide = l1.getIde().compareTo(l2.getIde());
        if (ide != 0) return ide;

        return String.CASE_INSENSITIVE_ORDER.compare(l1.getIde(), l2.getIde());

    }
}

class ComparatorCriacaoNome implements Comparator<LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        int ano = Integer.compare(l1.getAnoDeCriacao(), l2.getAnoDeCriacao());
        if(ano != 0) return ano;

        return String.CASE_INSENSITIVE_ORDER.compare(l1.getNome(), l2.getNome());
    }
}

class ComparatorNomeAnoIde implements Comparator<LinguagemFavorita>{


    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {

        int nome = l1.getNome().compareTo(l2.getNome()) ;
        if(nome != 0) return nome;

        int ano = l1.getAnoDeCriacao().compareTo(l2.getAnoDeCriacao());
        if (ano != 0) return ano;

        return String.CASE_INSENSITIVE_ORDER.compare(l1.getIde(), l2.getIde());

    }
}
