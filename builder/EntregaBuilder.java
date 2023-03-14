package padroescriacao_exercicios.builder;

import padroescriacao.builder.AlunoBuilder;

import java.util.Date;

public class EntregaBuilder {

    private Entrega entrega;

    public EntregaBuilder (){
        entrega= new Entrega();
    }

    public Entrega build(){
        if (entrega.getCep() == 0) {
            throw new IllegalArgumentException("Cep inválido");
        }
        if (entrega.getDestinatario().equals("")) {
            throw new IllegalArgumentException("Destinatario inválido");
        }
        return entrega;
    }
    public EntregaBuilder setCep(int cep) {
        entrega.setCep(cep);
        return this;
    }

    public EntregaBuilder setDestinatario(String destinatario) {
        entrega.setDestinatario(destinatario);
        return this;
    }



    public EntregaBuilder setCpf(String cpf) {
        entrega.setCpf(cpf);
        return this;
    }


    public EntregaBuilder setEnderecoLogradouro(String enderecoLogradouro) {
        entrega.setEnderecoLogradouro(enderecoLogradouro);
        return this;
    }

    public EntregaBuilder setEnderecoNumero(int enderecoNumero) {
        entrega.setEnderecoNumero(enderecoNumero);
        return this;
    }

    public EntregaBuilder setEnderecoComplemento(String enderecoComplemento) {
        entrega.setEnderecoComplemento(enderecoComplemento);
        return this;
    }

    public EntregaBuilder setEnderecoBairro(String enderecoBairro) {
        entrega.setEnderecoBairro(enderecoBairro);
        return this;
    }

    public EntregaBuilder setEnderecoCidade(String enderecoCidade) {
        entrega.setEnderecoCidade(enderecoCidade);
        return this;
    }

    public EntregaBuilder setEnderecoUF(String enderecoUF) {
        entrega.setEnderecoUF(enderecoUF);
        return this;
    }



    public EntregaBuilder setEmail(String email) {
        entrega.setEmail(email);
        return this;
    }

    public EntregaBuilder setCelular(String celular) {
        entrega.setCelular(celular);
        return this;
    }
    }
