package br.unicesumar.atividade1;

import java.util.Random;

public abstract class Conta {
	

	protected int numero;
	
	protected int agencia;

	protected Cliente cliente;
	
	protected float saldo = 0;
	
	public Conta(int numero, int agencia, Cliente cliente) {
		if(ehMaiorQueZero(numero, agencia) == false) {
			this.numero = new Random().nextInt(1000) + 1;
			this.agencia = new Random().nextInt(1000) + 1;
		}
		else {
			this.numero = numero;
			this.agencia = agencia;
		}

		this.cliente = cliente;

	}
	
	public int getNumero() {
		return numero;
	}
	
	public String getCliente() {
		return "{ Nome: " + cliente.getNome() + ", CPF: " + cliente.getCpf() + " }";
	}

	public void setNumero(int numero) {
		if(ehMaiorQueZero(agencia))
			this.numero = numero;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		if(ehMaiorQueZero(agencia))
			this.agencia = agencia;
	}

	public float getSaldo() {
		return saldo;
	}
	
	private boolean ehMaiorQueZero(int valor) {
		if(valor > 0) {
			return true;
		}	
		else {
			System.out.println("VALOR MENOR QUE ZERO. INFORME VALOR VÁLIDO.");
			return false;
		}
	}
	
	private boolean ehMaiorQueZero(int valor1, int valor2) {
		if(valor1 > 0 && valor2 > 0) {
			return true;
		}	
		else {
			System.out.println("NÚMERO DE CONTAS E AGÊNCIA SERÃO GERADOS DE FORMA ALEATÓRIA.");
			return false;
		}
	}
	
	public abstract void sacar(float valorSaque);
	
	public void depositar(float valorDeposito) {
		if(depositoEhValido(valorDeposito))
			this.saldo += valorDeposito;
	}

	public boolean depositoEhValido(float valorDeposito) {
		if(valorDeposito > 0) {
			return true;
		}
		else {
			System.out.println("DEPÓSITO MENOR OU IGUAL A ZERO. INFORME VALOR VÁLIDO");
			return false;
		}

	}
	
	public boolean saqueEhValido(float saldoAtual, double valorSaque) {
		if(saldoAtual >= valorSaque) {
			return true;
		}
		else {
			System.out.println("VERIFIQUE SEU SALDO.");
			return false;
		}
	}
}
	

