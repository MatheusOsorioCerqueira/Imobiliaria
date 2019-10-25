package cliente;


import imovel.Imovel.*;
import cliente.Cliente;
import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;
import endereco.Endereco;
import imovel.Imovel;
import java.util.HashMap;

public class ClienteVendedor extends Cliente
{
    HashMap<String, Imovel> imoveis;
    public ClienteVendedor(int cpf, String nome, Endereco endereco, int telefone, String email)
    {
        super(cpf,nome,endereco,telefone,email);
        imoveis = new HashMap();
    }

    public void addImovel(Imovel imovel)
    {
        imovel.setDono(this);
        this.imoveis.put(imovel.getCodigo(),imovel);
    }

    public Imovel findImovel(int codigo)
    {
        return imoveis.get(codigo);
    }
}
