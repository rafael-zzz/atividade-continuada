package br.edu.cs.poo.ac.utils;

public class ValidadorCPFCNPJ {

    public static ResultadoValidacaoCPFCNPJ validarCPFCNPJ(String cpfCnpj) {
        if (StringUtils.estaVazia(cpfCnpj)) {
            // CORREÇÃO: O teste espera este erro específico para entradas nulas/vazias.
            return new ResultadoValidacaoCPFCNPJ(false, false, ErroValidacaoCPFCNPJ.CPF_CNPJ_NAO_E_CPF_NEM_CNPJ);
        }

        String apenasDigitos = cpfCnpj.replaceAll("[^0-9]", "");

        if (isCPF(apenasDigitos)) {
            ErroValidacaoCPFCNPJ erro = validarCPF(apenasDigitos);
            return new ResultadoValidacaoCPFCNPJ(true, false, erro);
        } else if (isCNPJ(apenasDigitos)) {
            ErroValidacaoCPFCNPJ erro = validarCNPJ(apenasDigitos);
            return new ResultadoValidacaoCPFCNPJ(false, true, erro);
        } else {
            return new ResultadoValidacaoCPFCNPJ(false, false, ErroValidacaoCPFCNPJ.CPF_CNPJ_NAO_E_CPF_NEM_CNPJ);
        }
    }

    public static boolean isCPF(String valor) {
        return valor != null && valor.length() == 11;
    }

    public static boolean isCNPJ(String valor) {
        return valor != null && valor.length() == 14;
    }

    public static ErroValidacaoCPFCNPJ validarCPF(String cpf) {
        if (!isCPF(cpf) || cpf.matches("(\\d)\\1{10}")) {
            return ErroValidacaoCPFCNPJ.INVALIDO;
        }
        if (!isDigitoVerificadorValidoCPF(cpf)) {
            return ErroValidacaoCPFCNPJ.CPF_CNPJ_COM_DV_INVALIDO;
        }
        return null;
    }

    public static ErroValidacaoCPFCNPJ validarCNPJ(String cnpj) {
        if (!isCNPJ(cnpj) || cnpj.matches("(\\d)\\1{13}")) {
            return ErroValidacaoCPFCNPJ.INVALIDO;
        }
        if (!isDigitoVerificadorValidoCNPJ(cnpj)) {
            return ErroValidacaoCPFCNPJ.CPF_CNPJ_COM_DV_INVALIDO;
        }
        return null;
    }

    private static boolean isDigitoVerificadorValidoCPF(String cpf) {
        try {
            int d1 = 0, d2 = 0;
            int digito1, digito2, resto;
            int digitoCPF;
            String nDigResult;

            for (int i = 1; i < cpf.length() - 1; i++) {
                digitoCPF = Integer.parseInt(cpf.substring(i - 1, i));
                d1 = d1 + (11 - i) * digitoCPF;
                d2 = d2 + (12 - i) * digitoCPF;
            }

            resto = (d1 % 11);
            digito1 = (resto < 2) ? 0 : 11 - resto;
            d2 += 2 * digito1;
            resto = (d2 % 11);
            digito2 = (resto < 2) ? 0 : 11 - resto;

            String digitoVerificador = cpf.substring(cpf.length() - 2);
            nDigResult = String.valueOf(digito1) + String.valueOf(digito2);
            return digitoVerificador.equals(nDigResult);
        } catch (Exception e) {
            return false;
        }
    }

    private static boolean isDigitoVerificadorValidoCNPJ(String cnpj) {
        try {
            int soma = 0, dig;
            String cnpj_calc = cnpj.substring(0, 12);
            char[] chr_cnpj = cnpj.toCharArray();

            for (int i = 0; i < 4; i++)
                if (chr_cnpj[i] - 48 >= 0 && chr_cnpj[i] - 48 <= 9)
                    soma += (chr_cnpj[i] - 48) * (6 - (i + 1));
            for (int i = 0; i < 8; i++)
                if (chr_cnpj[i + 4] - 48 >= 0 && chr_cnpj[i + 4] - 48 <= 9)
                    soma += (chr_cnpj[i + 4] - 48) * (10 - (i + 1));
            dig = 11 - (soma % 11);
            cnpj_calc += (dig == 10 || dig == 11) ? "0" : Integer.toString(dig);

            soma = 0;
            for (int i = 0; i < 5; i++)
                if (chr_cnpj[i] - 48 >= 0 && chr_cnpj[i] - 48 <= 9)
                    soma += (chr_cnpj[i] - 48) * (7 - (i + 1));
            for (int i = 0; i < 8; i++)
                if (chr_cnpj[i + 5] - 48 >= 0 && chr_cnpj[i + 5] - 48 <= 9)
                    soma += (chr_cnpj[i + 5] - 48) * (10 - (i + 1));
            dig = 11 - (soma % 11);
            cnpj_calc += (dig == 10 || dig == 11) ? "0" : Integer.toString(dig);

            return cnpj.equals(cnpj_calc);
        } catch (Exception e) {
            return false;
        }
    }
}