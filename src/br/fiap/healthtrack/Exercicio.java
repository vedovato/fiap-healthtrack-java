package br.fiap.healthtrack;

/**
 * Abstração para Exercicios físicos
 */
final class Exercicio {
	private String nome;
	private float quantidade;

	public Exercicio(String nome, float quantidade) {
		this.setQuantidade(quantidade);
		this.setNome(nome);
	}

	// -----------------------------------------------
	
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getQuantidade() {
		return this.quantidade;
	}

	public void setQuantidade(float quantidade) {
		this.quantidade = quantidade;
	}
}
