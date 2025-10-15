package br.edu.cs.poo.ac.ordem.entidades;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

public class Desktop extends Equipamento implements Serializable{
	@Getter @Setter
	private boolean ehServidor;
	
	public Desktop(String string, String string2, boolean ehServidor, double d, boolean b) {
		this.ehServidor = ehServidor;
	}
	
	public String getIdTipo() {
		return "DE";
	}

	public String getSerial() {
		// TODO Auto-generated method stub
		return null;
	}
}