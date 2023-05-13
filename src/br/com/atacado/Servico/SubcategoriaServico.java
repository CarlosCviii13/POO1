package br.com.atacado.Servico;

import java.util.List;

import br.com.atacado.Repositorio.SubcategoriaRepositorio;
import br.com.atacado.dominio.Subcategoria;

public class SubcategoriaServico extends BaseServico<Subcategoria> {

    public SubcategoriaServico() {

        this.repositorio = new SubcategoriaRepositorio();
    }

    @Override
    public Subcategoria Criar(Subcategoria obj) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Criar'");
    }

    @Override
    public Subcategoria Ler(int chave) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Ler'");
    }

    @Override
    public List<Subcategoria> Ler() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Ler'");
    }

    @Override
    public Subcategoria Atualizar(Subcategoria obj) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Atualizar'");
    }

    @Override
    public Subcategoria Deletar(int chave) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Deletar'");
    }

}
