package br.com.uniacademia.fabricaconcreta;

import br.com.uniacademia.interfaces.FabricaAbstrata;
import br.com.uniacademia.interfaces.ProdutoAbstratoA;
import br.com.uniacademia.interfaces.ProdutoAbstratoB;
import br.com.uniacademia.model.ProdutoA2;
import br.com.uniacademia.model.ProdutoB2;

public class FabricaConcreta2 implements FabricaAbstrata{

	@Override
    public ProdutoAbstratoA createProdutoA() {
        return new ProdutoA2();
    }
    @Override
    public ProdutoAbstratoB createProdutoB() {
        return new ProdutoB2();
    }
}
