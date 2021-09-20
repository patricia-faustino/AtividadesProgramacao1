package unicesumar.livro;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DVD extends ItemAbstrato{
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	@Override
	public void cadastrar() {
		setCodigo(1);
		setTitulo("Senhor dos Aneis");
		setSituacaoItem("L");
		
		System.out.println("DVD CADASTADO:  -COD: "+ getCodigo() + 
				"-TÍTULO: " + getTitulo() + "-SITUACAO: "+
				getSituacaoItem());
		
		System.out.println("DVD CADASTRADO UTILIZANDO MÉTODO ABSTRADO"
				+ "HERDADO DA CLASSE ABSTRATA ItemAbstrato");
		
	}

	@Override
	public void emprestar() {
		setSituacaoItem("E");
		setDataEmprestimo(sdf.format(new Date()));
		System.out.println("DVD EMPRESTADO: -SITUAÇÃO: "+
		getSituacaoItem() + "-DATA EMPRESTIMO: "
		+ this.getDataEmprestimo());
		
		System.out.println("DVD EMPRESTADO UTILIZANDO MÉTODO ABSTRADO"
				+ "HERDADO DA CLASSE ABSTRATA ItemAbstrato");
		
	}

	@Override
	public void devolver() {
		setSituacaoItem("E");
		setDataDevolucao(sdf.format(new Date()));
		System.out.println("DVD DEVOLVIDO: -SITUAÇÃO: "+
		getSituacaoItem() + "-DATA DEVOLUÇÃO: "
		+ this.getDataDevolucao());
		
		System.out.println("DVD DEVOLVIDO UTILIZANDO MÉTODO ABSTRADO"
				+ "HERDADO DA CLASSE ABSTRATA ItemAbstrato");
		
		
	}
	
	public void imprimir() {
		System.out.println("IMPRIMIR LISTA DE DVDS UTILIZANDO MÉTODO "
				+ "CONCRETO DA CLASSE DVD.");
	}

	public static DVD getInstance() {
		return new DVD();
	}
}
