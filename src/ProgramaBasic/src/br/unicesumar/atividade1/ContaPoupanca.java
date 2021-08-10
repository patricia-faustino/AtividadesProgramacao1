package br.unicesumar.atividade1;

public class ContaPoupanca  extends Conta{

	public ContaPoupanca(int numero, int agencia, Cliente cliente) {
		super(numero, agencia, cliente);
	}

	@Override
	public void sacar(float valorSaque) {
		if(saqueEhValido(this.saldo, valorSaque))
			this.saldo -= valorSaque;	
	}
}
