package colecoes;

import java.util.HashMap;
import java.util.Map;

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


    }


}
