package br.com.atacado.teste;

import java.time.LocalDate;
import java.util.List;

import br.com.atacado.dominio.Categoria;

public class CategoriaTeste extends BaseTeste<Categoria> {

    public CategoriaTeste() {
    }

    @Override
    public void Executar() {
        int valorChave = this.TestarCriacao();
        this.TestarAlteracao(valorChave);
        this.TestarExclusão(valorChave);
        // this.TestarLeitura();
        // this.TestarLeituraVarios();
    }

    @Override
    protected int TestarCriacao() {
        System.out.println("");
        Categoria cat = new Categoria(0, "Bandeja", LocalDate.now());
        Categoria novo = this.servico.Criar(cat);
        System.out.println(novo.toString());
        return novo.getCodigo();
    }

    @Override
    protected void TestarLeitura(int chave) {
        Categoria cat = this.servico.Ler(chave);
        System.out.println(cat.toString());
    }

    @Override
    protected void TestarLeituraVarios() {
        List<Categoria> Lista = this.servico.Ler();
        for (Categoria cat : Lista) {
            System.out.println(cat.toString());
        }
    }

    @Override
    protected void TestarAlteracao(int chave) {
        Categoria antigo = this.servico.Ler(chave);
        antigo.setDescricao("Granadas de mão");
        Categoria alterado = this.servico.Atualizar(antigo);
        System.out.println(alterado.toString());
    }

    @Override
    protected void TestarExclusão(int chave) {
        Categoria alvo = this.servico.Ler(chave);
        Categoria excluido = this.servico.Deletar(alvo.getCodigo());
        System.out.println(excluido.toString());
    }
}
