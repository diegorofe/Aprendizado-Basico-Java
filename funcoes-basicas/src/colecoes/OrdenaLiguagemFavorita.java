package colecoes;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class OrdenaLiguagemFavorita {
    public static void main(String[] args) {
        ImprimirTexto texto = new ImprimirTexto();
        texto.tituloCentro("Ordem de Inserção");
        Set<LinguagemFavorita> linguagem = new LinkedHashSet<>() {{
            add(new LinguagemFavorita("Java", 1990, "IntelliJ"));
            add(new LinguagemFavorita("Python", 1970, "Pycharm"));
            add(new LinguagemFavorita("Portugol", 1920, "Portugol online"));
        }};
        for (LinguagemFavorita ling : linguagem) {
            System.out.println(ling.getNome() + " - "
                    + ling.getAnoDeCriacao() + " - "
                    + ling.getIde());
        }

        texto.tituloCentro("Ordem Natural (nome)");
        Set<LinguagemFavorita> linguagem2 = new TreeSet<>() {{
            add(new LinguagemFavorita("Java", 1990, "IntelliJ"));
            add(new LinguagemFavorita("Python", 1970, "Pycharm"));
            add(new LinguagemFavorita("Portugol", 1920, "Portugol online"));

        }};

        for (LinguagemFavorita ling : linguagem2) {
            System.out.println(ling.getNome() + " - "
                    + ling.getAnoDeCriacao() + " - "
                    + ling.getIde());
        }
        texto.tituloCentro("Ordem IDE");
            Set<LinguagemFavorita> linguagem3 = new TreeSet<>(new ComparatorIde());
            linguagem3.addAll(linguagem2);

            for(LinguagemFavorita ling: linguagem3){
                System.out.println(ling.getNome() + " - "
                        + ling.getAnoDeCriacao() + " - "
                        + ling.getIde());
            }
        texto.tituloCentro("Ordem Ano de Criação e nome");
            Set<LinguagemFavorita> linguagem4 = new TreeSet<>(new ComparatorCriacaoNome());
            linguagem4.addAll(linguagem2);

            for (LinguagemFavorita ling: linguagem4){
                System.out.println(ling.getNome() + " - "
                        + ling.getAnoDeCriacao() + " - "
                        + ling.getIde());
            }

        texto.tituloCentro("Ordem Nome, Ano de Criação e nome");
            Set<LinguagemFavorita> linguagem5 = new TreeSet<>(new ComparatorNomeAnoIde());
            linguagem5.addAll(linguagem2);

            for (LinguagemFavorita ling: linguagem5){
            System.out.println(ling.getNome() + " - "
                    + ling.getAnoDeCriacao() + " - "
                    + ling.getIde());
        }

    }

}
