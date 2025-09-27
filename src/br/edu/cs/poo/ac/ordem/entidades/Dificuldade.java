package br.edu.cs.poo.ac.ordem.entidades;

public enum Dificuldade {
	NORMAL(1, "Normal"),
	DIFICIL(2, "Difícil");
	
	int codigo;
	String nome;
	
	public int getCodigo() {
		return codigo;
	}
	
	public static Dificuldade getDificuldade(int codigo) {
		for(Dificuldade dificuldade : Dificuldade.values()) {
			if(dificuldade.getCodigo() == codigo) {
				return dificuldade;
			}
		}
		return null;
	}
	
	private Dificuldade(int codigo, String nome) {
		
	}

}
