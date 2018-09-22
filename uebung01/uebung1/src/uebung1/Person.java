package uebung1;

// Erstellen Sie eine Klasse Person - done
public class Person {
	// Diese soll die privaten Eigenschaften Alter, Vor- name, Name und Nationalitaet haben. Waehlen Sie sinnvolle Datentypen.
	private int alter;
	private String vorname;
	private String name;
	private String nationalitaet;
	
	// Erstellen Sie einen Konstruktor, ueber den diese Felder gesetzt werden koennen.
	public Person(String vorname, String name, int alter, String nationalitaet) {
		this.alter = alter;
		this.vorname = vorname;
		this.name = name;
		this.nationalitaet = nationalitaet;
	}
	
	public void sayHello() {
		System.out.println("Hello, I'm " + this.vorname + " " + this.name + ", I am from " + this.nationalitaet + " and I am " + this.alter);
	}
	
	// Zusaetzlich sollen die Felder ueber setter und getter verwendbar sein.
	public void setAlter(int alter) {
		this.alter = alter;
	}
	
	public int getAlter() {
		return this.alter;
	}
	
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
	
	public String getVorname() {
		return this.vorname;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setNationalitaet(String nationalitaet) {
		this.nationalitaet = nationalitaet;
	}
	
	public void getNationalitaet(String nationalitaet) {
		this.nationalitaet = nationalitaet;
	}
}
