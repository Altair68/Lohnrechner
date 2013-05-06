import java.util.HashMap;

/**
 * User: Manu
 * Date: 06.05.13
 * Time: 13:08
 */
public abstract class Mitarbeiter {

	private int personalnummer;
	private String name;
	private String adresse;
	private int geburtstag;

	public Mitarbeiter(int aPersonalnummer, String aName, String anAdress, int aGeburtstag) {
		this.personalnummer = aPersonalnummer;
		this.name = aName;
		this.adresse = anAdress;
		this.geburtstag = aGeburtstag;
	}

	public abstract double berechneLohn();

	public int getPersonalnummer() {
		return personalnummer;
	}

	public void setPersonalnummer(int personalnummer) {
		this.personalnummer = personalnummer;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public int getGeburtstag() {
		return geburtstag;
	}

	public void setGeburtstag(int geburtstag) {
		this.geburtstag = geburtstag;
	}
}
