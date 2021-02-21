package com.martins.domain.produto;

import java.math.BigDecimal;

public class Preco {
	
	private BigDecimal valor;
	
	public Preco(BigDecimal valor) {
		if(BigDecimal.ZERO.equals(valor) || valor.signum() == -1) {
			throw new ValorProdutoNaoPodeSerZeroException("Valor do produto não pode ser zero ou negativo");
		}
		
		this.valor = valor;
	}
	
	public BigDecimal getValor() {
		return valor;
	}

}
