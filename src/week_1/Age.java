package week_1;

import java.util.Scanner;

public class Age {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int age;
		int annee = 2021;
		System.out.print("donner votre age: ");
		age = scanner.nextInt();
		annee -= age;
		System.out.println("votre année de naissance est :" + annee);
		scanner.close();

	}

}
