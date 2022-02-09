package dataFactory;

import pojo.ComponentePojo;
import pojo.ProdutoPojo;

import java.util.ArrayList;
import java.util.List;

public class ProdutoDataFactory {

    public static ProdutoPojo criarProdutoBasicoComValorIgualA(double valor) {
        List<String> cores = new ArrayList<>();
        cores.add("Branco");
        cores.add("Preto");

        ComponentePojo componente = new ComponentePojo();
        componente.setComponenteNome("Controle");
        componente.setComponenteQuantidade(2);

        List<ComponentePojo> componentes = new ArrayList<>();
        componentes.add(componente);

        ProdutoPojo produto = new ProdutoPojo();
        produto.setProdutoNome("Playstation 5");
        produto.setProdutoValor(0.00);
        produto.setProdutoCores(cores);
        produto.setProdutoUrlMock("");
        produto.setComponentes(componentes);

        return produto;
    }
}
