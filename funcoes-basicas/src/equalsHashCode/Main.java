package equalsHashCode;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Carro> listaCarros = new ArrayList<>();

        listaCarros.add(new Carro("Ford"));
        listaCarros.add(new Carro("Kia"));
        listaCarros.add(new Carro("Chevrollet"));

        System.out.println(listaCarros.contains(new Carro("ford")));
        System.out.println(new Carro("Ford").hashCode());
        System.out.println(new Carro("Ford1").hashCode());

        Carro carro1 = new Carro("ford");
        Carro carro2 = new Carro("Chevrollet");

        System.out.println(carro1.equals(carro2));

    }
}
