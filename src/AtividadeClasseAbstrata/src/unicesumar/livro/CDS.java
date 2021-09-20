package unicesumar.livro;

public class CDS extends DVD{
	
	@Override
	public void cadastrar() {
		setCodigo(1);
		setTitulo("THE BEST OF JOU DIVISION");
		setSituacaoItem("L");
		
		System.out.println("DVD CADASTADO:  -COD: "+ getCodigo() + 
				"-TÍTULO: " + getTitulo() + "-SITUACAO: "+
				getSituacaoItem());
		
		System.out.println("DVD CADASTRADO UTILIZANDO MÉTODO ABSTRADO"
				+ "HERDADO DA CLASSE ABSTRATA ItemAbstrato");
	}
	
	@Override
	public void imprimir() {
		System.out.println("IMPRIMIR LISTA DE DVDS UTILIZANDO MÉTODO "
				+ "CONCRETO DA CLASSE DVD.");
	}
	
	public void vender() {
		System.out.println("CD VENDIDO UTILIZANDO MÉTODO"
				+ " CONCRETO DA CLASSE CDS");
	}
	
	public static CDS getInstance() {
		return new CDS();
	}

}
