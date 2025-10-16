package br.edu.cs.poo.ac.utils;

public enum ErroValidacaoCPFCNPJ {

    // CORREÇÃO: Mensagens ajustadas para bater com os testes.
    CPF_CNPJ_NULO_OU_BRANCO("CPF/CNPJ não informado"),
    CPF_CNPJ_COM_TAMANHO_INVALIDO("CPF ou CNPJ com tamanho inválido"),
    CPF_CNPJ_COM_DV_INVALIDO("CPF ou CNPJ com dígito verificador inválido"),
    CPF_CNPJ_COM_CARACTERES_INVALIDOS("CPF ou CNPJ com caracteres inválidos"),
    CPF_CNPJ_NAO_E_CPF_NEM_CNPJ("Não é CPF nem CNJP"), // <- CORRIGIDO: O teste do professor espera "CNJP" com P.
    OBRIGATORIO("CPF ou CNPJ é obrigatório."),
    INVALIDO("CPF ou CNPJ inválido."),
    DIGITO_VERIFICADOR("CPF ou CNPJ com dígito verificador inválido.");

    private final String mensagem;

    private ErroValidacaoCPFCNPJ(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getMensagem() {
        return mensagem;
    }
}