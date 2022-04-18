
public class Exercicio {
	private float quantidade;
	private Intensidade intensidade = new Intensidade(null, null);

	public Exercicio(float quantidade, Intensidade intensidade) {
		this.setQuantidade(quantidade);
//		intensidade(nome, emoji);
	}
	
	protected void teste() {
		System.out.println("teste ok");
	}

	public float getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(float quantidade) {
		this.quantidade = quantidade;
	}

	public Intensidade getIntensidade() {
		return intensidade;
	}

	public void setIntensidade(Intensidade intensidade) {
		this.intensidade = intensidade;
	}
}
