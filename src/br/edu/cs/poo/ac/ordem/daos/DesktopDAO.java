package br.edu.cs.poo.ac.ordem.daos;

import br.edu.cs.poo.ac.ordem.entidades.Desktop;
import java.io.Serializable;

public class DesktopDAO extends DAOGenerico {

    public DesktopDAO() {
        super(Desktop.class);
    }

    private String getIdentificador(Desktop desktop) {
        return desktop.getIdTipo() + desktop.getSerial();
    }

    public Desktop buscar(String serial) {
        String identificador = "DE" + serial;
        return (Desktop) cadastroObjetos.buscar(identificador);
    }

    public boolean incluir(Desktop desktop) {
        String identificador = getIdentificador(desktop);
        if (cadastroObjetos.buscar(identificador) == null) {
            cadastroObjetos.incluir(desktop, identificador);
            return true;
        } else {
            return false;
        }
    }

    public boolean alterar(Desktop desktop) {
        String identificador = getIdentificador(desktop);
        if (cadastroObjetos.buscar(identificador) != null) {
            cadastroObjetos.alterar(desktop, identificador);
            return true;
        } else {
            return false;
        }
    }

    public boolean excluir(String serial) {
        String identificador = "DE" + serial;
        if (cadastroObjetos.buscar(identificador) != null) {
            cadastroObjetos.excluir(identificador);
            return true;
        } else {
            return false;
        }
    }

    public Desktop[] buscarTodos() {
        Serializable[] ret = cadastroObjetos.buscarTodos();
        Desktop[] retorno;
        if (ret != null && ret.length > 0) {
            retorno = new Desktop[ret.length];
            for (int i = 0; i < ret.length; i++) {
                retorno[i] = (Desktop) ret[i];
            }
        } else {
            retorno = new Desktop[0];
        }
        return retorno;
    }
}