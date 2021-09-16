package week_3;

import java.util.Scanner;

public class PGDC {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Entrez un nombre positif : ");
		int nb1 = scanner.nextInt();
		System.out.print("Entrez un nombre positif : ");
		int nb2 = scanner.nextInt();

		int a = nb1;
		int b = nb2;
		while (a != b) {
			if (a > b) {
				a = a - b;
			} else {
				b = b - a;
			}
		}
		System.out.println("Le plus grand diviseur commun de " + nb1 + " et " + nb2 + " est " + a);
		scanner.close();
	}
}
