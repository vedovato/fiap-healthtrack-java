public class Atividade {
	private String nome;
	private String tipoMensuracao;
	
	private Exercicio exercicio;
	
	protected void adicionar(String nome, Exercicio ex, String tipoMensuracao) {
		System.out.println("add atividade");
//		this.exercicio.teste();
	}
	
	protected void visualizar() {
		System.out.println("visualizar itens!");
	}
	
	public void remover() {}
	
	// -----------------------------------------------

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipoMensuracao() {
		return tipoMensuracao;
	}

	public void setTipoMensuracao(String tipoMensuracao) {
		this.tipoMensuracao = tipoMensuracao;
	}

}
