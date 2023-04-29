package br.com.atacado.dominio;

import java.time.LocalDate;

// Class isolada sendo "privada" //
public class Produto {

    private int codigo;

    private int codigoSubcategoria;

    private String descricao;

    private double valor;

    private LocalDate dataDeInclusao;

    // Ctrol+Ponto -> "get e set" //
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigoSubcategoria() {
        return codigoSubcategoria;
    }

    public void setCodigoSubcategoria(int codigoSubcategoria) {
        this.codigoSubcategoria = codigoSubcategoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public LocalDate getDataDeInclusao() {
        return dataDeInclusao;
    }

    public void setDataDeInclusao(LocalDate dataDeInclusao) {
        this.dataDeInclusao = dataDeInclusao;
    }

    // Ctrol+Ponto -> "Construtor Vazio" //
    public Produto() {
    }

    // Ctrol+Ponto -> "Construtor" //
    public Produto(int codigo, int codigoSubcategoria, String descricao, double valor, LocalDate dataDeInclusao) {
        this.codigo = codigo;
        this.codigoSubcategoria = codigoSubcategoria;
        this.descricao = descricao;
        this.valor = valor;
        this.dataDeInclusao = dataDeInclusao;
    }

    // Ctrol+Ponto -> tostring //
    @Override
    public String toString() {
        return "Produto-> [Codigo:" + codigo + ", Codigo Subcategoria:" + codigoSubcategoria + ", Descricao:"
                + descricao + ", Valor:" + valor + "\nData De Inclusao:" + dataDeInclusao + "]";
    }

}
