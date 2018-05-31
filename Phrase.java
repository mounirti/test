package com.transfomation;

public class Phrase {

	private String phraseOrignie = "bonjour chante exemple au devient";
	private String phraseTransforme = "";
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

		phraseTransforme = phraseJa.toString().trim();
	}

	public void afficher() {

		System.out.println(phraseTransforme);
	}

	public String getPhraseOrignie() {
		return phraseOrignie;
	}

	public String getPhraseTransformeT() {
		return phraseTransforme;
	}

	public String getTypeTransformation() {
		return typeTransformation;
	}
}
