package estoque;

import produtos.Produtos;

public class AddEstoque {

	private Integer quantidadeAdicional;
	
	private Estoque estoque;
	
	public AddEstoque() {
	}

	public AddEstoque(Estoque estoque, Integer quantidadeAdicional) {
		super();
		this.estoque = estoque;
		this.quantidadeAdicional = quantidadeAdicional;
	}

	public Estoque getEstoque() {
		return estoque;
	}

	public void setEstoque(Estoque estoque) {
		this.estoque = estoque;
	}
	
	public Integer getQuantidadeAdicional() {
		return quantidadeAdicional;
	}
	
	public void setQuantidadeAdicional(Integer quantidadeAdicional) {
		this.quantidadeAdicional = quantidadeAdicional;
	}
	
	
	public void adicionarEstoque(Produtos produtos) {
		int quantidadeFinal = quantidadeAdicional + produtos.getQuantEstoque();
		
		produtos.setQuantEstoque(quantidadeFinal);
	}
}
