package br.com.uniacademia.model;

import br.com.uniacademia.interfaces.ProdutoAbstratoA;
import br.com.uniacademia.interfaces.ProdutoAbstratoB;

public class ProdutoB1 implements ProdutoAbstratoB {

	@Override
    public void interagir(ProdutoAbstratoA a) {
        System.out.println(this.getClass().getName() + " interage com " + a.getClass().getName());
    }

	
}
