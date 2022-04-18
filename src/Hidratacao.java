import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Hidratacao {
	private float quantidade;
	private String dtInclusao;
	
	private ArrayList<Hidratacao> hidratacaoArray = new ArrayList<>();

	protected void adicionar(float quantidade) {
		Hidratacao item = new Hidratacao();
		item.setQuantidade(quantidade);
		item.setDtInclusao();
		
		System.out.println("Registro de hidratação adicionado!");
		hidratacaoArray.add(item);
	}
	
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

	private void setDtInclusao() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");  
		LocalDateTime now = LocalDateTime.now();
		this.dtInclusao = dtf.format(now);
	}

}
