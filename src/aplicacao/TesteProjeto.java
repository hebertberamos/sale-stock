package aplicacao;

import java.util.Scanner;

import estoque.AddEstoque;
import estoque.Estoque;
import produtos.Produtos;

public class TesteProjeto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Produtos p1 = new Produtos("melancia", 123456);
		p1.setValorUnitario(10.0);
		p1.setQuantEstoque(13);
		
		Estoque e = new Estoque();
		System.out.println("Quantidade em estoque: " + e.quantEstoque(p1));
		System.out.println("Valor total em estoque: " + e.valorTotalEstoque(p1));
		
		AddEstoque ae = new AddEstoque();
		ae.setQuantidadeAdicional(10);
		ae.adicionarEstoque(p1);
		
		System.out.println();
		System.out.println("nova quantidade em estoque: " + e.quantEstoque(p1));
		System.out.println("novo valor total em estoque: " + e.valorTotalEstoque(p1));
		
		System.out.println();
		System.out.println("quantidade de produtos em estoque retirada de dentro da classe Produtos: " + p1.getQuantEstoque());
		
		sc.close();
	}

}
