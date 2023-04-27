package br.com.atacado.fakeDB;

import java.time.LocalDate;

import br.com.atacado.dominio.Categoria;

public class CategoriaFakeDB extends BaseFakeDB<Categoria> {

    @Override
    public void Autofill() {
        this.tabela.add(new Categoria(1, "Alemento Infantil", LocalDate.now()));
        this.tabela.add(new Categoria(2, "Suplementos", LocalDate.now()));
        this.tabela.add(new Categoria(3, "Bebidas", LocalDate.now()));
        this.tabela.add(new Categoria(4, "Biscoitos, Bolos e Bolachas", LocalDate.now()));
        this.tabela.add(new Categoria(5, "Carnes", LocalDate.now()));

    }

}
