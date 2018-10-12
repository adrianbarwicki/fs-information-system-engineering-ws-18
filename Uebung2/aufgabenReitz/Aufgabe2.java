package aufgabenReitz;
import java.util.Scanner;
import Methoden.*;

class Aufgabe2 {
	public static void aufgabe2(Scanner in) {
		int laufzeit;
		String ergebnisString;
		double zinssatz, anlagebetrag, endbetrag;
		double[][] ergebnisArray;
		
		try {
		System.out.printf("Bitte geben Sie den Zinssatz (in Prozent) ein:\t");
		zinssatz = in.nextDouble();
		
		System.out.printf("Bitte geben Sie den Anlagebetrag ein:\t\t");
		anlagebetrag = in.nextDouble();
		
		System.out.printf("Bitte geben Sie den Endbetrag ein:\t\t");
		endbetrag = in.nextDouble();
		
		laufzeit = Zins.berechneLaufzeit(zinssatz, endbetrag, anlagebetrag) - 1;
		ergebnisArray = Zins.berechneErgebnisbetragArray(zinssatz, laufzeit, anlagebetrag);
		ergebnisString = Zins.printErgebnisbetragString(ergebnisArray, laufzeit);
		
		System.out.print(ergebnisString);
		}
		catch (Exception e) {
			System.out.print("ERROR!\nIhre Eingabe hat ein Problem verursacht, sodass die Anwendung beendet werden musste!");
		}
	}
}
