package sistemaRestaurante;

public abstract class Pratos {

	private String codigo;
	private String nome;
	private double valor;
	
	public Pratos(String codigo, String nome, double valor) {
		this.codigo = codigo;
		this.nome = nome;
		this.valor = valor;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public abstract void composicaoPrato();
	
	public abstract void Preparar();
	
	
	
}
