package com.martins.domain.produto;

import java.math.BigDecimal;

public class Produto {
	
	private String nome;
	private String descricao;
	private Preco preco;
	
	public Produto(String nome, String descricao, Preco preco) {
		if(nome == null || nome.isEmpty()) {
			throw new NomeProdutoNaoPodeSerVazioException("Nome do produto nao pode ser vazio ou nulo");
		}
		this.nome = nome;
		this.descricao = descricao;
		this.preco = preco;
	}
	
	public BigDecimal getPreco() {
		return preco.getValor();
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public String getNome() {
		return nome;
	}
	

}
