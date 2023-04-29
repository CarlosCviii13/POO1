package br.com.atacado.dominio;

import java.time.LocalDate;

// class filha "extends" de "BasePessoa"
public class PessoaJuridica extends BasePessoa {

    private String cnpj;

    private String inscricaoEstadual;

    private String inscricaoMunicipal;

    private String nomeFantasia;

    // Ctrol+Ponto -> "Get e Set" //
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public String getInscricaoMunicipal() {
        return inscricaoMunicipal;
    }

    public void setInscricaoMunicipal(String inscricaoMunicipal) {
        this.inscricaoMunicipal = inscricaoMunicipal;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    // Ctrol+Ponto -> "Construtor" //
    public PessoaJuridica(int codigoPessoa, String nome, String email, String site, LocalDate dataInclusao, String cnpj,
            String inscricaoEstadual, String inscricaoMunicipal, String nomeFantasia) {
        super(codigoPessoa, nome, email, site, dataInclusao);
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
        this.inscricaoMunicipal = inscricaoMunicipal;
        this.nomeFantasia = nomeFantasia;
    }

    @Override
    public void Imprimir() {
        System.out.println("-- Detalhes da Pessoa Jurídica --");
        System.out.println("Código da Pessoa: " + this.codigoPessoa);
        System.out.println("Nome: " + this.nome);
        System.out.println("E-mail: " + this.email);
        System.out.println("Site: " + this.site);
        System.out.println("Data de Inclusão: " + this.dataInclusao);
        System.out.println("CNPJ: " + this.cnpj);
        System.out.println("Inscrição Estadual: " + this.inscricaoEstadual);
        System.out.println("Inscrição Municipal: " + this.inscricaoMunicipal);
        System.out.println("Nome Fantasia: " + this.nomeFantasia);
    }

    // Ctrol+Ponto -> "tostring" //
    @Override
    public String toString() {
        return "Pessoa Juridica-> [" +
                "Codigo Pessoa:" + codigoPessoa +
                ", Nome:" + nome +
                ", Email:" + email +
                ", Site:" + site +
                ", Data Inclusao:" + dataInclusao +
                ", Cnpj:" + cnpj +
                ", Inscricao Estadual:" + inscricaoEstadual +
                ", Inscricao Municipal:" + inscricaoMunicipal +
                ", Nome Fantasia:" + nomeFantasia +
                "]";
    }

}
