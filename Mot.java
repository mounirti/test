package com.transformation;

import java.util.Arrays;
import java.util.List;

public interface  Mot {
	public final List<Character> lettresConsonne = Arrays.asList(new Character[] { 'Z', 'R', 'T', 'P', 'Q', 'S', 'D','F', 'G', 'H', 'J', 'K', 'L', 'M', 'W', 'X', 'C', 'V', 'B', 'N' });
	public final List<Character> lettresVoyelle = Arrays.asList(new Character[] { 'A', 'E', 'U', 'I', 'O', 'Y' });
	public final String CODE_TRANS = "av";

	public static boolean isConsonne(char lettre) {
		return lettresConsonne.contains(Character.toUpperCase(lettre));
	}

	public static boolean isVoyelle(char lettre) {
		return lettresVoyelle.contains(Character.toUpperCase(lettre));
	}

	public abstract void transformer(String mot);

	public abstract String getValeur();
}
