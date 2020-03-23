package classi;

public class Utente 
{
	private String email, password, nome, cognome;

	public Utente(String nome, String cognome, String email, String password) 
	{
		this.email = email;
		this.password = password;
		this.nome = nome;
		this.cognome = cognome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	@Override
	public String toString() {
		return "Utente [email=" + email + ", password=" + password + ", nome=" + nome + ", cognome=" + cognome + "]";
	}
	
	
}
