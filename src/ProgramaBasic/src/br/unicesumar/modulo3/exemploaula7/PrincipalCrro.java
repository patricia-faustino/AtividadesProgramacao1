package br.unicesumar.modulo3.exemploaula7;

public class PrincipalCrro {

	public static void main(String[] args) {
		Carro carro = new Carro("QWE 1234");
		
		carro.setModelo("BMW X1");
		
		carro.setQuantidadePorta(4);
		
		
		Carro carro2 = new Carro("QWE 4321");
		
		carro2.setModelo("Tiguan");
		
		carro2.setQuantidadePorta(4);
		
		
		System.out.println(carro.getInformacoes());
		System.out.println(carro2.getInformacoes());
	}

}
