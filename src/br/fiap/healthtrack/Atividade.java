package br.fiap.healthtrack;
import java.time.LocalDateTime;
import java.util.ArrayList;

import br.fiap.healthtrack.utils.DateTime;

/**
 * Abstração para Atividade física
 */
final class Atividade {
	private String tipoMensuracao;
	private String intensidade;
	private Exercicio exercicio;
	private LocalDateTime dtInclusao;
	
	ArrayList<Atividade> atividadeArray = new ArrayList<>();
	
	/**
	 * Inclui atividade na lista de atividades
	 * @param ex: Instancia de Exercicio
	 * @param tipoMensuracao: Metros ou Kilometros
	 * @param intensidade: Fácil/Regular/Difícil/Foo
	 * @see classe Exercicio
	 */
	public void adicionar(Exercicio ex, String tipoMensuracao, String intensidade) {
		Atividade item = new Atividade();
		item.setExercicio(ex);
		item.setTipoMensuracao(tipoMensuracao);
		item.setIntensidade(intensidade);
		item.setDtInclusao();
		
		System.out.println("Você adicionou \"" + ex.getNome() + "\" com sucesso!");
		atividadeArray.add(item);
	}
	
	/**
	 * Exibe todas as atividades registradas
	 */
	public void visualizar() {
		System.out.println("\n----- HISTÓRICO DE ATIVIDADES -----");
		
		if(atividadeArray.size() == 0) {
			System.out.println("Histórico vazio. Adicione uma atividade!");
			return;
		}
		
		for (Atividade atividade : atividadeArray) {
			System.out.println(atividade.toString());
		}
	}
	
	// -----------------------------------------------

	@Override
	public String toString() {
		return this.getDtInclusao() + " | [atividade=" + this.getExercicio().getNome() + ", dist/tempo=" + this.getExercicio().getQuantidade() + " " + this.getTipoMensuracao() + ", intensidade=" + this.getIntensidade() + "]";
	}

	public String getTipoMensuracao() {
		return this.tipoMensuracao;
	}

	public void setTipoMensuracao(String tipoMensuracao) {
		this.tipoMensuracao = tipoMensuracao;
	}

	public String getIntensidade() {
		return this.intensidade;
	}

	public void setIntensidade(String intensidade) {
		this.intensidade = intensidade;
	}

	public Exercicio getExercicio() {
		return this.exercicio;
	}

	public void setExercicio(Exercicio exercicio) {
		this.exercicio = exercicio;
	}

	public LocalDateTime getDtInclusao() {
		return this.dtInclusao;
	}
	
	public String getDtInclusaoFormat() {
		return new DateTime().dateTimeToString(this.dtInclusao);	
	}
	
	/**
	 * Registra a data atual
	 * @see br.fiap.healthtrack.utils
	 */
	public void setDtInclusao() {
		this.dtInclusao = new DateTime().get();
	}
	
}
