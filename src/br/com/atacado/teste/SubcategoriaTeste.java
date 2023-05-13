package br.com.atacado.teste;

import java.time.LocalDate;
import java.util.List;

import br.com.atacado.Servico.SubcategoriaServico;
import br.com.atacado.dominio.Subcategoria;

public class SubcategoriaTeste extends BaseTeste<Subcategoria> {

    public SubcategoriaTeste() {
        this.servico = new SubcategoriaServico();
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
        Subcategoria subc = new Subcategoria(0, 0, "Lac", LocalDate.now());
        Subcategoria novo1 = this.servico.Criar(subc);
        System.out.println(novo1.toString());
        return novo1.getCodigo();
    }

    @Override
    protected void TestarLeitura(int chave) {
        System.out.println("Agora testando ler algo específico:");
        Subcategoria subc = this.servico.Ler(chave);
        System.out.println(subc.toString());
    }

    @Override
    protected void TestarLeituraVarios() {
        System.out.println("Agora testando ler varios:");
        List<Subcategoria> Lista = this.servico.Ler();
        for (Subcategoria subc : Lista) {
            System.out.println(subc.toString());
        }
    }

    @Override
    protected void TestarAlteracao(int chave) {
        System.out.println("Agora testando alteração:");
        Subcategoria antigo = this.servico.Ler(chave);
        antigo.setDescricao("Lac N");
        Subcategoria alterado = this.servico.Atualizar(antigo);
        System.out.println(alterado.toString());
    }

    @Override
    protected void TestarExclusao(int chave) {
        System.out.println("Agora testando excluindo:");
        Subcategoria alvo = this.servico.Ler(chave);
        Subcategoria excluido = this.servico.Deletar(alvo.getCodigo());
        System.out.println(excluido.toString());
    }
}
