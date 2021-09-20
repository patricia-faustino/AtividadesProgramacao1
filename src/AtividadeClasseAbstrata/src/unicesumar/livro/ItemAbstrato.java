package unicesumar.livro;

public abstract class ItemAbstrato {

	private int codigo;
	
	private String titulo;
	
	private String dataEmprestimo;
	
	private String dataDevolucao;
	
	private String situacaoItem;
	
	
	public abstract void cadastrar();
	
	public abstract void emprestar();
	
	public abstract void devolver();
	
	public int getCodigo() {
		return codigo;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getDataEmprestimo() {
		return dataEmprestimo;
	}
	
	public void setDataEmprestimo(String dataEmprestimo) {
		this.dataEmprestimo = dataEmprestimo;
	}
	
	public String getDataDevolucao() {
		return dataDevolucao;
	}
	
	public void setDataDevolucao(String dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}
	
	public String getSituacaoItem() {
		return situacaoItem;
	}
	
	public void setSituacaoItem(String situacaoItem) {
		this.situacaoItem = situacaoItem;
	}

}
