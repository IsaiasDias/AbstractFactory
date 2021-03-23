package br.com.uniacademia.fabricaabstrata;

import br.com.uniacademia.fabricaconcreta.FabricaConcreta1;
import br.com.uniacademia.fabricaconcreta.FabricaConcreta2;
import br.com.uniacademia.interfaces.FabricaAbstrata;
import br.com.uniacademia.model.Cliente;

public class FabricaAbstrataEx {

	public static void main(String[] args) {

        FabricaAbstrata fabrica1 = new FabricaConcreta1();
        Cliente cliente1 = new Cliente(fabrica1);
        cliente1.executar();

        FabricaAbstrata fabrica2 = new FabricaConcreta2();
        Cliente cliente2 = new Cliente(fabrica2);
        cliente2.executar();
    }
	
}
