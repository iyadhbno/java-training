package week_3;

import java.util.Scanner;

public class Rebonds1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		final double G = 9.81; // gravité
		double v = 0.0; // vitesse avant le rebond
		double v1 = 0.0; // vitesse apres le rebond
		double h = 0.0; // hauteur avant le rebond
		double h1 = 0.0; // hauteur de remontée
		double h0 = 0.0; // hauteur initiale
		double eps = 0.0; // valeur epsilon
		int nbr = 0; // nombre de rebonds

		do {
			System.out.print("Coefficient de rebond entre 0 et 1 : ");
			eps = scanner.nextDouble();
		} while ((eps < 0.0) || (eps >= 1.0));

		do {
			System.out.print("Hauteur initiale superieur a 0 : ");
			h0 = scanner.nextDouble();
		} while (h0 < 0.0);
		do {
			System.out.print("Nombre de rebonds superieur a 0 : ");
			nbr = scanner.nextInt();
		} while (nbr < 0);
		
		h= h0;
		for (int nombre = 0; nombre < nbr; ++nombre) {
			v = Math.sqrt(2.0 * G * h);

			v1 = eps * v; // vitesse apres le rebond

			h1 = (v1 * v1) / (2.0 * G); // la hauteur de la remonte
			h = h1;// nouvelle hauteur

			System.out.println("rebond " + (nombre + 1) + " : " + h);
		}
		System.out.println("Au " + nbr + "eme rebond, la hauteur sera de " + h);
		scanner.close();
	}
}
