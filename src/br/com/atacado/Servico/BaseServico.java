package br.com.atacado.Servico;

import br.com.atacado.Repositorio.BaseRepositorio;

public abstract class BaseServico<TServico> implements IBaseServico<TServico> {

    protected BaseRepositorio<TServico> repositorio;

    public BaseServico() {

    }
}
