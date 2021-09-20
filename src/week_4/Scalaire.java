package week_4;

import java.util.Scanner;

public class Scalaire {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = 0;
		final int  NMAX =10;

		while (n < 1 || n > NMAX) {
			System.out.print("Quelle taille pour vos vecteurs entre 1 et 10 ");
			n = scanner.nextInt();
		}
		
		double[] v1 = new double[n];
		double[] v2 = new double[n];
		
		System.out.println("Saisie du premier vecteur :");
		for (int i = 0; i < n; i++) {
			System.out.print(" v1[" + i + "] = ");
			v1[i] = scanner.nextDouble();
		}
		
		System.out.println("Saisie du second vecteur :");
		for (int i = 0; i < n; i++) {
			System.out.print(" v2[" + i + "] = ");
			v2[i] = scanner.nextDouble();
		}
		
		
		double somme = 0.0;
		for (int i = 0; i < v1.length; i++) {
			somme += v1[i] * v2[i];
		}
		System.out.println("Le produit scalaire de v1 par v2 vaut " + somme);
		scanner.close();
	}

}
