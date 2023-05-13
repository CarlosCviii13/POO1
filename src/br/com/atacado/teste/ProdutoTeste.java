package br.com.atacado.teste;

import java.time.LocalDate;
import java.util.List;

import br.com.atacado.Servico.ProdutoServico;
import br.com.atacado.dominio.Produto;

public class ProdutoTeste extends BaseTeste<Produto> {

    public ProdutoTeste() {
        this.servico = new ProdutoServico();
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
        Produto prt = new Produto(0, 0, 0, "Leite", LocalDate.now());
        Produto novo = this.servico.Criar(prt);
        System.out.println(novo.toString());
        return novo.getCodigo();
    }

    @Override
    protected void TestarLeitura(int chave) {
        System.out.println("Agora testando ler algo específico:");
        Produto prt = this.servico.Ler(chave);
        System.out.println(prt.toString());
    }

    @Override
    protected void TestarLeituraVarios() {
        System.out.println("Agora testando ler varios:");
        List<Produto> Lista = this.servico.Ler();
        for (Produto prt : Lista) {
            System.out.println(prt.toString());
        }
    }

    @Override
    protected void TestarAlteracao(int chave) {
        System.out.println("Agora testando alteração:");
        Produto antigo = this.servico.Ler(chave);
        antigo.setDescricao("Leite N");
        Produto alterado = this.servico.Atualizar(antigo);
        System.out.println(alterado.toString());
    }

    @Override
    protected void TestarExclusao(int chave) {
        System.out.println("Agora testando excluindo:");
        Produto alvo = this.servico.Ler(chave);
        Produto excluido = this.servico.Deletar(alvo.getCodigo());
        System.out.println(excluido.toString());
    }

}
