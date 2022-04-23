package br.fiap.healthtrack;
import java.time.LocalDateTime;
import java.util.ArrayList;

import br.fiap.healthtrack.utils.DateTime;

/**
 * Abstração para hidratação do dia
 */
final class Hidratacao {
	private float quantidade;
	private LocalDateTime dtInclusao;
	
	private ArrayList<Hidratacao> hidratacaoArray = new ArrayList<>();

	/**
	 * Inclui consumo de líquido
	 * @param quantidade em ml
	 */
	public void adicionar(float quantidade) {
		Hidratacao item = new Hidratacao();
		item.setQuantidade(quantidade);
		item.setDtInclusao();
		
		System.out.println("Registro de hidratação adicionado!");
		hidratacaoArray.add(item);
	}
	
	/**
	 * Exibe total ingerido + histórico completo registrado
	 */
	public void visualizar() {
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

	public float getQuantidade() {
		return this.quantidade;
	}

	public void setQuantidade(float quantidade) {
		this.quantidade = quantidade;
	}

	public String getDtInclusaoFormat() {
		return new DateTime().dateTimeToString(this.dtInclusao);
	}
	
	public LocalDateTime getDtInclusao() {
		return this.dtInclusao;
	}
	
	/**
	 * Registra a data atual
	 * @see br.fiap.healthtrack.utils
	 */
	public void setDtInclusao() {
		this.dtInclusao = new DateTime().get();
	}
	
}
