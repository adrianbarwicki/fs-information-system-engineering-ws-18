package aufgabenReitz;
import java.util.Scanner;

class Einzahlungen {
	
	public static void einzahlungen(Scanner in) {
		int counter = 0;
		double einzahlung, geld = 0, transaktionen = 0, durchschnitt;
		
		System.out.printf("\nBitte geben Sie hier den Betrag der Einzahlung(+)/Auszahlung(-) an!\nDie Frage wird so lange wiederholt, bis Sie diese mit 0 beenden!\n");
		
		while (true) {
			System.out.printf("\t->");
			einzahlung = in.nextDouble();
			if (einzahlung == 0) {
				break;
			}
			geld += einzahlung;
			transaktionen += Math.sqrt(Math.pow(einzahlung, 2));
			counter++;
			durchschnitt = transaktionen/counter;
			System.out.printf("\nIhr neuer Kontostand beträgt: %.2f€.\nDurchschnittlich betragen Ihre Transaktionen einen Wert von %.2f€.\n", geld, durchschnitt);
		}
	}
}
