package week_1;

import java.util.Scanner;

public class Permutation {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Donnez x: ");
		int x = scanner.nextInt();

		System.out.print("Donnez y: ");
		int y = scanner.nextInt();

		System.out.println("Avant permutation: ");
		System.out.println("x = " + x);
		System.out.println("y = " + y);

		int aux = x;
		x = y;
		y = aux;

		System.out.println("Après permutation: ");
		System.out.println("x = " + x);
		System.out.println("y = " + y);

		scanner.close();
	}

}
