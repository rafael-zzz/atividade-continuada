package br.edu.cs.poo.ac.ordem.entidades;

import lombok.Getter;
import lombok.Setter;

public class Desktop extends Equipamento{
	@Getter @Setter
	private boolean ehServidor;
	
	public Desktop(boolean ehServidor) {
		this.ehServidor = ehServidor;
	}
	
	public String getIdTipo() {
		return "DE";
	}
}