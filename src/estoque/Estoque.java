package estoque;

import produtos.Produtos;

public class Estoque {

	private Integer quantidadeEstoque;
	private Double valorEstoque;
	private Integer valorAdicional;
	
	private Produtos produtos;

	public Estoque() {
	}

	public Estoque(Integer quantidadeEstoque, Double valorEstoque, Integer valorAdicional, Produtos produtos) {
		super();
		this.quantidadeEstoque = quantidadeEstoque;
		this.valorEstoque = valorEstoque;
		this.valorAdicional = valorAdicional;
		this.produtos = produtos;
	}

	public Integer getQuantidadeEstoque() {
		return quantidadeEstoque;
	}

	public void setQuantidadeEstoque(Integer quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}

	public Double getValorEstoque() {
		return valorEstoque;
	}

	public void setValorEstoque(Double valorEstoque) {
		this.valorEstoque = valorEstoque;
	}

	public Produtos getProdutos() {
		return produtos;
	}

	public void setProdutos(Produtos produtos) {
		this.produtos = produtos;
	}
	
	public Integer getValorAdicional() {
		return valorAdicional;
	}
	
	public void setValorAdicional(Integer valorAdicional) {
		this.valorAdicional = valorAdicional;
	}
	
	public Integer quantEstoque(Produtos produtos) {
		quantidadeEstoque = produtos.getQuantEstoque();
		return quantidadeEstoque;
	}
	
	public Double valorTotalEstoque(Produtos produtos) {
		valorEstoque = produtos.getQuantEstoque() * produtos.getValorUnitario();
		return valorEstoque;
	}

}
