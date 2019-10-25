package corretor;

import endereco.Endereco;

public static class Corretor
{
    private String matricula;
    private String nome;
    private Endereco endereco;

    public Corretor(String matricula, String nome, Endereco endereco){
        this.matricula = matricula;
        this.nome = nome;
        this. endereco = endereco;
    }
	public String getMatricula() {
		return this.matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
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

}
