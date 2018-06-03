package com.transformation;

public class MotJa implements Mot {
	private String valeur;
	private String typeMot;
	
	public MotJa(String typeMot) {		
		this.typeMot=typeMot;
	}


	public void transformer(String mot) {
		StringBuilder motTrans = new StringBuilder();
		char tabChar[] = mot.toCharArray();
		for (int i = 0, j = 1; i < tabChar.length; i++, j++) {
			if (j < tabChar.length && Mot.isConsonne(tabChar[i]) && Mot.isVoyelle(tabChar[j])) {
				motTrans.append(tabChar[i]).append(CODE_TRANS).append(tabChar[j]);
				i++;j++;
			} else {
				motTrans.append(tabChar[i]);
			}
			if (i == 0 && Mot.isVoyelle(tabChar[i]))
				motTrans.insert(0, CODE_TRANS);
		}
		this.valeur = motTrans.toString();
	}

	public String getValeur() {
		return valeur;
	}

}
