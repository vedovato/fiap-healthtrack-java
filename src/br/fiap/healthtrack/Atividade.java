package br.fiap.healthtrack;
import java.util.ArrayList;

import br.fiap.healthtrack.utils.DateTime;

/**
 * Abstração para Atividade física
 */
final class Atividade {
	private String tipoMensuracao;
	private String intensidade;
	private Exercicio exercicio;
	private String dtInclusao;
	
	ArrayList<Atividade> atividadeArray = new ArrayList<>();
	
	/**
	 * Inclui atividade na lista de atividades
	 * @param ex: Instancia de Exercicio
	 * @param tipoMensuracao: Metros ou Kilometros
	 * @param intensidade: Fácil/Regular/Difícil/Foo
	 * @see classe Exercicio
	 */
	protected void adicionar(Exercicio ex, String tipoMensuracao, String intensidade) {
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
	protected void visualizar() {
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

	private String getTipoMensuracao() {
		return tipoMensuracao;
	}

	private void setTipoMensuracao(String tipoMensuracao) {
		this.tipoMensuracao = tipoMensuracao;
	}

	private String getIntensidade() {
		return intensidade;
	}

	private void setIntensidade(String intensidade) {
		this.intensidade = intensidade;
	}

	private Exercicio getExercicio() {
		return exercicio;
	}

	private void setExercicio(Exercicio exercicio) {
		this.exercicio = exercicio;
	}

	private String getDtInclusao() {
		return dtInclusao;
	}
	
	/**
	 * Registra a data atual
	 * @see br.fiap.healthtrack.utils
	 */
	private void setDtInclusao() {
		this.dtInclusao = new DateTime().now();
	}
	
}
