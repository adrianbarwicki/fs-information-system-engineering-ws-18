package aufgabenReitz;
import java.util.Scanner;
import Methoden.*;

class Aufgabe1 {

	public static void aufgabe1(Scanner in) {
		Person p = new Person(0, "", "", "");
		
		System.out.printf(p.getStimmung());
		
		int laufzeit;
		String ergebnisString;
		double zinssatz, anlagebetrag;
		double[][] ergebnisArray;
		
		try {
		System.out.printf("Bitte geben Sie den Zinssatz (in Prozent) ein:\t");
		zinssatz = in.nextDouble();
		
		System.out.printf("Bitte geben Sie die Laufzeit (in Jahren) ein:\t");
		laufzeit = in.nextInt();
		
		System.out.printf("Bitte geben Sie den Anlagebetrag ein:\t\t");
		anlagebetrag = in.nextDouble();
		
		ergebnisArray = Zins.berechneErgebnisbetragArray(zinssatz, laufzeit, anlagebetrag);
		ergebnisString = Zins.printErgebnisbetragString(ergebnisArray, laufzeit);
		
		System.out.print(ergebnisString);
		}
		catch (Exception e) {
			System.out.print("ERROR!\nIhre Eingabe hat ein Problem verursacht, sodass die Anwendung beendet werden musste!");
		}
	}
}
