package dataFactory;

import pojo.ComponentePojo;
import pojo.ProdutoPojo;

import java.util.ArrayList;
import java.util.List;

public class ProdutoDataFactory {

    private static List<String> criarCoresBrancoEPreto() {
        List<String> cores = new ArrayList<>();
        cores.add("Branco");
        cores.add("Preto");

        return cores;
    }

    private static List<ComponentePojo> criarComponentesBasicos() {
        ComponentePojo componente = new ComponentePojo();
        componente.setComponenteNome("Controle");
        componente.setComponenteQuantidade(2);

        List<ComponentePojo> componentes = new ArrayList<>();
        componentes.add(componente);

        return componentes;
    }

    public static ProdutoPojo criarProdutoSemCampoProdutoNome() {
        ProdutoPojo produto = new ProdutoPojo();
        produto.setProdutoValor(5000.00);
        produto.setProdutoCores(criarCoresBrancoEPreto());
        produto.setProdutoUrlMock("");
        produto.setComponentes(criarComponentesBasicos());

        return produto;
    }

    public static ProdutoPojo criarProdutoSemCampoProdutoValor() {
        ProdutoPojo produto = new ProdutoPojo();
        produto.setProdutoNome("Playstation 5");
        produto.setProdutoCores(criarCoresBrancoEPreto());
        produto.setProdutoUrlMock("");
        produto.setComponentes(criarComponentesBasicos());

        return produto;
    }

    public static ProdutoPojo criarProdutoSemCampoProdutoCores() {
        ProdutoPojo produto = new ProdutoPojo();
        produto.setProdutoNome("Playstation 5");
        produto.setProdutoValor(5000.00);
        produto.setProdutoUrlMock("");
        produto.setComponentes(criarComponentesBasicos());

        return produto;
    }

    public static ProdutoPojo criarProdutoBasico() {
        ProdutoPojo produto = new ProdutoPojo();
        produto.setProdutoNome("Playstation 5");
        produto.setProdutoValor(4500.00);
        produto.setProdutoCores(criarCoresBrancoEPreto());
        produto.setProdutoUrlMock("");
        produto.setComponentes(criarComponentesBasicos());

        return produto;
    }

    public static ProdutoPojo criarProdutoBasicoComValorIgualA(double valor) {
        ProdutoPojo produto = new ProdutoPojo();
        produto.setProdutoNome("Playstation 5");
        produto.setProdutoValor(valor);
        produto.setProdutoCores(criarCoresBrancoEPreto());
        produto.setProdutoUrlMock("");
        produto.setComponentes(criarComponentesBasicos());

        return produto;
    }
}
