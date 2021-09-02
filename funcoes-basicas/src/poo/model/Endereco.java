package poo.model;

public class Endereco {

    //Cria cada tipo de endereço
    public enum TipoEndereco {
    RESIDENCIAL,
    ENTREGA,
    TRABALHO }

    public String logradouro;
    public String numero;
    public String complemento;
    public String bairro;
    public String cidade;
    public String estado;
    public String cep;
}

