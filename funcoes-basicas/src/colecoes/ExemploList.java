package colecoes;

import java.util.*;


public class ExemploList {


    public static void main(String[] args) {


//        List notas = new ArrayList();
        //Diamond Operation. Não prcisa colocar o 2 Double
//        List<Double> notas = new ArrayList<Double>();
//        ArrayList<Double> notas = new ArrayList<>();
        //Não pode adicionar nem remover elementos da lista
//        List<Double> notas =  Arrays.asList(
//          7d, 8.5, 9.3, 5d, 7d, 0d, 3.6
//        );
//        notas.add(10d);
//        notas.remove(5d);
//        System.out.println(notas)

        System.out.println("Crie uma lista e adicione as sete notas: ");

        List<Double> notas = new ArrayList<Double>();
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.8);
        notas.add(9.0);
        notas.add(3.6);
        System.out.println(notas.toString());
//
        System.out.println("--------------------");
//
//        System.out.println("Exiba a posição da nota 5.0: " + notas.indexOf(5d));
//
//        System.out.println("--------------------");
//
//        System.out.println("Adicione na lista a nota 8 na posição 4: ");
//        notas.add(4, 8d);
//        System.out.println(notas);
//
//        System.out.println("--------------------");
//
//        System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
//        notas.set(notas.indexOf(5d), 6.0);
//        System.out.println(notas);
//
//        System.out.println("--------------------");
//
//        System.out.println("confira se  anota 5.0 está na lista: " + notas.contains(5d));
//
//        System.out.println("--------------------");
//
//        System.out.println("Exiba todos os elementos conforme foram adicionados: ");
//        for (Double nota : notas) System.out.println(nota);
//
//        System.out.println("--------------------");
//
//        System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));
//
//        System.out.println("--------------------");
//
//        System.out.println("Exiba a menor nota: " + Collections.min(notas));
//
//        System.out.println("--------------------");
//
//        System.out.println("Exiba a maior nota: " + Collections.max(notas));
//
//        System.out.println("--------------------");
//
//        Iterator<Double> iterator = notas.iterator();
//        Double soma = 0d;
//        while (iterator.hasNext()) {
//            Double next = iterator.next();
//            soma += next;
//        }
//        System.out.println(String.format("A soma das notas é: " + soma));
//
//        System.out.println("--------------------");
//
//        System.out.println("Exiba a média das notas: " + (soma / notas.size()));
//
//        System.out.println("--------------------");
//
//        System.out.println("dRemova a nota 3.6: ");
//
//        notas.remove(3.6);
//        System.out.println(notas);
//
//        System.out.println("--------------------");
//
//        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
//        Iterator<Double> iterator1 = notas.iterator();
//        while (iterator1.hasNext()) {
//            Double next = iterator1.next();
//            if (next < 7) iterator1.remove();
//        }
//        System.out.println(notas);
//
//        System.out.println("--------------------");
//
//        System.out.println("Apague toda a lista!");
//        notas.clear();
//        System.out.println(notas);
//
//        System.out.println("--------------------");

        /*
        Desafios:
        Crie uma lista chamada notas2 e coloque todos
        os elementos da list ArrayList nessa nova lista
         */
//        List<Double> notas2 = new ArrayList<>(notas);
        LinkedList<Double> notas2 = new LinkedList<>(notas);

        System.out.println(notas2);

        System.out.println("--------------------");

        System.out.println("Mostre o primeira nota da nova lista sem removê-lo: "+ notas2.get(0));

        System.out.println("--------------------");
        System.out.println("Lista: " + notas2);
        System.out.println("Mostre a primeira nota da nova lista removendo-a: " + notas2.remove(0));
        System.out.println(notas2);
    }


}
