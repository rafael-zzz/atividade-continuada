package br.edu.cs.poo.ac.ordem.entidades;

import java.time.LocalDate; 
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import lombok.Getter; 
import lombok.Setter; 
import lombok.AllArgsConstructor; 
@AllArgsConstructor 
public class OrdemServico { 
	@Getter @Setter 
	private Cliente cliente; 
	@Getter @Setter 
	private PrecoBase precoBase; 
	@Getter @Setter 
	private Notebook notebook; 
	@Getter @Setter 
	private Desktop desktop; 
	@Getter @Setter 
	private LocalDateTime dataHoraAbertura; 
	@Getter @Setter private int prazoEmDias; 
	@Getter @Setter private double valor; 
	public LocalDate getDataEstimadaEntrega() { 
		return dataHoraAbertura.plusDays(prazoEmDias).toLocalDate(); 
	} 
	public String getNumero() {
	    String cpfOuCnpj = cliente.getCpfCnpj();

	    DateTimeFormatter formatter;
	    String dataFormatada;

	    if (cpfOuCnpj != null && cpfOuCnpj.length() == 14) {
	        formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmm");
	        dataFormatada = dataHoraAbertura.format(formatter);

	        String tipoEquipamento = "";
	        if (notebook != null) {
	            tipoEquipamento = notebook.getIdTipo();
	        } else if (desktop != null) {
	            tipoEquipamento = desktop.getIdTipo();
	        }

	        return tipoEquipamento + dataFormatada + cpfOuCnpj;
	    }

	    formatter = DateTimeFormatter.ofPattern("MMyyyyddHHmm");
	    dataFormatada = dataHoraAbertura.format(formatter);

	    return dataFormatada + "000" + cpfOuCnpj;
	}
}

