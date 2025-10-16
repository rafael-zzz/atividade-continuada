package br.edu.cs.poo.ac.ordem.mediators;

import br.edu.cs.poo.ac.ordem.entidades.Cliente;

public class ClienteMediator {
	public ResultadoMediator incluir(Cliente cliente) {}
	public ResultadoMediator alterar(Cliente cliente) {}
	public ResultadoMediator excluir(String cpfCnpj) {}
	public Cliente buscar(String cpfCnpj) {}
	public ResultadoMediator validar(Cliente cliente) {}
}
