package week_4;

import java.util.Scanner;

public class MulMat {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int lignes = 0;
		int colonnes = 0; 
		
		//matrice 1
		System.out.println("Saisie de la 1ere matrice");
		while (lignes < 1) {
			System.out.print("Nombre de lignes : ");
			lignes = scanner.nextInt();
		}
		
		while (colonnes < 1) {
			System.out.print("Nombre de colonnes : ");
			colonnes = scanner.nextInt();
		}
		
		
		double[][] mat1 = new double[lignes][colonnes];
		for (int row = 0; row < lignes; row++) {
			for (int col = 0; col < colonnes; col++) {
				System.out.print(" M[" + (row + 1) + "," + (col + 1) + "]=");
				mat1[row][col] = scanner.nextDouble();
			}
		}
		
		//matrice 2
		lignes = 0;
		colonnes = 0;
		System.out.println("Saisie de la 2eme matrice");
		while (lignes < 1) {
			System.out.print("Nombre de lignes : ");
			lignes = scanner.nextInt();
		}
		while (colonnes < 1) {
			System.out.print("Nombre de colonnes : ");
			colonnes = scanner.nextInt();
		}
		double[][] mat2 = new double[lignes][colonnes];
		for (int row = 0; row < lignes; row++) {
			for (int col = 0; col < colonnes; col++) {
				System.out.print(" M[" + (row + 1) + "," + (col + 1) + "]=");
				mat2[row][col] = scanner.nextDouble();
			}
		}
		
		
		if (mat1[0].length != mat2.length) {
			System.out.println("Multiplication de matrices impossible !");
		} else {
			double[][] prod = new double[mat1.length][mat2[0].length];
			for (int row = 0; row < mat1.length; row++) {
				for (int col = 0; col < mat2[0].length; col++) {
					prod[row][col] = 0.0;
					for (int i = 0; i < mat2.length; i++) {
						prod[row][col] += mat1[row][i] * mat2[i][col];
					}
				}
			}
			
			System.out.println("Resultat :");
			for (int row = 0; row < prod.length; row++) {
				for (int col = 0; col < prod[row].length; col++) {
					System.out.print(prod[row][col] + " ");
				}
				System.out.println();
			}
		}
		scanner.close();
	}

}
