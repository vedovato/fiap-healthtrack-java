import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Historico {
 	private float altura;
	private float peso;
	private String dtInclusao;
	
	private ArrayList<Historico> historicoArray = new ArrayList<>();

	protected void adicionar(float altura, float peso) {
		Historico item = new Historico();
		item.setDtInclusao();
		item.setAltura(altura);
		item.setPeso(peso);
		
		System.out.println("Registro de histórico adicionado!");
		historicoArray.add(item);
	}
	
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
	
	// -----------------------------------------------

	@Override
	public String toString() {
		return this.getDtInclusao() + " | [altura=" + this.getAltura() + ", peso=" + this.getPeso() + "]";
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

	private void setDtInclusao() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");  
		LocalDateTime now = LocalDateTime.now();
		this.dtInclusao = dtf.format(now);
	}
	
}
