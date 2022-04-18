package br.fiap.healthtrack;
import java.util.ArrayList;

import br.fiap.healthtrack.utils.DateTime;

/**
 * Abstração para histórico de saúde
 */
final class Historico {
 	private float altura;
	private float peso;
	private String dtInclusao;
	
	private ArrayList<Historico> historicoArray = new ArrayList<>();

	/**
	 * Adiciona um registro no histórico
	 * @param altura do usuario (ex: 1.72)
	 * @param peso do usuario (ex: 88.4)
	 */
	protected void adicionar(float altura, float peso) {
		Historico item = new Historico();
		item.setDtInclusao();
		item.setAltura(altura);
		item.setPeso(peso);
		
		System.out.println("Registro de histórico adicionado!");
		historicoArray.add(item);
	}
	
	/**
	 * Exibe todo o histórico inserido
	 * @see adicionar
	 */
	protected void visualizar() {
		System.out.println("\n----- HISTÓRICO DE SAÚDE -----");
		
		if(historicoArray.size() == 0) {
			System.out.println("Histórico vazio. Adicione um item!");
			return;
		}
		
		for (Historico historico2 : historicoArray) {
			System.out.println(historico2.toString());
		}
	}
	
	/**
	 * Calcula de forma simples o IMC estimado
	 * @see https://calculosimples.com/imc.html
	 * @return Grau de obesidade aproximado
	 */
	private String exibirIMC() {
		float alturaQuadrado = this.getAltura() * this.getAltura();
		float imc =this.getPeso() / alturaQuadrado;
		
		if(imc <= 18.5) { return "Magreza"; } 
		else if (imc >= 18.5 && imc <= 24.9) { return "Normal"; }
		else if (imc >= 25 && imc <= 29.9) { return "Sobrepeso"; }
		else if (imc >= 3 && imc <= 39.9) { return "Obesidade"; }
		else { return "Obesidade grave"; }
	}
	
	// -----------------------------------------------
	
	@Override
	public String toString() {
		return this.getDtInclusao() + " | [altura=" + this.getAltura() + "cm, peso=" + this.getPeso() + "kg" + ", IMC=" + this.exibirIMC() + "]";
	}
	
	private float getAltura() {
		return altura;
	}

	private void setAltura(float altura) {
		this.altura = altura;
	}

	private float getPeso() {
		return peso;
	}

	private void setPeso(float peso) {
		this.peso = peso;
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
