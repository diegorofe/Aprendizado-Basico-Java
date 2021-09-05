package colecoes;

import java.util.*;

public class ExemploSet {
    public static void main(String[] args) {


        System.out.println("Crie um conjunto e adicione notas: ");
       //HashSet não ordena, os elementos repetidos só aparecem 1 vez,
        // não é possivel fazer busca como indice.
        Set<Double> notas = new HashSet<>(Arrays.asList(0d, 7d, 8.5, 5d, 7d, 8d, 3.6));
        System.out.println(notas.toString());

        // System.out.println("Exiba a posição da nota 5");

//        System.out.println("adicione a nota 8 na posicao 4");


        // System.out.println("Substitua a nota 5 pela nota 6: ");

        //System.out.println("Verifique se a nota 5 está no conjunto: " + notas.contains(5d));
//        System.out.println("Exiba a terceira nota adicionada");
        System.out.println("Exiba a menor nota: " + Collections.min(notas));
        System.out.println("Exiba a maior nota: "+ Collections.max(notas) );
        //Soma dos valores
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0.0;
        while (iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Exiba a soma dos valores: " + soma);

        System.out.println("Exiba a média das notas: " + soma/notas.size());

        System.out.println("Remova a nota zero: " + notas.remove(0d));
        System.out.println(notas);
        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> itarator2 = notas.iterator();
        while (itarator2.hasNext()){
            Double next = itarator2.next();

            if(next < 7) itarator2.remove();
        }
        System.out.println(notas);

        System.out.println("Exiba todas as notas na ordem em que foram informadas: ");

        Set<Double> notas2 = new LinkedHashSet<>();
        notas2.add(7d);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5d);
        notas2.add(7d);
        notas2.add(0d);
        notas2.add(3.6);
        System.out.println(notas2);

        System.out.println("Exiba todas as notas em ordemd crescente");

        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3);

        System.out.println("Apague todo o conjunto: ");
        notas.clear();

        System.out.println("Confira se o conjunto está vazio: " + notas.isEmpty());

    }

}
