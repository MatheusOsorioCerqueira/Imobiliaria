package cliente;

import imovel.*;
import endereco.Endereco;

public class ClienteComprador extends Cliente
{
    private Imovel imovel;

    public ClienteComprador(int cpf, String nome, Endereco endereco, int telefone, String email)
    {
        super(cpf,nome,endereco,telefone,email);
    }
    
    public Imovel getImovel() {
        return this.imovel;
    }

    public void setImovel(Imovel imovel) {
        this.imovel = imovel;
    }
}
