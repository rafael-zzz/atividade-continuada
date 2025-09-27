package br.edu.cs.poo.ac.ordem.entidades;

public enum TipoOrdem {
	MANUTENCAO(1, "Manutenção"),
	CONFIGURACAO(2, "Configuração"),
	UPGRADE(3, "Upgrade");
	
	int codigo;
	String nome;
	
	public int getCodigo() {
		return codigo;
	}
	
	public String getNome() {
		return nome;
	}
	
	private TipoOrdem(int codigo, String nome) {
		
	}
	
	
	
	public TipoOrdem getTipoOrdem(int codigo) {
		for(TipoOrdem ordem : TipoOrdem.values()) {
			if(ordem.getCodigo() == codigo) {
				return ordem;
			}
		}
		return null;
	}
}
