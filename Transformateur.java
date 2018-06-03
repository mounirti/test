package com.transformation;

public class Transformateur {
	private static Transformateur instanceGen;

	public static Transformateur getTransformateur() {
		if (instanceGen == null) {
			instanceGen = new Transformateur();
		}
		return instanceGen;
	}
	
	Mot recupererMot(String typeTransformation) {
		Mot objMot = null;
		switch (typeTransformation) {
		case "FR":
			objMot = new MotFr(typeTransformation);
			break;
		case "JA":
			objMot = new MotJa(typeTransformation);
			break;
		default:
			throw new IllegalArgumentException("Le type de transformation est incorrect.");			
		}
		return objMot;
	}
}
