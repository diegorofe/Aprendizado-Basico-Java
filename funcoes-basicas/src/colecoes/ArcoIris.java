package colecoes;

import java.util.*;

public class ArcoIris {

    public static void main(String[] args) {
        ImprimirTexto texto = new ImprimirTexto();

        texto.tituloCentro("Cores do Arco-íris");
        Set<String> cores = new LinkedHashSet<>();
        cores.add("violeta");
        cores.add("anil");
        cores.add("azul");
        cores.add("verde");
        cores.add("amarelo");
        cores.add("laranja");
        cores.add("vermelho");
        for (String cor : cores) System.out.println(cor);

        texto.tituloCentro("Quantidade de cores do Arco-íris");
        System.out.println(cores.size() + "cores");

        texto.tituloCentro("Cores do Arco-íris em Ordem Alfabética");
        Set<String> cores2 = new TreeSet<>(cores);
        for (String cor : cores2) System.out.println(cor);

        texto.tituloCentro("Cores do Arco-íris em Ordem Inversa da Informada");
        Set<String> cores3 = new LinkedHashSet<>(cores);
        System.out.println("Lista inserida: " + cores);
        List<String> coresList = new ArrayList<>(cores3);
        Collections.reverse(coresList);
        System.out.println("Lista invertida: " + coresList);


        texto.tituloCentro("Cores que começam com 'V'");
        for (String cor : cores) {

            if (cor.toLowerCase().startsWith("v")) System.out.println(cor.toLowerCase());
        }

        texto.tituloCentro("Removendo cores que não começam com 'V'");
       Iterator<String> iterator = cores.iterator();
        while (iterator.hasNext()){
            if (iterator.next().toLowerCase().startsWith("v") ) {
                iterator.remove();
            }
    }
        System.out.println(cores);

        texto.tituloCentro("Removendo todas as cores");
        cores.clear();
        System.out.println(cores);

        texto.tituloCentro("O conjunto está vazio? ");
          System.out.println(cores.isEmpty());
    }
}
