package colecoes;

import java.util.*;

public class ExemploSet {
    public static void main(String[] args) {
        ImprimirTexto texto = new ImprimirTexto();

        texto.tituloCentro("Crie um conjunto e adicione notas: ");
        //HashSet não ordena, os elementos repetidos só aparecem 1 vez,
        // não é possivel fazer busca como indice.
        // esse tipo de estrutura é indicada se você precisa apenas garantir
        // a alta performance sem se importar com a ordem com que os elementos estão ordenados.
        Set<Double> notas = new HashSet<>(Arrays.asList(0d, 7d, 8.5, 5d, 7d, 8d, 3.6));
        System.out.println("--> " + notas.toString());

        texto.tituloCentro("Verifique se a nota 5 está no conjunto ");
        System.out.println(notas.contains(5d));

        texto.tituloCentro("Exiba a menor nota:");
        System.out.println("--> " + Collections.min(notas));

        texto.tituloCentro("Exiba a maior nota:");
        System.out.println("--> " + Collections.max(notas));

        //Soma dos valores
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0.0;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        texto.tituloCentro("Exiba a soma dos valores:");
        System.out.println("--> " + soma);

        texto.tituloCentro("Exiba a média das notas:");
        System.out.println("--> " + soma / notas.size());

        texto.tituloCentro("Remova a nota zero:");
        notas.remove(0d);
        System.out.println("-->" + notas);

        texto.tituloCentro("Remova as notas menores que 7 e exiba a lista:");
        Iterator<Double> itarator2 = notas.iterator();
        while (itarator2.hasNext()) {
            Double next = itarator2.next();

            if (next < 7) itarator2.remove();
        }
        System.out.println("--> " + notas);

        texto.tituloCentro("Usando o LinkedHashSet");


        texto.tituloCentro("Exiba todas as notas na ordem em que foram informadas: ");
        // é um meio termo entre HashSet e TreeSet, ou seja, ela nos proporciona um pouco
        // da performance do HashSet e um pouco do poder de ordenação do TreeSet
        //Os elementos continuam na ordem que são inseridos, diferente do HashSet que “embaralha” tudo.
        //Complexidade para operações básicas
        Set<Double> notas2 = new LinkedHashSet<>();
        notas2.add(7d);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5d);
        notas2.add(7d);
        notas2.add(0d);
        notas2.add(3.6);
        System.out.println("--> " + notas2);

        texto.tituloCentro("Usando o TreeSet");

        texto.tituloCentro("Exiba todas as notas em ordem crescente");

        // independente da ordem que você inserir os elementos, eles serão ordenados.
        // Mas isso tem um custo, a complexidade para os métodos add, remove e contains
        // são bem maiores que do HashSet
        //Temos então que implementar a interface Comparable, que obrigatoriamente nos fara implementar
        // o método “compareTo”. É através deste método que diremos como o TreeSet deve ordenar nosso
        // Objeto em questão.
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println("--> " + notas3);

        texto.tituloCentro("Apague todo o conjunto: ");
        notas.clear();
        System.out.println("--> " + notas);

        texto.tituloCentro("Confira se o conjunto está vazio: ");
        System.out.println("--> " + notas.isEmpty());

    }

}
