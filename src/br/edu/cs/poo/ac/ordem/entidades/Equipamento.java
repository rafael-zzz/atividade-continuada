package br.edu.cs.poo.ac.ordem.entidades;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;

import java.io.Serializable;

public class Equipamento implements Serializable {
    public Equipamento(String serial, String descricao, boolean ehNovo, double valorEstimado) {
        this.serial = serial;
        this.descricao = descricao;
        this.ehNovo = ehNovo;
        this.valorEstimado = valorEstimado;
    }

    private String serial;
	private String descricao;
	private boolean ehNovo;
	private double valorEstimado;

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isEhNovo() {
        return ehNovo;
    }

    public void setEhNovo(boolean ehNovo) {
        this.ehNovo = ehNovo;
    }

    public double getValorEstimado() {
        return valorEstimado;
    }

    public void setValorEstimado(double valorEstimado) {
        this.valorEstimado = valorEstimado;
    }
}
