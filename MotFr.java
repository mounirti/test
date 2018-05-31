package com.transformation;

public class MotFr extends Mot {
	
	private String mot = "";

	public void transformer(String mot) {

		StringBuilder motTrans = new StringBuilder();
		String tabSeq[] = mot.split(lettreTrans);
		
		for (int i = 0, j = 1; i < tabSeq.length; i++, j++) {

			if (tabSeq[i].equals("")) {
				if (isConsonne(tabSeq[j].charAt(0)))
					motTrans.append(lettreTrans);
			} else {
				if ((j == tabSeq.length	|| (isConsonne(tabSeq[i].charAt(tabSeq[i].length() - 1)) && isVoyelle(tabSeq[j].charAt(0)))))
					motTrans.append(tabSeq[i]);
				else
					motTrans.append(tabSeq[i]).append(lettreTrans);
			}
		}

		this.mot = motTrans.toString();
	}

	public String getMot() {
		return mot;
	}

}
