package week_1;
import java.util.Scanner;

public class Fondue {
   
   public static void main(String[] args) {
      final int BASE = 4;   
      double fromage = 800;
      double eau = 2;
      double ail = 2;
      double pain = 400;
      System.out.print("Entrez le nombre de personne conviée à la fondue: ");
	  Scanner scanner = new Scanner(System.in);
	  
      double nbConvives = scanner.nextDouble();
      
                                 
      nbConvives /= BASE;
      fromage *= nbConvives;
      eau    *= nbConvives;
      ail    *= nbConvives;
      pain    *= nbConvives;

      System.out.println();
      System.out.print("Pour faire une fondue fribourgeoise pour " + nbConvives + " personne, ");
      System.out.println("il vous faut : ");
      System.out.println(" - " + fromage + " gr de Vacherin fribourgeois");
      System.out.println(" - " + eau + " dl d'eau");
      System.out.println(" - " + ail + " gousse(s) d'ail");
      System.out.println(" - " + pain + " gr de pain");
      System.out.println(" - du poivre à volonté");

	  scanner.close();
   }
   
}

