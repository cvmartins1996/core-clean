package com.martins.domain.produto;

public class ValorProdutoNaoPodeSerZeroException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	
	public ValorProdutoNaoPodeSerZeroException(String mensagem){
		super(mensagem);
	}

}
