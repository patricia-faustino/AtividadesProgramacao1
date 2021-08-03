package br.unicesumar.modulo3.exemploaula7;

public class Carro {
	private String modelo;
	
	private int quantidadePorta;
	
	private String placa;
	
	private String motor;
	
	private boolean estaAcelerando = false;
	
	public String getmodelo() {
		return modelo;
	}
	
	public  void setModelo(String modelo) {
		this.modelo = modelo;
	}
	 
	public int getQntPorta() {
		return quantidadePorta;
	}
	
	public void setQuantidadePorta(int quantidadePorta) {
		this.quantidadePorta = quantidadePorta;
	}
	
	public String getPlaca() {
		return placa;
	}
	
	public  void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getMotor() {
		return motor;
	}
	
	public void setMotor(String motor) {
		this.motor = motor;
	}

	public void acelerar() {
		estaAcelerando = true;
		if(motor == null)
			this.setMotor("1.0");
		System.out.println("Acelarando o carro com motor " + this.motor);
	}
	
	public void parar() {
		this.ligarLuzDeFreio();
		this.desacelerar();
		System.out.println("Carro parado");
		
	}

	private void ligarLuzDeFreio() {
		System.out.println("Ligando luz de freio");
		
	}

	private void desacelerar() {
		if(estaAcelerando == true)
			System.out.println("Desacelerando....");
		estaAcelerando = false;
	}
	
	
}