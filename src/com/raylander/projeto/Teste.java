package com.raylander.projeto;

import com.raylander.projeto.facade.Facade;

public class Teste {
	public static void main(String[] args) {
		Facade facade = new Facade();
		facade.migrarCliente("Raylander", "29161000");
	}
	
}
