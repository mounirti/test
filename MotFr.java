package com.transformation;



public class MotFr implements Mot {
	private String valeur;
	private String typeMot;
	
	public MotFr(String typeMot) {		
		this.typeMot=typeMot;
	}

	public void transformer(String mot) {
		StringBuilder motTrans = new StringBuilder();
		String tabSeq[] = mot.split(Mot.CODE_TRANS);
		for (int i = 0, j = 1; i < tabSeq.length; i++, j++) {
			if (tabSeq[i].equals("")) {
				if (Mot.isConsonne(tabSeq[j].charAt(0)))
					motTrans.append(Mot.CODE_TRANS);
			} else {
				if ((j == tabSeq.length	|| (Mot.isConsonne(tabSeq[i].charAt(tabSeq[i].length() - 1)) && Mot.isVoyelle(tabSeq[j].charAt(0)))))
					motTrans.append(tabSeq[i]);
				else
					motTrans.append(tabSeq[i]).append(Mot.CODE_TRANS);
			}
		}
		this.valeur = motTrans.toString();
	}

	public String getValeur() {
		return valeur;
	}
}
