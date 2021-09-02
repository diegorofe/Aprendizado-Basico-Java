package poo.model;

import java.util.ArrayList;

public class EntregaCartaoMap {

    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.cep = "54123221";
        //dados doo endereco
        Cliente cliente = new Cliente();
        //dados do cliente

        try {
        cliente.adicionaEndereco(endereco);
        System.out.println("Endereço adicionado com sucesso!");
    }catch (Exception e){
            System.err.println("Erro "+ e);
        }
}
}
