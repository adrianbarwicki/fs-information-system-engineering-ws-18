package aufgabenReitz;
import java.util.Scanner;

public class Bankautomat {
	public static void main(String[] args) {
		try {
			Scanner in = new Scanner(System.in);
			Person person = new Person(0, "","","");
			int auswahl;
		
			System.out.printf("\t\tBankautomat".toUpperCase()+ "\n\nDies ist ein Bankautomat der neusten Generation mit verschiedenen Programmen.\nTesten Sie diese gerne aus\nZuerst müssen Sie sich aber registrieren!\n");
			System.out.printf("\nBitte geben Sie hier Ihren Vornamen ein:\n");
			person.setVorname(in.next());
		
			System.out.printf("\nBitte geben Sie hier Ihren Nachnamen ein:\n");
			person.setNachname(in.next());
		
			System.out.printf("\nBitte geben Sie hier Ihr Alter ein:\n");
			person.setAlter(in.nextInt());
			
			System.out.printf("\nBitte geben Sie hier Ihre Nationalitaet ein:\n");
			person.setNationalitaet(in.next());
		
			System.out.printf("\nVielen Dank für Ihre Registrierung.\nNun fehlt nurnoch Ihr persönlicher numerischer Code, den Sie bitte hier eingeben:\n");
			person.setCode(in.nextInt());
			
			System.out.printf("\nBitte wiederholen Sie Ihren Code um zu den Anwendungen zu gelangen:\n");
			
			
			if(in.nextInt() == person.getCode()) {
				System.out.printf("\n\nBitte wählen Sie aus den folgenden Anwendungen mit Eingabe der jeweiligen Zahl.\nSie verlassen das Programm mit jeder anderen Zahl!\nNr.1 Zinsrechner (Zinssatz, Laufzeit, Anlagebetrag)\nNr.2 Zinsrechner (Zinssatz, Anlagebetrag, Endbetrag)\nNr.3 Einzahlung/Auszahlung\n");
				
				do {
					System.out.print("\t->");
					auswahl = in.nextInt();
					System.out.println();
					switch (auswahl) {
					case 1: 
						Aufgabe1.aufgabe1(in);
						break;
					case 2: 
						Aufgabe2.aufgabe2(in);
						break;
					case 3:
						Einzahlungen.einzahlungen(in);
						break;
					default: 
						System.out.printf("Sie haben dieses Programm beendet!\n");
						break;
					}
				} while (auswahl == 1 || auswahl == 2 || auswahl == 3);
				
				System.out.printf("Sehr geehrter/-r %s %s, Ihnen noch einen schönen Tag!", person.getVorname(), person.getNachname());
			}
			else {
				System.out.printf("Sehr geehrte/-r %s %s, Ihre Pin ist falsch. Sie verlassen das Programm", person.getVorname(), person.getNachname());
			}
			in.close();
		}
		catch (Exception e) {
			System.out.printf("error".toUpperCase());
		}
	}
}
