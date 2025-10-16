package br.edu.cs.poo.ac.ordem.mediators;

import br.edu.cs.poo.ac.ordem.entidades.Desktop;
import br.edu.cs.poo.ac.ordem.entidades.Notebook;

public class EquipamentoMediator {
	public ResultadoMediator incluirDesktop(Desktop desk) {}
	public ResultadoMediator alterarDesktop(Desktop desk) {}
	public ResultadoMediator incluirNotebook(Notebook note) {}
	public ResultadoMediator alterarNotebook(Notebook note) {}
	public ResultadoMediator excluirNotebook(String idTipoSerial) {}
	public ResultadoMediator excluirDesktop(String idTipoSerial) {}
	public Notebook buscarNotebook(String idTipoSerial) {}
	public Desktop buscarDesktop(String idTipoSerial) {}
	public ResultadoMediator validarDesktop(Desktop desk) {}
	public ResultadoMediator validarNotebook(Notebook note) {}
	public ResultadoMediator validar(DadosEquipamento equip) {}
	public static EquipamentoMediator getInstancia() {
		return null;
	}
}