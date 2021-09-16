package week_3;

import java.util.Scanner;

public class Rebonds2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		final double G = 9.81;

		double v = 0.0;
		double v1 = 0.0;
		double h = 0.0;
		double h1 = 0.0;
		double h0 = 0.0;
		double eps = 0.0;
		double hFin = 0.0;
	
		do {
			System.out.print("Coefficient de rebond entre 0 et 1  : ");
			eps = scanner.nextDouble();
		} while ((eps < 0.0) || (eps >= 1.0));
		do {
			System.out.print("Hauteur initiale superieur a 0 : ");
			h0 = scanner.nextDouble();
		} while (h0 < 0.0);
		do {
			System.out.println("Hauteur finale superieur a 0 : ");
			hFin = scanner.nextDouble();
		} while (hFin < 0.0 || hFin > h0);

		
		h = h0;
		int nbR = 0;
		do {
			v = Math.sqrt(2.0 * G * h);

			v1 = eps * v;// vitesse après le rebond

			nbR++;// incrémente le nombre de rebonds
			h1 = (v1 * v1) / (2.0 * G);// la hauteur à laquelle elle remonte...

			h = h1;// ...qui devient la nouvelle hauteur initiale

			System.out.println("rebond " + nbR + " : " + h);
		} while (h1 > hFin);
		System.out.println("Nombre de rebonds :" + nbR);
		scanner.close();
	}
}