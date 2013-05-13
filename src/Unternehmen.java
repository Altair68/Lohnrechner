import java.util.ArrayList;

/**
 * User: Manu
 * Date: 06.05.13
 * Time: 17:04
 */
public class Unternehmen {
	private static ArrayList<Mitarbeiter> mitarbeiters = new ArrayList<Mitarbeiter>();

	public static ArrayList<Mitarbeiter> getMitarbeiters() {
		return mitarbeiters;
	}

	public void addMitarbeiter(Mitarbeiter aMitarbeiter) {
		mitarbeiters.add(aMitarbeiter);
	}

	public static void setMitarbeiters(ArrayList<Mitarbeiter> mitarbeiters) {
		Unternehmen.mitarbeiters = mitarbeiters;
	}
	
	public static void main(String[] args) {
		Angestellter theAngestellter = new Angestellter(1, "Fritz", "Daheim", 19780524);
		theAngestellter.setGrundgehalt(1000);
		theAngestellter.setZulagen(200);
		Arbeiter theArbeiter = new Arbeiter(2, "Franz", "Daheim", 19780524);
		theArbeiter.setStundenlohn(6);
		theArbeiter.setStunden(160);
		Manager theManager = new Manager(3, "Wilhelm", "Daheim", 19780524);
		theManager.setGrundgehalt(20);
		theManager.setProvision(500000);
		Geschaeftsfuehrer theGeschaeftsfuehrer = new Geschaeftsfuehrer(4, "Jörg", "Daheim", 19780524);
		theGeschaeftsfuehrer.setGrundgehalt(50);
		theGeschaeftsfuehrer.setProvision(500000);
		theGeschaeftsfuehrer.setZulage(20000);

		Unternehmen theUnternehmen = new Unternehmen();
		theUnternehmen.addMitarbeiter(theAngestellter);
		theUnternehmen.addMitarbeiter(theArbeiter);
		theUnternehmen.addMitarbeiter(theManager);
		theUnternehmen.addMitarbeiter(theGeschaeftsfuehrer);

		Gehaltsabrechnung theGehaltsabrechnung = new Gehaltsabrechnung(getMitarbeiters());
		System.out.println("GesamtLohn = " + theGehaltsabrechnung.getGehaltGesamt());
	}
}
