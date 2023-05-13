package br.com.atacado.Repositorio;

import br.com.atacado.dominio.Produto;
import br.com.atacado.fakeDB.ProdutoFakeDB;

// "Tudo deve ser publico!" //
// Use "implements" + "Interface" dps de Ctrol+Ponto "Criar Modelo"
// "Interface -> extends" //
public class ProdutoRepositorio extends BaseRepositorio<Produto> {

    public ProdutoRepositorio() {
        super();
        this.Tabela = new ProdutoFakeDB().getTabela();
    }

    @Override
    public Produto Create(Produto obj) {
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
    public Produto Read(int chave) {
        Produto res = new Produto();
        for (Produto tupla : this.Tabela) {
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
    public Produto Update(Produto obj) {
        Produto alteracao = this.Read(obj.getCodigo());
        if (alteracao != null) {
            alteracao.setDescricao(obj.getDescricao());
        }
        return alteracao;
    }
}
