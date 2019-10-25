package cliente;

import endereco.Endereco.*;

public class Cliente
{
    private int cpf;
    private String nome;
    private Endereco endereco;
    private int telefone;
    private String email;

    public Cliente(int cpf, String nome, Endereco endereco, int telefone, String email){
        this. cpf = cpf;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
    }
    
	public int getCpf() {
		return this.cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Endereco getEndereco() {
		return this.endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public int getTelefone() {
		return this.telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
