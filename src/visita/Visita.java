package visita;

import corretor.Corretor;
import imovel.Imovel;
import cliente.ClienteComprador;
import java.util.HashMap;
import java.util.Date;

public class Visita
{
    public final static int FEITA = 0;
    public final static int CANCELADA = -1;
    public final static int AGUARDANDO = 1;
    private HashMap<String,Imovel> imoveis;
    private HashMap<String,Corretor> corretores;
    private ClienteComprador cliente;
    private float custoVisita;
    private int status;
    private Date data;

    public Visita(float custoVisita, ClienteComprador c, Date d){
        this.corretores = new HashMap();
        this.imoveis = new HashMap();
        this.cliente = c;
        this.data = d;
        this.status = 1;
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
    
    public void addImovel(Imovel i){
        imoveis.put(i.getCodigo(), i);
    }
    
    public void removeImovel(Imovel i){
        imoveis.remove(i.getCodigo());
    }
    
    public void addCorretor(Corretor c){
        corretores.put(c.getMatricula(), c);
    }
    
    public void removeCorretor(Corretor c){
        corretores.remove(c.getMatricula());
    }

    public void setStatus(String status) {
        if(status == "FEITA")
            this.status = FEITA;
        else if(status == "CANCELADA")
            this.status = CANCELADA;
        else if(status == "AGUARDANDO")
            this.status = AGUARDANDO;
    }
    
    public int getStatus() {
        return status;
    }
    
}
