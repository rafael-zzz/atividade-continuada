package br.edu.cs.poo.ac.ordem.mediators;

import br.edu.cs.poo.ac.utils.ListaString;

public class ResultadoMediator {
    private boolean validado;
    private boolean operacaoRealizada;
    private ListaString mensagensErro;

    public ResultadoMediator() {
        this.validado = true;
        this.operacaoRealizada = false;
        this.mensagensErro = new ListaString();
    }

    public ResultadoMediator(boolean validado, boolean operacaoRealizada, ListaString mensagensErro) {
        this.validado = validado;
        this.operacaoRealizada = operacaoRealizada;
        this.mensagensErro = mensagensErro;
    }

    public void incluirErro(String chave, String mensagem) {
        this.mensagensErro.adicionar(mensagem);
        this.validado = false; // <-- ESTA É A LINHA DA CORREÇÃO!
    }

    public boolean temErros() {
        return this.mensagensErro.tamanho() > 0;
    }

    public void setOperacaoRealizada(boolean status) {
        this.operacaoRealizada = status;
    }

    public boolean isValidado() {
        return validado;
    }

    public boolean isOperacaoRealizada() {
        return operacaoRealizada;
    }

    public ListaString getMensagensErro() {
        return mensagensErro;
    }
}