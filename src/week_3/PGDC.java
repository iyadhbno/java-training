package week_3;

import java.util.Scanner;

public class PGDC {
	public static int getPgcd(int a, int b) {
		int res = Math.max(a, b);
		if (a != 0 || b != 0) {

			while (a != b) {
				if (a > b) {
					a = a - b;
				} else {
					b = b - a;
				}
			}
			res = a;

		}
		return res;

	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Entrez un nombre positif : ");
		int nb1 = scanner.nextInt();
		System.out.print("Entrez un nombre positif : ");
		int nb2 = scanner.nextInt();
		scanner.close();

		System.out.println("Le plus grand diviseur commun de " + nb1 + " et " + nb2 + " est " + getPgcd(nb1, nb2));

	}
}
