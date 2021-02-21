package com.martins.domain.estoque;

import java.util.List;

import com.martins.domain.produto.Produto;

public class Estoque {
	
	private List<Produto> produtos;
	
	public void adicionaProdutos(Produto produto) {
		produtos.add(produto);
	}

}
