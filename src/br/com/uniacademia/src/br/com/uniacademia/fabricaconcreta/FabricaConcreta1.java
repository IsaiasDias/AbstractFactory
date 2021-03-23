package br.com.uniacademia.fabricaconcreta;

import br.com.uniacademia.interfaces.FabricaAbstrata;
import br.com.uniacademia.interfaces.ProdutoAbstratoA;
import br.com.uniacademia.interfaces.ProdutoAbstratoB;
import br.com.uniacademia.model.ProdutoA1;
import br.com.uniacademia.model.ProdutoB1;

public class FabricaConcreta1 implements FabricaAbstrata {

	@Override
    public ProdutoAbstratoA createProdutoA() {
        return new ProdutoA1();
    }
    @Override
    public ProdutoAbstratoB createProdutoB() {
        return new ProdutoB1();
    }
}
