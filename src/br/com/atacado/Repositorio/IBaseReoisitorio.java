package br.com.atacado.Repositorio;

import java.util.List;

// Base da "Interface" do codigo, "Tudo deve ser publico!" //
public interface IBaseReoisitorio<TRepositorio> {

    TRepositorio Create(TRepositorio obj);

    TRepositorio Read(int chave);

    List<TRepositorio> Read();

    TRepositorio Update(TRepositorio obj);

    TRepositorio Delete(int chave);
}
