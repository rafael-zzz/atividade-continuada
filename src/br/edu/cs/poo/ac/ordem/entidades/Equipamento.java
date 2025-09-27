package br.edu.cs.poo.ac.ordem.entidades;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Equipamento {
	@Getter @Setter
	private String serial;
	@Getter @Setter
	private String descricao;
	@Getter @Setter
	private boolean ehNovo;
	@Getter @Setter
	private double valorEstimado;
}
