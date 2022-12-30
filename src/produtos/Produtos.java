package produtos;

public class Produtos {

	private String nome;
	private Integer codigo;
	private Integer quantEtoque;
	private Double valorUnitario;
	
	public Produtos(String nome, Integer codigo) {
		super();
		this.nome = nome;
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public Integer getQuantEstoque() {
		return quantEtoque;
	}

	public void setQuantEstoque(Integer estoque) {
		this.quantEtoque = estoque;
	}

	public Double getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(Double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}
}
