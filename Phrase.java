package com.transformation;

public class Phrase {

	private String phraseOrignie = "";
	private String phraseTransformee = "";
	private String typeTransformation = "";

	Phrase(String phrase, String typeTrans) {
		this.phraseOrignie = phrase;
		this.typeTransformation = typeTrans;
		tranformer();
	}

	private void tranformer() {

		Transformateur trans = Transformateur.getTransformateur();
		Mot mot = trans.recupererMotTransformation(typeTransformation);
		String[] tabMot = phraseOrignie.split(" ");
		StringBuilder phraseJa = new StringBuilder();
		for (String valM : tabMot) {
			mot.transformer(valM);
			phraseJa.append(" ").append(mot.getMot());
		}

		phraseTransformee = phraseJa.toString().trim();
	}

	public void afficher() {
		
		System.out.println(phraseTransformee);
	}

	public String getPhraseOrignie() {
		return phraseOrignie;
	}

	public String getPhraseTransformeT() {
		return phraseTransformee;
	}

	public String getTypeTransformation() {
		return typeTransformation;
	}
}
