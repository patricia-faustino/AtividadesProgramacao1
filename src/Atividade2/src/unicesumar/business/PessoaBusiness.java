package unicesumar.business;

import unicesumar.programacao.Pessoa;

public class PessoaBusiness {
	
	public boolean aprovado;
	
	void aprovarPessoa(Pessoa pessoa) {
		aprovado = pessoa.idade > 18;
	}

}
