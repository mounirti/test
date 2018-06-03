package com.transformation;

import java.util.Locale.Category;
import java.util.Scanner;

public class LancementTransformation {

	public static void main(String[] args) {
		String valeurPhrase = "";
		String valeurTypeTrans = "";
		//valeurPhrase = args[0];
		//valeurTypeTrans = args[1];	
		try{
		System.out.println("Veuillez saisir une phrase : ");
		Scanner scanIn = new Scanner(System.in);
		valeurPhrase = scanIn.nextLine();
		System.out.println("Veuillez saisir un type de transformation 'fr' ou 'ja' ");
		valeurTypeTrans = scanIn.nextLine();
		scanIn.close();		
		Phrase ph = new Phrase(valeurPhrase, valeurTypeTrans.toUpperCase());
		ph.afficher();
		}catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}
}
