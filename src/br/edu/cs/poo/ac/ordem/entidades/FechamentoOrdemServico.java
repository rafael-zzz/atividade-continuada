package br.edu.cs.poo.ac.ordem.entidades;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;



public class FechamentoOrdemServico implements Serializable {

    public FechamentoOrdemServico(String numeroOrdemServico, LocalDate dataFechamento, boolean pago, String relatorioFinal) {
        this.numeroOrdemServico = numeroOrdemServico;
        this.dataFechamento = dataFechamento;
        this.pago = pago;
        this.relatorioFinal = relatorioFinal;
    }

    public String getNumeroOrdemServico() {
        return numeroOrdemServico;
    }

    public void setNumeroOrdemServico(String numeroOrdemServico) {
        this.numeroOrdemServico = numeroOrdemServico;
    }

    public LocalDate getDataFechamento() {
        return dataFechamento;
    }

    public void setDataFechamento(LocalDate dataFechamento) {
        this.dataFechamento = dataFechamento;
    }

    public boolean isPago() {
        return pago;
    }

    public void setPago(boolean pago) {
        this.pago = pago;
    }

    public String getRelatorioFinal() {
        return relatorioFinal;
    }

    public void setRelatorioFinal(String relatorioFinal) {
        this.relatorioFinal = relatorioFinal;
    }

    private String numeroOrdemServico;
    private LocalDate dataFechamento;
    private boolean pago;
    private String relatorioFinal;
}