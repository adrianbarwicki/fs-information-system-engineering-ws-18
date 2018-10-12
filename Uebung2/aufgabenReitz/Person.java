package aufgabenReitz;
import java.util.Random;

class Person {
	private int alter, code;
	private String vorname, nachname, nationalitaet;
	
	public Person(int alter, String vorname, String nachname, String nationalitaet) {
		this.alter = alter;
		this.vorname = vorname;
		this.nachname = nachname;
		this.nationalitaet = nationalitaet;
	}
	
	public void setAlter(int alter) {
		this.alter = alter;
	}
	public int getAlter() {
		return alter;
	}
	
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
	public String getVorname() {
		return vorname;
	}
	
	public void setNachname(String nachname) {
		this.nachname = nachname;
	}
	public String getNachname() {
		return nachname;
	}
	
	public void setNationalitaet(String nationalitaet) {
		this.nationalitaet = nationalitaet;
	}
	public String getNationalitaet() {
		return nationalitaet;
	}
	
	public void setCode(int code) {
		this.code = code;
	}
	public int getCode() {
		return code;
	}
	
 	public String getStimmung() {
		Random number = new Random();
		int zahl = number.nextInt(8);
		String stimmungen[] = {"gut", "schlecht", "mäßig", "super", "gut wie nie", "super schlecht", "unglaublich", "wie im Urlaub"};
		return ("Mir geht es " + stimmungen[zahl] + "!");
	}
}
