public class HealthTrack {

	public static void main(String[] args) {
		// ## Nova conta comum
		Conta c1 = new Conta(null, "123mudar", "19992215720");
		c1.setDadosUsuario("Andrei Alves", 31, "M", "06/08/1990");
		
		// ## Login comum
		c1.login("19992215720", "123mudar");
		c1.exibirDadosDaConta();
		// c1.logout();
		
		// -----------------------------------------------
		
		// ## Nova conta social
		// Conta c2 = new Conta("elio@lima.com", "123mudar", null);
		// c2.setNome("Elio Goncalves");
		// c2.setTelefone("19992213030");
		// c2.setDtNascimento("12/05/1984");
		// c2.setIdade(42);
		// c2.setSexo("M");
		// c2.logout();
		
		// ## Login social
		// c2.loginSocial("elio@lima.com", "123mudar");
		// c2.exibirDadosDaConta();
		// c2.logout();
		
		// -----------------------------------------------
		
		// ## Historico de peso
		// c1.historico.adicionar(1.75f, 88);
		// c1.historico.adicionar(1.75f, 90);
		// c1.usuario.historico.visualizar();
		// System.out.println();
		
		// -----------------------------------------------
		
		// ## Hidratacao
		// c1.usuario.hidratacao.adicionar(600);
		// c1.usuario.hidratacao.adicionar(300);
		// c1.usuario.hidratacao.visualizar();
		// System.out.println();
		
		// -----------------------------------------------
		
		// ## Atividade
		System.out.println();
		Intensidade in1 = new Intensidade("Fácil", "=)");
		Exercicio ex1 = new Exercicio(20, in1);
		c1.usuario.atividade.adicionar("Corrida", ex1, "minutos");
		c1.usuario.atividade.visualizar();
	}

}