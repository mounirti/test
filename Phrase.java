package com.transformation;

public class Phrase {
	private String phraseOrigine;
	private String phraseTransformee;
	private String typeTransformation;

	Phrase(String phrase, String typeTrans) {		
		this.phraseOrigine = phrase;
		this.typeTransformation = typeTrans;
		transformer();
	}

	private void transformer() {
		Transformateur trans = Transformateur.getTransformateur();
		Mot mot = trans.recupererMot(typeTransformation);
		String[] tabMot = phraseOrigine.split(" ");
		StringBuilder phraseJa = new StringBuilder();
		for (String valM : tabMot) {
			mot.transformer(valM);
			phraseJa.append(" ").append(mot.getValeur());
		}		
		phraseTransformee = phraseJa.toString().trim();
	}

	public void afficher() {		
		System.out.println(phraseTransformee);
	}

	public String getPhraseOrigine() {
		return phraseOrigine;
	}

	public String getPhraseTransformeT() {
		return phraseTransformee;
	}

	public String getTypeTransformation() {
		return typeTransformation;
	}
}
