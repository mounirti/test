package com.transfomation;

public class MotJa extends Mot {
	
	private String mot = "";

	public void transformer(String mot) {

		StringBuilder motTrans = new StringBuilder();
		char tabChar[] = mot.toCharArray();

		for (int i = 0, j = 1; i < tabChar.length; i++, j++) {

			if (j < tabChar.length && isConsonne(tabChar[i]) && isVoyelle(tabChar[j])) {
				motTrans.append(tabChar[i]).append(lettreTrans).append(tabChar[j]);
				i++;
				j++;
			} else {
				motTrans.append(tabChar[i]);
			}
			if (i == 0 && isVoyelle(tabChar[i]))
				motTrans.insert(0, lettreTrans);
		}

		this.mot = motTrans.toString();
	}

	public String getMot() {
		return mot;
	}

}
