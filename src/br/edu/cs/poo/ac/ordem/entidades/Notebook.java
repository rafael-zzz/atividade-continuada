package br.edu.cs.poo.ac.ordem.entidades;

import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

public class Notebook extends Equipamento implements Serializable {
	@Getter @Setter
	private boolean carregaDadosSensiveis;
	
	public Notebook(String serial, String descricao, boolean ehNovo, double valorEstimado, boolean carregaDadosSensiveis) {
		super();
		this.carregaDadosSensiveis = carregaDadosSensiveis;
	}

	public String getIdTipo() {
		return "NO";
	}

	public String getSerial() {
		// TODO Auto-generated method stub
		return null;
	}
}