package padroescriacao_exercicio.prototype;

import org.junit.jupiter.api.Test;
import padroescriacao_exercicios.prototype.Produto;
import padroescriacao_exercicios.prototype.Especificacoes;


import static org.junit.jupiter.api.Assertions.assertEquals;

class ProdutoTest {

    @Test
    void testClone() throws CloneNotSupportedException {
        Produto produto = new Produto(123, "Celular", new Especificacoes("Apple", "Prata","IphoneXr",2000));

        Produto produtoClone = produto.clone();
        produtoClone.setCodigo(456);
        produtoClone.getEspecificacoes().setCor("Preto");

        assertEquals("Produto{codigo=123, tipo='Celular', especificacoes='Especificacoes{marca='Apple', cor='Prata', modelo='IphoneXr', valor=2000.0}'}", produto.toString());

        assertEquals("Produto{codigo=456, tipo='Celular', especificacoes='Especificacoes{marca='Apple', cor='Preto', modelo='IphoneXr', valor=2000.0}'}", produtoClone.toString());
    }
}


