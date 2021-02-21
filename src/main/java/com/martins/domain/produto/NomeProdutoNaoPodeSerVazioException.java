package com.martins.domain.produto;

public class NomeProdutoNaoPodeSerVazioException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public NomeProdutoNaoPodeSerVazioException(String string) {
		super(string);
	}

}
