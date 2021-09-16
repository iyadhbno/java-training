package week_2;

import java.util.Scanner;

public class Ex6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Entrez un nombre entier : ");
		int num = scanner.nextInt();

		if (num == 0) {
			System.out.println("Le nombre est zéro (et il est pair)");
		} else {
			if (num < 0) {
				System.out.print("Le nombre est négatif ");
			} else {
				System.out.print("Le nombre est positif ");
			}
			int rest = num % 2;
			if (rest == 0) {
				System.out.println("et pair");
			} else {
				System.out.println("et impair");
			}
		}
		scanner.close();
	}
}