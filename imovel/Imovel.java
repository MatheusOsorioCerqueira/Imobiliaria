package imovel;

import cliente.ClienteVendedor;
import endereco.Endereco;

public class Imovel
{
    private int codigo;
    private ClienteVendedor dono;
    private Endereco endereco;
    private String tipo;
    private int qtdeQuartos;
    private float valorVenda;

    public Imovel(int codigo, Endereco endereco, String tipo, int qtdeQuartos, float valorVenda)
    {
        this.codigo = codigo;
        this.endereco = endereco;
        this.tipo = tipo;
        this.qtdeQuartos = qtdeQuartos;
        this.valorVenda = valorVenda;
    }

	public int getCodigo() {
		return this.codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public ClienteVendedor getDono() {
		return this.dono;
	}

	public void setDono(ClienteVendedor dono) {
		this.dono = dono;
	}

	public Endereco getEndereco() {
		return this.endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getQtdeQuartos() {
		return this.qtdeQuartos;
	}

	public void setQtdeQuartos(int qtdeQuartos) {
		this.qtdeQuartos = qtdeQuartos;
	}

	public float getValorVenda() {
		return this.valorVenda;
	}

	public void setValorVenda(float valorVenda) {
		this.valorVenda = valorVenda;
	}

}
