package visita;

import corretor.Corretor;
import imovel.Imovel;
import cliente.ClienteComprador;

public class Visita
{
    private HashMap<Int,Imovel> imoveis;
    private HashMap<String,Corretor> corretores;
    private ClienteComprador cliente;
    private float custoVisita;

    public Visita(float custoVisita)
    {
        this.corretores = new HashMap();
        this.imoveis = new HashMap();
    }
	public ClienteComprador getCliente() {
		return this.cliente;
	}

	public void setCliente(ClienteComprador cliente) {
		this.cliente = cliente;
	}

	public float getCustoVisita() {
		return this.custoVisita;
	}

	public void setCustoVisita(float custoVisita) {
		this.custoVisita = custoVisita;
    }
    
    public float custoTotalVisita()
    {
        float soma=0;
        for(Imovel i: this.imoveis.values())
        {
            soma+= this.custoVisita;
        }
        return soma;
    }

    

}
