package modules.produto;

import dataFactory.ProdutoDataFactory;
import dataFactory.UsuarioDataFactory;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

@DisplayName("Testes de API REST do módulo de Produto")
public class ProdutoTest {

    private String token;

    @BeforeEach
    public void beforeEach() {
        // Configurando os dados da API REST da Lojinha
        baseURI = "http://165.227.93.41";
        basePath = "/lojinha";

        // Obter o token do usuário admin
        this.token = given()
                .contentType(ContentType.JSON)
                .body(UsuarioDataFactory.criarUsuarioAdmin())
            .when()
                .post("/v2/login")
            .then()
                .extract()
                    .path("data.token");
    }

    // TODO: Tentar inserir um produto sem o campo produtoNome
    @Test
    @DisplayName("Validar campos obrigatórios: requisição sem o campo produtoNome")
    public void testValidarCampoObrigatorioProdutoNome() {
        given()
                .contentType(ContentType.JSON)
                .header("token", this.token)
                .body(ProdutoDataFactory.criarProdutoSemCampoProdutoNome())
            .when()
                .post("/v2/produtos")
            .then()
                .assertThat()
                    .body("error", equalTo("produtoNome, produtoValor e produtoCores são campos obrigatórios"))
                    .statusCode(400);
    }

    @Test
    @DisplayName("Validar campos obrigatórios: requisição sem o campo produtoValor")
        public void testValidarCampoObrigatorioProdutoValor() {
        given()
                .contentType(ContentType.JSON)
                .header("token", this.token)
                .body(ProdutoDataFactory.criarProdutoSemCampoProdutoValor())
            .when()
                .post("/v2/produtos")
            .then()
                .assertThat()
                    .body("error", equalTo("produtoNome, produtoValor e produtoCores são campos obrigatórios"))
                    .statusCode(400);
    }

    // TODO: Tentar inserir um produto sem o campo produtoCores

    @Test
    @DisplayName("Validar limite do valor do Produto: valor igual à zero")
    public void testValidarLimiteValorProdutoIgualZero() {
        // Tentar inserir um produto com valor 0.00 e validar que a mensagem de erro foi apresentada
        // e o status code retornado foi 422
        given()
                .contentType(ContentType.JSON)
                .header("token", this.token)
                .body(ProdutoDataFactory.criarProdutoBasicoComValorIgualA(0.00))
            .when()
                .post("/v2/produtos")
            .then()
                .assertThat()
                    .body("error", equalTo("O valor do produto deve estar entre R$ 0,01 e R$ 7.000,00"))
                    .statusCode(422);
    }

    @Test
    @DisplayName("Validar limite do valor do Produto: valor igual à 7001,00")
    public void testValidarLimiteValorProdutoMaiorSeteMil() {
        // Tentar inserir um produto com valor 7001.00 e validar que a mensagem de erro foi apresentada
        // e o status code retornado foi 422
        given()
                .contentType(ContentType.JSON)
                .header("token", this.token)
                .body(ProdutoDataFactory.criarProdutoBasicoComValorIgualA(7001.00))
            .when()
                .post("/v2/produtos")
            .then()
                .assertThat()
                    .body("error", equalTo("O valor do produto deve estar entre R$ 0,01 e R$ 7.000,00"))
                    .statusCode(422);
    }
}
