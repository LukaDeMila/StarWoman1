
public abstract class Produto {
	
	private String nome;
	private double valorTotal;
	protected int quantidade;
	
	public void aplicaImposto(double imposto) {
		  double impostoCalculado = this.valorTotal * imposto;
		  this.valorTotal = this.valorTotal + impostoCalculado;
		 }

	public Produto(String nome, double valorTotal, int quantidade) {
		super();
		this.nome = nome;
		this.valorTotal = valorTotal;
		this.quantidade = quantidade;
	}

	public abstract double getImposto();
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	
	}

