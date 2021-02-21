package com.martins.domain.produto;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;

class PrecoTest {

	@Test
	public void quandoValorPrecoForZeroOuNegativoEntaoLancarExcpetion() {
		assertThrows(ValorProdutoNaoPodeSerZeroException.class, () -> new Preco(new BigDecimal("0")));
		assertThrows(ValorProdutoNaoPodeSerZeroException.class, () -> new Preco(new BigDecimal("-10")));
	}

}
