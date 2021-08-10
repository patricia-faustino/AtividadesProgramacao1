package br.unicesumar.atividade1;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ContaPoupanca contaPoupanca = new ContaPoupanca(1, 2 , new Cliente("nome", "cpf"));
		
		
		ContaCorrente contaCorrente = new ContaCorrente(3, 4 , new Cliente("nome2", "cpf2"));
		
		System.out.println(contaPoupanca.numero);
		System.out.println(contaPoupanca.saldo);
		System.out.println(contaPoupanca.getCliente());
		
		
		System.out.println(contaCorrente.agencia);
		System.out.println(contaCorrente.numero);
		System.out.println(contaCorrente.saldo);
		System.out.println(contaCorrente.getCliente());
		
		contaPoupanca.depositar(200);
		contaCorrente.depositar(200);
		
		contaPoupanca.sacar(200);
		contaCorrente.sacar(200);
		
		System.out.println(contaPoupanca.saldo);
		System.out.println(contaCorrente.saldo);
	}

}
