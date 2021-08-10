package br.unicesumar.atividade1;

public class ContaCorrente extends Conta {
	
	public ContaCorrente(int numero, int agencia, Cliente cliente) {
		super(numero, agencia, cliente);
	}

	@Override
	public void sacar(float valorSaque) {
		double valorDeSaqueMaisTaxaFixa = valorSaque + 0.10;
		if(saqueEhValido(this.saldo, valorDeSaqueMaisTaxaFixa))
			this.saldo -= valorSaque + 0.10;	
	}
}
