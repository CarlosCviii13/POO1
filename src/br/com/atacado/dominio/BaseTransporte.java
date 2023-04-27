package br.com.atacado.dominio;

import java.time.LocalDate;

public abstract class BaseTransporte {

    protected int codigoTransporte;

    protected String descricao;

    protected LocalDate dataInsert;

    // "get" "set" //
    public int getCodigoTransporte() {
        return codigoTransporte;
    }

    public void setCodigo(int codigoTransporte) {
        this.codigoTransporte = codigoTransporte;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataInsert() {
        return dataInsert;
    }

    public void setDataInsert(LocalDate dataInsert) {
        this.dataInsert = dataInsert;
    }

    // Construtor vazio //
    public BaseTransporte() {
    }

    // Construtor //
    public BaseTransporte(int codigoTransporte, String descricao, LocalDate dataInsert) {
        this.codigoTransporte = codigoTransporte;
        this.descricao = descricao;
        this.dataInsert = dataInsert;
    }

}
