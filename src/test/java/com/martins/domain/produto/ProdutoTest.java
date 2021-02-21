package com.martins.domain.produto;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;

class ProdutoTest {

	@Test
	public void quandoNomeProdutoForVazioEntaoLancarExcpetion() {
		String nome = null;
		String descricao = "";
		Preco preco =  new Preco(new BigDecimal("10"));
		assertThrows(NomeProdutoNaoPodeSerVazioException.class, () -> new Produto(nome, descricao, preco));
	}
	
	@Test
	public void quandoProdutoForInicializadoComTodasPropriedadesEntaoRetornaUmObjetoProduto() {
		String nome = "Produto XPTO";
		String descricao = "";
		Preco preco =  new Preco(new BigDecimal("10"));
		Produto produto = new Produto(nome, descricao, preco);
		
		assertEquals(nome, produto.getNome());
		assertEquals(descricao, produto.getDescricao());
		assertEquals(new BigDecimal("10"), produto.getPreco());
		
	}

}
