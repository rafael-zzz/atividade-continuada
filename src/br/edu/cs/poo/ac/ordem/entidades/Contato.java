package br.edu.cs.poo.ac.ordem.entidades;

public class Contato {
	private String email;
	private String celular;
	private boolean ehzap;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public boolean isEhzap() {
		return ehzap;
	}
	public void setEhzap(boolean ehzap) {
		this.ehzap = ehzap;
	}
	
	public Contato(String email, String celular, boolean ehzap) {
		this.email = email;
		this.celular = celular;
		this.ehzap = ehzap;
	}
}
