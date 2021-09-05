package colecoes;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ExercicioLista02 {

    public static void main(String[] args) {


        List<String> respostas = new ArrayList<>();

        System.out.println("--\tInterrogatório Policial\t--");

        Scanner scan = new Scanner(System.in);


        System.out.println("Telefonou para a vítima? ");
        String resposta = scan.next();
        respostas.add(resposta.toLowerCase());

        System.out.println("Esteve no local do Crime? ");
        resposta = scan.next();
        respostas.add(resposta.toLowerCase());

        System.out.println("Mora perto da vítima? ");
        resposta = scan.next();
        respostas.add(resposta.toLowerCase());

        System.out.println("Devia para a vítima? ");
        resposta = scan.next();
        respostas.add(resposta.toLowerCase());

        System.out.println("Ja trabalhou com a vítima? ");
        resposta = scan.next();
        respostas.add(resposta.toLowerCase());



        int cont = 0;
        for (int i = 1; i <= respostas.size(); i++) {

            if (respostas.get(i-1).contains("s")) {

                cont += 1;

            }
        }
        //System.out.println(cont);
        switch (cont){
            case 2:
                System.out.println("Esta testemunha é suspeita!");
                break;
            case 3:
                System.out.println("Esta testemunha é cúmplice!");
                break;
            case 4:
                System.out.println("Esta testemunha é cúmplice!");
                break;
            case 5:
                System.out.println("Esta testemunha é a ASSASSINA!");
                break;
            default:
                System.out.println("Esta testemunha É INOCENTE");
                break;


        }



        }
}
