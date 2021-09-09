package com.projeto.atribuicaoreferencia;

import colecoes.ImprimirTexto;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        ImprimirTexto texto = new ImprimirTexto();

        //Demonstração curso DIO Estrutura de dados
        //Nas variáveis o java copia o valor para cada variável
        int a = 1;
        int b = a;
        texto.tituloCentro("Usando variáveis");
        System.out.println("Inteiro a = " + a +
                "\nInteiro b = "+b);
        a = 2;
        System.out.println("Inteiro a = " + a +
                "\nInteiro b = "+b);


        //O java copia a referência para o objeto
        texto.tituloCentro("Usando Objetos");
        MeuObj obja = new MeuObj(1);
        MeuObj objb = obja;

        System.out.println("Objeto a = "+ obja.toString() +
                "\nObjeto b = "+ objb);

        obja.setNum(2);
        System.out.println("Objeto a = "+ obja.toString() +
                "\nObjeto b = "+ objb);
    }
}
