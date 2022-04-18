public class Usuario {
	private String nome;
	private int idade;
	private String sexo;
	private String dtNascimento;
	
	protected final Historico historico = new Historico();
	protected final Hidratacao hidratacao = new Hidratacao();
	protected final Atividade atividade = new Atividade();
	
	protected void setDadosUsuario(String nome, int idade, String sexo, String dtNascimento) {
		this.setDtNascimento(dtNascimento);
		this.setIdade(idade);
		this.setNome(nome);
		this.setSexo(sexo);
	}

	protected void exibirInformacoes() {
		System.out.println("Usuario { nome=" + this.getNome() + ", idade=" + this.getIdade() + ", sexo=" + this.getSexo() + ", nasc=" + this.getDtNascimento() + "}");
	}
	
	// -----------------------------------------------

	public String getNome() {
		return nome;
	}

	protected void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	protected void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSexo() {
		return sexo;
	}

	protected void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getDtNascimento() {
		return dtNascimento;
	}

	protected void setDtNascimento(String dtNascimento) {
		this.dtNascimento = dtNascimento;
	}
}
