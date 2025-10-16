package br.edu.cs.poo.ac.ordem.daos;

import br.edu.cs.poo.ac.ordem.entidades.Notebook;
import java.io.Serializable;

public class NotebookDAO extends DAOGenerico {

    public NotebookDAO() {
        super(Notebook.class);
    }

    private String getIdentificador(Notebook notebook) {
        return notebook.getIdTipo() + notebook.getSerial();
    }

    public Notebook buscar(String serial) {
        String identificador = "NO" + serial;
        return (Notebook) cadastroObjetos.buscar(identificador);
    }

    public boolean incluir(Notebook notebook) {
        String identificador = getIdentificador(notebook);
        if (cadastroObjetos.buscar(identificador) == null) {
            cadastroObjetos.incluir(notebook, identificador);
            return true;
        } else {
            return false;
        }
    }

    public boolean alterar(Notebook notebook) {
        String identificador = getIdentificador(notebook);
        if (cadastroObjetos.buscar(identificador) != null) {
            cadastroObjetos.alterar(notebook, identificador);
            return true;
        } else {
            return false;
        }
    }

    public boolean excluir(String serial) {
        String identificador = "NO" + serial;
        if (cadastroObjetos.buscar(identificador) != null) {
            cadastroObjetos.excluir(identificador);
            return true;
        } else {
            return false;
        }
    }

    public Notebook[] buscarTodos() {
        Serializable[] ret = cadastroObjetos.buscarTodos();
        Notebook[] retorno;
        if (ret != null && ret.length > 0) {
            retorno = new Notebook[ret.length];
            for (int i = 0; i < ret.length; i++) {
                retorno[i] = (Notebook) ret[i];
            }
        } else {
            retorno = new Notebook[0];
        }
        return retorno;
    }
}