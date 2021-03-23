package br.com.uniacademia.model;

import br.com.uniacademia.interfaces.FabricaAbstrata;
import br.com.uniacademia.interfaces.ProdutoAbstratoA;
import br.com.uniacademia.interfaces.ProdutoAbstratoB;

public class Cliente {

	private ProdutoAbstratoA produtoA;
    private ProdutoAbstratoB produtoB;

    public Cliente(FabricaAbstrata fabrica) {
        produtoA = fabrica.createProdutoA();
        produtoB = fabrica.createProdutoB();
    }

    public void executar() {
        produtoB.interagir(produtoA);
    }
	
}
