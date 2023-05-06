package br.com.atacado.Repositorio;

import java.util.List;

// "Tudo deve ser publico!" //
// Para repositorio deve ser "abstract" e deve ter <T"Qualquer coisa">
public abstract class BaseRepositorio<TRepositorio> implements IBaseReoisitorio<TRepositorio> {
    // CRUD //
    protected List<TRepositorio> Tabela;

    @Override
    public List<TRepositorio> Read() {
        return this.Tabela;
    }

    @Override
    public TRepositorio Delete(int chave) {
        TRepositorio original = this.Read(chave);
        if (original != null) {
            this.Tabela.remove(original);
        }
        return original;
    }

}
