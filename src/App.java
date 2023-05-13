
// import br.com.atacado.dominio.*; // Parte Comentada "Maneira Antiga"//
// import br.com.atacado.fakeDB.*; // Parte Comentada "Maneira Antiga"//
import br.com.atacado.teste.CategoriaTeste;
import br.com.atacado.teste.ProdutoTeste;
import br.com.atacado.teste.SubcategoriaTeste;

public class App {
    // Para Inprimir use "public static void main(String[] args) throws Exception{"
    // Uma maneira de espaçar "System.out.println(...);"
    public static void main(String[] args) throws Exception {

        System.out.println("----------TESTE 01-------------");
        CategoriaTeste teste1 = new CategoriaTeste();
        teste1.Executar();
        System.out.println("----------TESTE 02-------------");
        SubcategoriaTeste teste2 = new SubcategoriaTeste();
        teste2.Executar();
        System.out.println("----------TESTE 03-------------");
        ProdutoTeste teste3 = new ProdutoTeste();
        teste3.Executar();
        System.out.println("--------------FIM----------------");

        // ----------------------------------------------------------------------------------------//
        // Maneira Antiga //
        // System.out.println("------------------------------");
        // CategoriaFakeDB db1 = new CategoriaFakeDB();
        // for (Categoria c : db1.getTabela()) {
        // System.out.println(c.toString());
        // }
        // System.out.println("------------------------------");
        // SubcategoriaFakeDB db2 = new SubcategoriaFakeDB();
        // for (Subcategoria c : db2.getTabela()) {
        // System.out.println(c.toString());
        // }
        // System.out.println("------------------------------");
        // ProdutoFakeDB db3 = new ProdutoFakeDB();
        // for (Produto c : db3.getTabela()) {
        // System.out.println(c.toString());
        // }
        // System.out.println("------------------------------");
        // }
    }
}
