package br.com.atacado.Repositorio;

import java.util.List;

// Base da "Interface" do codigo, "Tudo deve ser publico!" //
public interface IBaseReoisitorio<TRepositorio> {

    TRepositorio Create(TRepositorio obj); // ASSINATURA DE "CREAT(Criar objt)" // creat

    TRepositorio Read(int chave); // ASSINATURA DE "READ(Ler chave)" //

    List<TRepositorio> Read(); // ASSINATURA DE "READ(Ler toda a lista)" //

    TRepositorio Update(TRepositorio obj); // ASSINATURA DE "UPDATA(Atualizar objt)" //

    TRepositorio Delete(int chave); // ASSINATURA DE "DELETE(Deletar chave)" //
}
