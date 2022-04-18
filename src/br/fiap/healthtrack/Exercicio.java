package br.fiap.healthtrack;
public class Exercicio {
	private String nome;
	private float quantidade;

	public Exercicio(String nome, float quantidade) {
		this.setQuantidade(quantidade);
		this.setNome(nome);
	}

	// -----------------------------------------------
	
	protected String getNome() {
		return nome;
	}

	private void setNome(String nome) {
		this.nome = nome;
	}

	protected float getQuantidade() {
		return quantidade;
	}

	private void setQuantidade(float quantidade) {
		this.quantidade = quantidade;
	}
}
