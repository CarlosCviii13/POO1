package br.com.atacado.Servico;

import java.util.List;

import br.com.atacado.Repositorio.ProdutoRepositorio;
import br.com.atacado.dominio.Produto;

public class ProdutoServico extends BaseServico<Produto> {

    public ProdutoServico() {

        this.repositorio = new ProdutoRepositorio();
    }

    @Override
    public Produto Criar(Produto obj) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Criar'");
    }

    @Override
    public Produto Ler(int chave) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Ler'");
    }

    @Override
    public List<Produto> Ler() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Ler'");
    }

    @Override
    public Produto Atualizar(Produto obj) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Atualizar'");
    }

    @Override
    public Produto Deletar(int chave) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Deletar'");
    }

}
