package cliente;


import imovel.Imovel.*;
import cliente.Cliente;

public class ClienteVendedor extends Cliente
{
    HashMap<Int,Imovel> imoveis;
    public ClienteVendedor(int cpf, String nome, Endereco endereco, int telefone, String email)
    {
        super(cpf,nome,endereco,telefone,email);
        imoveis = new HashMap();
    }

    public void addImovel(Imovel imovel)
    {
        imovel.addDono(this);
        this.imoveis.put(imovel.getCodigo,imovel);
    }

    public Imovel findImovel(int codigo)
    {
        return imoveis.get(codigo);
    }
}
