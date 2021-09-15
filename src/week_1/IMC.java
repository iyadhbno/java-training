package week_1;
import java.util.Scanner;

public class IMC {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		double poids ;
		double taille ;
		System.out.print("Entrez un poids (en kg) : ");
		poids = scanner.nextDouble();
		System.out.print("Entrez une taille (en m) : ");
		taille = scanner.nextDouble();
		double imc = poids / (taille * taille);
		System.out.println("Pour " + poids
				+ " kg et " + taille
				+ " m, l'IMC est de " + imc);
		scanner.close();

	}

}
