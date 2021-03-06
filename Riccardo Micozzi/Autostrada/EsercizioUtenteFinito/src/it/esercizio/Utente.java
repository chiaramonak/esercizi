package it.esercizio;

public class Utente {
	
	private String nome;
	private String cognome;
	private int eta;
	private String citta;
	private String via;
	private String email;
	
	@Override
	public String toString() {
		return "Utente [nome=" + nome + ", cognome=" + cognome + ", eta=" + eta + ", citta=" + citta + ", via=" + via
				+ ", email=" + email + "]";
	}
	public Utente(String nome, String cognome, int eta, String citta, String via, String email) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
		this.citta = citta;
		this.via = via;
		this.email = email;
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
	public int getEta() {
		return eta;
	}
	public void setEta(int eta) {
		this.eta = eta;
	}
	public String getCitta() {
		return citta;
	}
	public void setCitta(String citta) {
		this.citta = citta;
	}
	public String getVia() {
		return via;
	}
	public void setVia(String via) {
		this.via = via;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
