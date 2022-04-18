package br.fiap.healthtrack;
import java.util.ArrayList;

import br.fiap.healthtrack.utils.DateTime;

/**
 * Abstração para hidratação do dia
 */
final class Hidratacao {
	private float quantidade;
	private String dtInclusao;
	
	private ArrayList<Hidratacao> hidratacaoArray = new ArrayList<>();

	/**
	 * Inclui consumo de líquido
	 * @param quantidade em ml
	 */
	protected void adicionar(float quantidade) {
		Hidratacao item = new Hidratacao();
		item.setQuantidade(quantidade);
		item.setDtInclusao();
		
		System.out.println("Registro de hidratação adicionado!");
		hidratacaoArray.add(item);
	}
	
	/**
	 * Exibe total ingerido + histórico completo registrado
	 */
	protected void visualizar() {
		System.out.println("\n----- HISTÓRICO DE HIDRATAÇÃO -----");
		
		if(hidratacaoArray.size() == 0) {
			System.out.println("Histórico vazio. Adicione um item!");
			return;
		}
		
		float total = 0;
		for (int i = 0; i < hidratacaoArray.size(); i++) {
			total += hidratacaoArray.get(i).quantidade;
		}
		
		System.out.println("Total ingerido hoje: " + total/1000 + " litros");
		
		for(Hidratacao hidratacaoItem: hidratacaoArray) {
			System.out.println(hidratacaoItem.toString());
		}
	}

	// -----------------------------------------------

	@Override
	public String toString() {
		return this.getDtInclusao() + " | [quantidade=" + this.getQuantidade() + "]";
	}

	private float getQuantidade() {
		return quantidade;
	}

	private void setQuantidade(float quantidade) {
		this.quantidade = quantidade;
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
