package br.fiap.healthtrack;

import java.time.LocalDateTime;

import br.fiap.healthtrack.utils.DateTime;

public class Usuario {
	private String nome;
	private int idade;
	private String sexo;
	private LocalDateTime dtNascimento;
	
	protected final Historico historico = new Historico();
	protected final Hidratacao hidratacao = new Hidratacao();
	protected final Atividade atividade = new Atividade();
	
	
	public void setDadosUsuario(String nome, int idade, String sexo, String dtNascimento) {
		this.setDtNascimento(new DateTime().StringToDate(dtNascimento));
		this.setIdade(idade);
		this.setNome(nome);
		this.setSexo(sexo);
	}
	
	public void exibirInformacoes() {
		System.out.println("Usuario { nome=" + this.getNome() + ", idade=" + this.getIdade() + ", sexo=" + this.getSexo() + ", nasc=" + this.getDtNascimento() + "}");
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public LocalDateTime getDtNascimento() {
		return this.dtNascimento;
	}
	
	public String getDtNascimentoFormat() {
		return new DateTime().dateTimeToString(this.dtNascimento);
	}

	public void setDtNascimento(LocalDateTime dtNascimento) {
		this.dtNascimento = dtNascimento;
	}
}
