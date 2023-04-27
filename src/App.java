import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import br.com.atacado.dominio.*;
import br.com.atacado.fakeDB.*;

// Imprimir class App //
public class App {
        public static void main(String[] args) throws Exception {
                CategoriaFakeDB db = new CategoriaFakeDB();
                for (Categoria c : db.getTabela()) {
                        System.out.println(c.toString());
                }
        }
}

// -----------------------------------------------------------------------------------------------//

/*
 * Categoria c1 = new Categoria(1,
 * "Laticinios",
 * LocalDate.now());
 * 
 * Subcategoria s1 = new Subcategoria(1,
 * 1,
 * "Queijos",
 * LocalDate.now());
 * 
 * Subcategoria s2 = new Subcategoria(2,
 * 1,
 * "Iogurte",
 * LocalDate.now());
 * 
 * Produto p1 = new Produto(1,
 * 1,
 * "Mussarela",
 * 45.5,
 * LocalDate.now());
 * 
 * Produto p2 = new Produto(2,
 * 1,
 * "Provolone",
 * 50.75,
 * LocalDate.now());
 * 
 * Produto p3 = new Produto(3,
 * 2,
 * "Grego",
 * 7.25,
 * LocalDate.now());
 * 
 * Produto p4 = new Produto(4,
 * 2,
 * "Natural",
 * 5.45,
 * LocalDate.now());
 * 
 * List<Produto> prods1 = new ArrayList<>();
 * List<Produto> prods2 = new ArrayList<>();
 * 
 * prods1.add(p1);
 * prods1.add(p2);
 * s1.setProdutos(prods1);
 * 
 * prods2.add(p3);
 * prods2.add(p4);
 * s2.setProdutos(prods2);
 * 
 * List<Subcategoria> subs = new ArrayList<>();
 * subs.add(s1);
 * subs.add(s2);
 * 
 * c1.setSubcategorias(subs);
 * 
 * }
 */

/*
 * // Aqui o que usuário vai ver ou seja, onde sera imprimido as informações. //
 * // Para inserir algume para imprimir -classe Fisica- "PessoaFisica p1 = new
 * PessoaFisica();
 * // Para imprimir no java "System.out.println();" imprimir classe
 * "p1.Imprimir();"
 * // Para mostrar a Sring toda basta usar
 * "ystem.out.println("ex:p1,pj1,p2,pj2".toString());"
 * 
 * public static void main(String[] args) throws Exception {
 * // Titulo do Projeto //
 * System.out.println("\n~~ PROJETO ATACADO JAVA CONSOLE ~~");
 * // Pessoa P1 //
 * System.out.println("\n------------------------------");
 * PessoaFisica p1 = new PessoaFisica(1, "Mateus", "mateus@ceu.com.br",
 * "ceu.com.br", LocalDate.now(), "123", "456", "M", "Parda", "Hebreu",
 * "Jerusalem", "Pai do Mateus", "Mãe do Mateus");
 * p1.Imprimir(); // <-- imprimir classe finha PessoaFisica //
 * System.out.println("\n------------------------------");
 * System.out.println(p1.toString());
 * System.out.println("------------------------------");
 * // Pessoa PJ1 //
 * PessoaJuridica pj1 = new PessoaJuridica(2, "ACME LTDA",
 * "gerente@acme.com.br", "acme.com.br", LocalDate.now(), "123456", "963852741",
 * "741852963", "Pipiu e Frajola Bar e Lanches");
 * pj1.Imprimir(); // <-- imprimir classe finha PessoaJuridica //
 * System.out.println("\n------------------------------");
 * System.out.println(pj1.toString());
 * System.out.println("------------------------------");
 * // FIM //
 * System.out.println("\n~~ ------------------------------------------ ~~");
 * }
 */