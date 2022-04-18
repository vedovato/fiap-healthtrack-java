import utils.DateTime;

public class Conta extends Usuario {
	private String email;
	private String senha;
	private String telefone;
	private String tipoLogin;
	private String ultimoLogin;
	private boolean statusPerfil;
	private boolean logado;
	
	protected Usuario usuario = new Usuario();

	public Conta(String email, String senha, String telefone) {
		this.setEmail(email);
		this.setSenha(senha);
		this.setTelefone(telefone);
		this.setStatusPerfil(true);
		this.logado = false;
	}
	
	public void login(String telefone, String senha) {
		if(!this.getTelefone().equals(telefone) || this.getSenha() != senha) {
			System.out.println("Usuário e/ou senha incorretos.");
			return;
		}
		
		System.out.println(this.getNome() + " está logado!");
		this.setTipoLogin("comum");
		this.setUltimoLogin();
		this.setLogado(true);
	}
	
	public void loginSocial(String email, String senha) {
		if(this.getEmail() != email || this.getSenha() != senha) {
			System.out.println("Login social inválido.");
			return;
		}
		
		System.out.println(this.getNome() + " está logado via redes sociais!");
		this.setTipoLogin("social");
		this.setUltimoLogin();
		this.setLogado(true);
	}
	
	public void logout() {
		if(!this.isLogado()) {
			System.out.println("\nUsuário não está logado!");
		} else {
			System.out.println("\nLogout realizado com sucesso!");
			this.setLogado(false);
		}
	}
	
	public void desativarConta() {
		if(!this.getStatusPerfil()) {
			System.out.println("Usuário inativo");
			return;
		}
		
		this.setStatusPerfil(false);
		this.logout();
	}
	
	public void exibirDadosDaConta() {
		System.out.println("\n----- DADOS DA CONTA -----");
		
		if (!this.isLogado()) {
			System.out.println("Informação confidencial. Usuário não logado!");
			return;
		}
		
		System.out.println("Proprietário(a): " + this.getNome());
		System.out.println("Idade: " + this.getIdade());
		if(this.getTipoLogin().equals("social") || this.getEmail() != null)
			System.out.println("Email: " + this.getEmail());
		if(this.getTipoLogin().equals("comum") || this.getTelefone() != null)
			System.out.println("Telefone: " + this.getTelefone());
		System.out.println("Senha: ******");
		System.out.println("Status da Conta: " + this.parseStatusPerfil());
		System.out.println("Tipo de Login: " + this.getTipoLogin());
		System.out.println("Ultimo Login: " + this.parseUltimoLogin());
	}
	
	private String parseUltimoLogin() {
		String login = this.getUltimoLogin() == null ? "Nunca" : this.getUltimoLogin();
		return login;
	}
	
	private String parseStatusPerfil() {
		String status = this.getStatusPerfil() ? "ativo" : "inativo";
		return status;
	}
	
	// -----------------------------------------------

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getTipoLogin() {
		return tipoLogin;
	}

	private void setTipoLogin(String tipoLogin) {
		this.tipoLogin = tipoLogin;
	}

	public boolean getStatusPerfil() {
		return statusPerfil;
	}

	private void setStatusPerfil(boolean statusPerfil) {
		this.statusPerfil = statusPerfil;
	}

	private String getUltimoLogin() {
		return ultimoLogin;
	}

	private void setUltimoLogin() {
		this.ultimoLogin = new DateTime().now();
	}

	public boolean isLogado() {
		return logado;
	}

	private void setLogado(boolean logado) {
		this.logado = logado;
	}
}
