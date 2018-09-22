package uebung1;

import java.util.Scanner;

/**
 * Aufgabe1
 */
public class Aufgabe1 {
	/**
	 * [Aufgabe aus der Vorlesung] Erstellen Sie ein Programm, dass die folgende Aus- gaben erledigt. Erstellen Sie zusaetzlich ein passendes Struktogramm:
		Bitte geben Sie den Zinssatz (in Prozent) ein: 10
		Bitte geben Sie die Laufzeit (in Jahren) ein: 2
		Bitte geben Sie den Anlagebetrag ein: 1000
		Jahr Anfangsbetrag Zinsen Endbetrag
		0 1000 100 1100
		1 1100 110 1210
		2 1210 121 1331
	 */
	public static void solvePointA() {
		Scanner reader = new Scanner(System.in);
		System.out.println("Bitte geben Sie den Zinssatz (in Prozent) ein:");
		double interestRateInPercent = reader.nextDouble();
		
		System.out.println("Bitte geben Sie die Laufzeit (in Jahren) ein");
		int noOfPeriods = reader.nextInt();
		
		System.out.println("Bitte geben Sie den Anlagebetrag ein:");
		double startCapital = reader.nextInt();
		
		reader.close();

		InterestService.calculateAndDisplayCapitalAfterInterestYearByYear(startCapital, interestRateInPercent, noOfPeriods);
	}
	/**
	 * 
	 * Erstellen Sie eine abgewandelte Form von ihrem Programm aus a). Erstellen Sie auch hier ein passendes Struktogramm.
	 	Bitte geben Sie den Zinssatz (in Prozent) ein: 10
		Bitte geben Sie den Anlagebetrag ein: 1000
		Bitte geben Sie den Endbetrag ein: 1300
		
		Jahr Anfangsbetrag Zinsen Endbetrag
		0 1000 100 1100
		1 1100 110 1210
		2 1210 121 1331
	 */
	public static void solvePointB() {
		Scanner reader = new Scanner(System.in);
		System.out.println("Bitte geben Sie den Zinssatz (in Prozent) ein:");
		double interestRateInPercent = reader.nextDouble();
		
		System.out.println("Bitte geben Sie den Anlagebetrag ein:");
		double startCapital = reader.nextInt();
		
		System.out.println("Bitte geben Sie den Endbetrag ein:");
		double endCapital = reader.nextInt();
		
		reader.close();

		double capitalAfterInterest = startCapital;
		int index = 0;
		
		while (capitalAfterInterest < endCapital) {
			double interest = capitalAfterInterest * (interestRateInPercent / 100);
			double capitalAtTheEndOfYear = capitalAfterInterest + interest;
			
			System.out.println("Jahr:" + index + ", Anfangsbetrag: " + capitalAfterInterest + ", Zinsen: " + interest + ", Endbetrag: " + capitalAtTheEndOfYear);

			capitalAfterInterest = capitalAtTheEndOfYear;
			
			index++;
		}
	}
	
	/**
	 * Erstellen Sie eine Klasse Person.
	 * Diese soll die privaten Eigenschaften Alter, Vor- name, Name und Nationalitaet haben.
	 * Waehlen Sie sinnvolle Datentypen.
	 * Erstellen Sie einen Konstruktor, ueber den diese Felder gesetzt werden koennen.
	 * Zusaetzlich sollen die Felder ueber setter und getter verwendbar sein.
	 */
	public static void solvePointC() {
		Person adrian = new Person("Adrian", "Barwicki", 25, "PL");
		Person tom = new Person("Tom", "XXX", 20, "DE");
		Person luca = new Person("Luca", "XXX", 20, "DE");
		Person jonathan = new Person("Jonathan", "XXX", 20, "DE");
		
		adrian.sayHello();
		tom.sayHello();
		luca.sayHello();
		jonathan.sayHello();
	}
	
	/**
	 * Schreiben Sie ein Programm, dass Ihnen am Ende die Summe der Einzahlungen sowie den durchschnittlich eingezahlten Betrag ausgibt.
	 */
	public static void solvePointD() {
		AccountAufgabe1D account = new AccountAufgabe1D();
		
		account.payin(100);
		account.payin(200);
		account.payin(500);
		
		System.out.println("Average payin is: " + account.getAveragePayin());
	}
}
