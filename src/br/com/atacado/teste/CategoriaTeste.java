package br.com.atacado.teste;

import java.time.LocalDate;
import java.util.List;

import br.com.atacado.Servico.CategoriaServico;
import br.com.atacado.dominio.Categoria;

public class CategoriaTeste extends BaseTeste<Categoria> {

    public CategoriaTeste() {
        this.servico = new CategoriaServico();
    }

    @Override
    public void Executar() {
        int valorChave = this.TestarCriacao();
        this.TestarAlteracao(valorChave);
        this.TestarExclusao(valorChave);
        this.TestarLeitura(1); // escrever valor da chave //
        this.TestarLeituraVarios();
    }

    @Override
    protected int TestarCriacao() {
        System.out.println("Agora testando criação:");
        Categoria cat = new Categoria(0, "Bandeja", LocalDate.now());
        Categoria novo = this.servico.Criar(cat);
        System.out.println(novo.toString());
        return novo.getCodigo();
    }

    @Override
    protected void TestarLeitura(int chave) {
        System.out.println("Agora testando ler algo específico:");
        Categoria cat = this.servico.Ler(chave);
        System.out.println(cat.toString());
    }

    @Override
    protected void TestarLeituraVarios() {
        System.out.println("Agora testando ler varios:");
        List<Categoria> Lista = this.servico.Ler();
        for (Categoria cat : Lista) {
            System.out.println(cat.toString());
        }
    }

    @Override
    protected void TestarAlteracao(int chave) {
        System.out.println("Agora testando alteração:");
        Categoria antigo = this.servico.Ler(chave);
        antigo.setDescricao("Granadas de mão");
        Categoria alterado = this.servico.Atualizar(antigo);
        System.out.println(alterado.toString());
    }

    @Override
    protected void TestarExclusao(int chave) {
        System.out.println("Agora testando excluindo:");
        Categoria alvo = this.servico.Ler(chave);
        Categoria excluido = this.servico.Deletar(alvo.getCodigo());
        System.out.println(excluido.toString());
    }
}
