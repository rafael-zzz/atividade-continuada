package br.edu.cs.poo.ac.utils;

import java.util.regex.Pattern;

public class StringUtils {

    public static boolean estaVazia(String str) {
        return str == null || str.trim().isEmpty();
    }

    public static boolean tamanhoExcedido(String str, int tamanho) {
        // CORREÇÃO APLICADA AQUI:
        // Primeiro, trata o caso de tamanho negativo, que nunca pode ser excedido.
        if (tamanho < 0) {
            return false;
        }
        // O teste também tem uma regra específica para string nula.
        if (str == null) {
            return tamanho > 0;
        }
        // Lógica original para os outros casos.
        return str.length() > tamanho;
    }

    public static boolean emailValido(String email) {
        if (estaVazia(email)) {
            return false;
        }
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pat = Pattern.compile(emailRegex);
        return pat.matcher(email).matches();
    }

    public static boolean telefoneValido(String tel) {
        if (estaVazia(tel)) {
            return false;
        }
        String telRegex = "^\\(\\d{2}\\)\\d{8,9}$";
        Pattern pat = Pattern.compile(telRegex);
        return pat.matcher(tel).matches();
    }

    public static boolean tamanhoMenor(String str, int tamanho) {
        if (tamanho < 0) {
            return false;
        }
        if (str == null) {
            return true;
        }
        return str.length() < tamanho;
    }
}