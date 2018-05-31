package com.transformation;

public class MotFr extends Mot {
	private String valeur;

	public void transformer(String mot) {
		StringBuilder motTrans = new StringBuilder();
		String tabSeq[] = mot.split(codeTrans);
		for (int i = 0, j = 1; i < tabSeq.length; i++, j++) {
			if (tabSeq[i].equals("")) {
				if (isConsonne(tabSeq[j].charAt(0)))
					motTrans.append(codeTrans);
			} else {
				if ((j == tabSeq.length	|| (isConsonne(tabSeq[i].charAt(tabSeq[i].length() - 1)) && isVoyelle(tabSeq[j].charAt(0)))))
					motTrans.append(tabSeq[i]);
				else
					motTrans.append(tabSeq[i]).append(codeTrans);
			}
		}
		this.valeur = motTrans.toString();
	}

	public String getValeur() {
		return valeur;
	}
}
