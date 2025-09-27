package br.edu.cs.poo.ac.ordem.entidades;

import lombok.Getter;
import lombok.Setter;

public class Notebook extends Equipamento {
	@Getter @Setter
	private boolean carregaDadosSensiveis;
	
	public Notebook(boolean carregaDadosSensiveis) {
		this.carregaDadosSensiveis = carregaDadosSensiveis;
	}

	String getIdTipo() {
		return "NO";
	}
}