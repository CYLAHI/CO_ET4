package com.polytech.et4;

public class OrigineJonctionException extends Exception {
	
	public OrigineJonctionException(){
		super("L'origine ne correspond � aucune route de la jonction");
	}

}
