package br.fiap.healthtrack;

/**
 * Implementação do Diagrama de Classe do HealthTrack
 * @author Grupo Firebug
 */
public class HealthTrack {

	public static void main(String[] args) {
		/* Nova conta comum */
		Conta c1 = new Conta(null, "123mudar", "19992215720");
		c1.setDadosUsuario("Andrei Vedovato", 31, "M", "06/08/1990");
		
		/* Login comum */
		c1.login("19992215720", "123mudar");
		c1.exibirDadosDaConta();
		//c1.desativarConta();
		//c1.logout();
		
		// -----------------------------------------------
		
		/* Nova conta social */
		//Conta c2 = new Conta("elio@lima.com", "123mudar", null);
		//c2.setNome("Elio Goncalves");
		//c2.setTelefone("19992213030");
		//c2.setDtNascimento("12/05/1984");
		//c2.setIdade(42);
		//c2.setSexo("M");
		
		/* Login social */
		//c2.loginSocial("elio@lima.com", "123mudar"); 
		//c2.exibirDadosDaConta();
		//c2.logout();
		
		System.out.println("\n-----------------------------------------------\n");
		
		/* Historico de peso */
		c1.usuario.historico.adicionar(1.75f, 75);
		c1.usuario.historico.adicionar(1.75f, 90);
		c1.usuario.historico.visualizar();
		
		System.out.println("\n-----------------------------------------------\n");
		
		/* Hidratacao */
		c1.usuario.hidratacao.adicionar(600);
		c1.usuario.hidratacao.adicionar(300);
		c1.usuario.hidratacao.visualizar();
		
		System.out.println("\n-----------------------------------------------\n");
		
		/* Atividade */
		Exercicio ex1 = new Exercicio("Corrida", 20);
		c1.usuario.atividade.adicionar(ex1, "minutos", "Fácil");
		c1.usuario.atividade.visualizar();
	}
	
}