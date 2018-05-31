package com.transformation;

public class Transformateur {

	static Transformateur instanceGen = null;

	public static Transformateur getTransformateur() {

		if (instanceGen == null) {
			instanceGen = new Transformateur();
		}
		return instanceGen;
	}

	public Transformateur() {
		// TODO Auto-generated constructor stub
	}

	Mot recupererMotTransformation(String typeTransformation) {
		Mot objMot = null;
		switch (typeTransformation) {
		case "FR":
			objMot = new MotFr();
			break;
		case "JA":
			objMot = new MotJa();
			break;

		default:
			throw new IllegalArgumentException("Le type de transformation est incorrect.");			
		}

		return objMot;
	}

}
