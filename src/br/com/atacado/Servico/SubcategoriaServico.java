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
        return this.repositorio.Create(obj);
    }

    @Override
    public Subcategoria Ler(int chave) {
        return this.repositorio.Read(chave);
    }

    @Override
    public List<Subcategoria> Ler() {
        return this.repositorio.Read();
    }

    @Override
    public Subcategoria Atualizar(Subcategoria obj) {
        return this.repositorio.Update(obj);
    }

    @Override
    public Subcategoria Deletar(int chave) {
        return this.repositorio.Delete(chave);
    }

}
