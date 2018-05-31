package com.transformation;

import java.util.Scanner;

public class LancementTransformation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String valeurPhrase = "";
		String valeurTypeTrans = "";

		//valeurPhrase = args[0];
		//valeurTypeTrans = args[1];
		
		System.out.println("Veuillez saisir une phrase : ");
		Scanner scanIn = new Scanner(System.in);
		valeurPhrase = scanIn.nextLine();
		System.out.println("Veuillez saisir un type de transformation 'fr' ou 'ja' ");
		valeurTypeTrans = scanIn.nextLine();
		scanIn.close();
		
		Phrase ph = new Phrase(valeurPhrase, valeurTypeTrans.toUpperCase());
		ph.afficher();
	}
}
