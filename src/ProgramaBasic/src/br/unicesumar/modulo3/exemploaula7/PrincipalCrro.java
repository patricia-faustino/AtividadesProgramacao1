package br.unicesumar.modulo3.exemploaula7;

public class PrincipalCrro {

	public static void main(String[] args) {
		Carro carro = new Carro("QWE 1234");
		
		carro.setModelo("BMW X1");
		
		carro.setQuantidadePorta(4);
		
		carro.acelerar();
		carro.parar();
	}

}
