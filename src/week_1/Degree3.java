package week_1;
import java.util.Scanner;

class Degree3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Entrez a(int) : ");
		int a = scanner.nextInt();
		System.out.print("Entrez b(int) : ");
		int b = scanner.nextInt();
		System.out.print("Entrez c(int) : ");
		int c = scanner.nextInt();

		System.out.print("Entrez x (double) : ");
		double x = scanner.nextDouble();

		double xCarre = x * x;
		double ab = a + b;
		double valeur = ab/2 * x * xCarre + ab * ab * xCarre + ab +c;
		System.out.println("La valeur de l'expression est: " + valeur);
		scanner.close();
	}
}
