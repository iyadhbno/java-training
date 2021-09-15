package week_1;

import java.util.Scanner;

public class RoseBlanches {
public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Combien avez-vous reçu d'argent (Frs) ?: ");
		int argentRecu = scanner.nextInt();


		int argentLivres = argentRecu * 3 / 4;
		int resteArgent = argentRecu - argentLivres;

		int autre = resteArgent / 3;

		int nbcafes = autre / 2;

		int nbFlash = autre / 4;

		int nbBillets = autre / 3;

		int reste = autre % 2 + autre % 4 + autre % 3 + resteArgent % 3;

		System.out.println("Livres et Fournitures: " + argentLivres + " Frs.");
		System.out.println("Vous pouvez ensuite acheter:");
		System.out.println(" " + nbcafes + " cafés à Sat");
		System.out.println(" " + nbFlash + " numéros du Flash");
		System.out.println(" " + nbBillets + " billets de métro");
		System.out.println("et il vous restera " + reste + " Frs pour les roses blanches.");

		scanner.close();
	}
}
