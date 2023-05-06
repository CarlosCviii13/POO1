package br.com.atacado.Repositorio;

import br.com.atacado.dominio.Categoria;
import br.com.atacado.fakeDB.CategoriaFakeDB;

// "Tudo deve ser publico!" //
// Use "implements" + "Interface" dps de Ctrol+Ponto "Criar Modelo"
// "Interface -> extends" //
public class CategoriaRepositorio extends BaseRepositorio<Categoria> {

    public CategoriaRepositorio() {
        this.Tabela = new CategoriaFakeDB().getTabela();
    }

    @Override
    public Categoria Create(Categoria obj) {
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
    public Categoria Read(int chave) { // "Metodo não ideal" //
        Categoria res = new Categoria();
        for (Categoria tupla : this.Tabela) {
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
    public Categoria Update(Categoria obj) {
        Categoria alteracao = this.Read(obj.getCodigo());
        if (alteracao != null) {
            alteracao.setDescricao(obj.getDescricao());
        }
        return alteracao;
    }

}
