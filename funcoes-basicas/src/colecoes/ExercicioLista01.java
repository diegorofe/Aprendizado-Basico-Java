package colecoes;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

/*Faça um programa que receba a temperatura média os 6 primeiros meses do ano e armazene-as em uma lista.
Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média,
e em que mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro e etc).
*/
public class ExercicioLista01 {

    public static void main(String[] args) {

        //Lista que recebe 5 temperaturas
        List<Double> temp = new ArrayList<>();
        temp.add(30d);
        temp.add(29d);
        temp.add(22.5);
        temp.add(25d);
        temp.add(23d);
        temp.add(22d);

        //Obtendo a interacao
        Iterator<Double> i = temp.iterator();

        //variavel para somar temperaturas dos meses
        double soma = 0d;

        //loop na coleção
        while (i.hasNext()) {
            soma += i.next();
            // System.out.println(i.next());
        }

        //calcula média das temperaturas no periodo
        Double media = soma / temp.size();

        //imprime media
        System.out.println("Temperatura Média: "+ media);
        System.out.println("---\tTemperaturas acima da média\t---");

        Iterator<Double> i2 = temp.iterator();

        while (i2.hasNext()){
            double tempRegistrada = i2.next();

            /*caso tempRegistrada temperatura registrada seja maior que temp Registrada temperatura média
            imprime mes e temperatura
            * */
            if(tempRegistrada > media){
                int mes = temp.indexOf(tempRegistrada);
                switch (mes){
                    case 0:
                        System.out.println(tempRegistrada +"ºc"+" - Janeiro");
                        break;
                    case 1:
                        System.out.println(tempRegistrada +"ºc"+" - Fevereiro");
                        break;
                    case 2:
                        System.out.println(tempRegistrada +"ºc"+" - Março");
                        break;
                    case 3:
                        System.out.println(tempRegistrada +"ºc"+" - Abril");
                        break;
                    case 4:
                        System.out.println(tempRegistrada +"ºc"+" - Maio");
                        break;
                    case 5:
                        System.out.println(tempRegistrada +"ºc"+" - Junho");
                        break;
                }

            }
        }


    }
}


