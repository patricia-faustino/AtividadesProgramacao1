package unicesumar.atividade1;


public class ResolvendoBhaskara {



	private int a ;
	
	private int b;
	
	private int c;
	
	public ResolvendoBhaskara(int a, int b, int c) {
		setA(a);
		setB(b);
		setC(c);
	}
	
	public int getA() {
		return a;
	}
	
	public void setA(int a) {
		this.a = a;
	}
	
	public int getB() {
		return b;
	}
	
	public void setB(int b) {
		this.b = b;
	}
	
	public int getC() {
		return c;
	}
	
	public void setC(int c) {
		this.c = c;
	}
	
	public int delta() {

		return 	(b * b) - (4 * a * c);
	}
	
	public void resultado() throws DeltaException {
		int resultado = delta();
		
		if(resultado ==  0)
			System.out.println("Raízes iguais.");
		
		else if(resultado > 0)
			System.out.println("Raízes diferentes.");
		
		else if(resultado < 0)
			throw new DeltaException();
	}
	
}
