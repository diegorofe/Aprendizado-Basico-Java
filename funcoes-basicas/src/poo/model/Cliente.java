package poo.model;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class Cliente extends Pessoa{

    public  String numCartao;

    private List<Endereco> enderecos;



    public void adicionaEndereco(Endereco endereco){
        if (endereco ==  null){
            throw new NullPointerException("Endereco não pode ser nulo ou vazio.");
        }
        if (endereco.cep == null){
            throw new NullPointerException("Cep não pode ser nulo ou vazio.");
        }
        getEnderecos().add(endereco);
    }

    private List<Endereco> getEnderecos() {
        if (enderecos == null) {
            enderecos = new ArrayList<Endereco>();

        }
        return enderecos;
    }



}
