package colecoes;

import java.lang.reflect.MalformedParameterizedTypeException;
import java.util.*;

public class ExemploMap {

    public static void main(String[] args) {
        //Iniciando um Map<Chave, Valor> utilizando HashMap(não ordena)

        ImprimirTexto texto = new ImprimirTexto();


texto.tituloCentro(("Crie um dicionario de carros e consumo"));
        Map<String, Double> carrosPopulares = new HashMap<>() {{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};



        //    System.out.println(carrosPopulares.toString());

        texto.tituloCentro("Substitua o consumo do gol por 15,2 km/l");
        carrosPopulares.put("gol", 16.1);
        System.out.println(carrosPopulares.toString());

        texto.tituloCentro("Confira se o modelo Tucson está no dicionário");
        System.out.println(carrosPopulares.containsKey("Tucson"));

        texto.tituloCentro("Exiba o consumo do Uno");
        System.out.println(carrosPopulares.get("uno"));

        texto.tituloCentro("Exiba os modelos");
        Set<String> modelos = carrosPopulares.keySet();
        System.out.println(modelos);

        texto.tituloCentro("Exiba os consumos dos carros");
        Collection<Double> consumos = carrosPopulares.values();
        System.out.println(consumos);

        texto.tituloCentro("Exiba o modelo mais econômico e seu consumo");


        Double sonsumoMaisEficiente = Collections.max(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        String modeloMaisEficiente = "";
        for (Map.Entry<String, Double> entry : entries) {
            if (entry.getValue().equals(sonsumoMaisEficiente)) {
                modeloMaisEficiente = entry.getKey();
                System.out.println(modeloMaisEficiente);
            }
        }

        texto.tituloCentro("Exiba o modelo menos econômico");

        Double consumoMenosEficiente = Collections.min(carrosPopulares.values());
        String modeloMenosEficiente = "";
        for (Map.Entry<String, Double> entry : carrosPopulares.entrySet()) {
            if (entry.getValue().equals(consumoMenosEficiente)) {
                modeloMenosEficiente = entry.getKey();
                System.out.println(modeloMenosEficiente);
            }
        }

        texto.tituloCentro("Exiba a soma dos consumos");
        Iterator<Double> iterator = carrosPopulares.values().iterator();
        Double soma = 0d;
        while (iterator.hasNext()) {
            soma += iterator.next();
        }
        System.out.println(soma);

        texto.tituloCentro("Exiba a média dos consumos deste dicionário de carros");
        System.out.println(soma / carrosPopulares.size());


texto.tituloCentro("Remova os modelos que tem consumo igual a 15,6 km/l");
Iterator<Double> iterator1 = carrosPopulares.values().iterator();

while (iterator1.hasNext()){
    if(iterator1.next().equals(15.6)) {
        iterator1.remove();
    }

}
        System.out.println(carrosPopulares);

texto.tituloCentro("Exiba todos os carros na ordem que foram inseridos");

        Map<String, Double> carrosPopulares1 = new LinkedHashMap<>() {{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopulares1.toString());

        texto.tituloCentro("Exiba o dicionário ordenado pelo modelo");
        Map<String, Double> carrosPopulares2 = new TreeMap<>(carrosPopulares1);
        System.out.println(carrosPopulares2.toString());

        texto.tituloCentro("Apague o dicionário de carro");
        carrosPopulares2.clear();
        System.out.println(carrosPopulares2);

        texto.tituloCentro("Confira se o dicionário de carros está vazio");
        System.out.println(carrosPopulares2.isEmpty());

    }


}
