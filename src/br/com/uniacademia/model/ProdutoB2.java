package br.com.uniacademia.model;

import br.com.uniacademia.interfaces.ProdutoAbstratoA;
import br.com.uniacademia.interfaces.ProdutoAbstratoB;

public class ProdutoB2 implements ProdutoAbstratoB{

	 @Override
	    public void interagir(ProdutoAbstratoA a) {
	        System.out.println(this.toString() + " interage com " + a.toString());
	    }
	 
		@Override
		public String toString() {
			return "Produto B2";
		}
}
