package unicesumar.livro;

public class CDS extends DVD{
	
	@Override
	public void cadastrar() {
		setCodigo(1);
		setTitulo("THE BEST OF JOU DIVISION");
		setSituacaoItem("L");
		
		System.out.println("DVD CADASTADO:  -COD: "+ getCodigo() + 
				"-T�TULO: " + getTitulo() + "-SITUACAO: "+
				getSituacaoItem());
		
		System.out.println("DVD CADASTRADO UTILIZANDO M�TODO ABSTRADO"
				+ "HERDADO DA CLASSE ABSTRATA ItemAbstrato");
	}
	
	@Override
	public void imprimir() {
		System.out.println("IMPRIMIR LISTA DE DVDS UTILIZANDO M�TODO "
				+ "CONCRETO DA CLASSE DVD.");
	}
	
	public void vender() {
		System.out.println("CD VENDIDO UTILIZANDO M�TODO"
				+ " CONCRETO DA CLASSE CDS");
	}
	
	public static CDS getInstance() {
		return new CDS();
	}

}
