package br.fiap.healthtrack;

/**
 * Abstração para Exercicios físicos
 */
final class Intensidade {
	private String nome;
	private int emoji;

	public Intensidade(String nome, int emoji) {
		this.setNome(nome);
		this.setEmoji(emoji);
	}

	// -----------------------------------------------
	
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getEmoji() {
		return this.emoji;
	}

	public void setEmoji(int emoji) {
		this.emoji = emoji;
	}
}
