package poo.model;

import java.util.ArrayList;

public class EntregaCartaoMap {

    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.cep = "54123221";
        //Dados doo endereco

        Cliente cliente = new Cliente();
        cliente.nome = "Diego";
        cliente.documento = "12345678999";
        //Dados do cliente

        try {
        cliente.adicionaEndereco(endereco);

        System.out.println("Endereço de " + cliente.getNome() +  " foi adicionado com sucesso!");
    }catch (Exception e){
            System.err.println("Erro "+ e);
        }

}
}
