package br.com.atacado.Repositorio;

import br.com.atacado.dominio.Subcategoria;
import br.com.atacado.fakeDB.SubcategoriaFakeDB;

// "Tudo deve ser publico!" //
// Use "implements" + "Interface" dps de Ctrol+Ponto "Criar Modelo"
// "Interface -> extends" //
public class SubcategoriaRepositorio extends BaseRepositorio<Subcategoria> {

    public SubcategoriaRepositorio() {
        super();
        this.Tabela = new SubcategoriaFakeDB().getTabela();
    }

    @Override
    public Subcategoria Create(Subcategoria obj) {
        int chave = 0;
        if (this.Tabela.size() == 0) {
            chave++;
        } else {
            int tamanho = this.Tabela.size();
            chave = this.Tabela.get(tamanho - 1).getCodigo() + 1;
        }
        obj.setCodigo(chave);
        this.Tabela.add(obj);
        return obj;
    }

    @Override
    public Subcategoria Read(int chave) {
        Subcategoria res = new Subcategoria();
        for (Subcategoria tupla : this.Tabela) {
            if (tupla.getCodigo() == chave) {
                res = tupla;
                break;
            } else {
                res = null;
            }
        }
        return res;
    }

    @Override
    public Subcategoria Update(Subcategoria obj) {
        Subcategoria alteracao = this.Read(obj.getCodigo());
        if (alteracao != null) {
            alteracao.setDescricao(obj.getDescricao());
        }
        return alteracao;
    }
}