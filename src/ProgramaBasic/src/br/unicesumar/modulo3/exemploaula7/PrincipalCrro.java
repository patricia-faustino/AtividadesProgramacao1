package br.unicesumar.modulo3.exemploaula7;

public class PrincipalCrro {

	public static void main(String[] args) {
		Carro carro = new Carro();
		
		carro.setModelo("BMW X1");
		carro.setPlaca("QWE 1234");
		carro.setQuantidadePorta(4);
		
		carro.acelerar();
		carro.parar();
	}

}
