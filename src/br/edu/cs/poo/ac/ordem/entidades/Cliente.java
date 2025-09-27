package br.edu.cs.poo.ac.ordem.entidades;

import java.time.LocalDate;

public class Cliente {
	private String cpfCnpj;
	private String nome;
	private Contato contato;
	private LocalDate dataCadastro;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Contato getContato() {
		return contato;
	}
	public void setContato(Contato contato) {
		this.contato = contato;
	}
	
	public String getCpfCnpj() {
		return cpfCnpj;
	}
	public LocalDate getDataCadastro() {
		return dataCadastro;
	}
	
	public Cliente(String cpfCnpj, String nome, Contato contato, LocalDate dataCadastro) {
		this.cpfCnpj = cpfCnpj;
		this.nome = nome;
		this.contato = contato;
		this.dataCadastro = dataCadastro;
	}
	
	public int getIdadeCadastro() {
		LocalDate today = LocalDate.now();
        int age = today.getYear() - dataCadastro.getYear();

        if (today.getMonthValue() < dataCadastro.getMonthValue() || 
            (today.getMonthValue() == dataCadastro.getMonthValue() && today.getDayOfMonth() < dataCadastro.getDayOfMonth())) {
            age--;
        }
        return age;
    }
}
