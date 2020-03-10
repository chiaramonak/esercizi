package it.elis.javaes;

public class Veicolo {
	
	private String nome;
	private String marca;
	private double cilindrata;
	
	

	public Veicolo(String nome, String marca, double cilindrata) {
		this.nome = nome;
		this.marca = marca;
		this.cilindrata = cilindrata;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getCilindrata() {
		return cilindrata;
	}

	public void setCilindrata(double cilindrata) {
		this.cilindrata = cilindrata;
	}
	public String toString() {
		String z="nome: "+getNome()+" marca: "+getMarca()+" cilindrata: "+getCilindrata();
		return z;
	}

}
