package colecoes;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.*;

public class ExercicioMap01 {


    public static void main(String[] args) {
        Map<String, Integer> populacao = new HashMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3532265);
        }};
        ImprimirTexto texto = new ImprimirTexto();

        texto.tituloCentro("Substitua a populacao do RN");
        System.out.println("População anterior");
        System.out.println("População anteior --> " + populacao.get("RN"));
     ;
        populacao.put("RN", 3534165);
        System.out.println("Nova população --> "+populacao.get("RN"));

        texto.tituloCentro("Confira se o estado PB está no dicionário");
        if(populacao.containsKey("PB") == false){
            populacao.put("PB", 4039277);
            System.out.println(populacao.toString());
        };

        texto.tituloCentro("Imprima a população de pernambuco");
        System.out.println("Poupulação de pernambuco é: " + populacao.get("PE"));

        texto.tituloCentro("Exiba todos os estados e sua população na ordem de inserção");
        Map<String, Integer> populacao2 = new LinkedHashMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3532265);
        }};
        System.out.println(populacao2.toString() );


        texto.tituloCentro("Exiba os estados e sua população em ordem alfabética");
        Map<String, Integer> populacao3 = new TreeMap<>(populacao);
        System.out.println(populacao3);


        texto.tituloCentro("Exiba o estado com menor população.");
        Integer menorPopulacao = Collections.min(populacao.values());
        Set<Map.Entry<String, Integer>> entries = populacao.entrySet();
        String estadoMenor = "";
        for( Map.Entry<String, Integer> entry : entries){
            if(entry.getValue().equals(menorPopulacao)){
                estadoMenor = entry.getKey();
                System.out.println(estadoMenor + " - " + menorPopulacao);
            }
        }

        texto.tituloCentro("Exiba o estado com maior população.");
        Integer maiorPopulacao = Collections.max(populacao.values());
        Set<Map.Entry<String, Integer>> entries2 = populacao.entrySet();
        String estadoMaior = "";
        for( Map.Entry<String, Integer> entry : entries2){
            if(entry.getValue().equals(maiorPopulacao)){
                estadoMaior = entry.getKey();
                System.out.println(estadoMaior + " - " + maiorPopulacao);
            }
        }

        texto.tituloCentro("Exiba a soma da população desses estados");
        Iterator<Integer> iterator = populacao.values().iterator();
        Integer soma = 0;
        while ( iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println(soma);

        texto.tituloCentro("Exiba a média das populações");
        System.out.println(soma/populacao.size());

        texto.tituloCentro("Remova os estados com populacao menor que 4000000");
        Iterator<Integer> iterator2 = populacao.values().iterator();
        while (iterator2.hasNext()){

            if(iterator2.next().intValue() < 4000000){
            iterator2.remove();
            }
        }
        System.out.println(populacao);

        texto.tituloCentro("Apague o dicionário de estados");
        populacao.clear();
        System.out.println(populacao.toString());

    }


}
