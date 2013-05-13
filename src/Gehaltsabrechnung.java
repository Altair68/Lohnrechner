import java.util.List;

/**
 * User: Manu
 * Date: 13.05.13
 * Time: 12:10
 */
public class Gehaltsabrechnung {
	private double gehaltGesamt = 0;
	private List<Mitarbeiter> mitarbeiterList;

	public Gehaltsabrechnung(List<Mitarbeiter> someMitarbeiters) {
		mitarbeiterList = someMitarbeiters;
		berechneGehaelter();
	}

	public void berechneGehaelter() {
		System.out.println("---------------------------------");
		for (Mitarbeiter eachMitarbeiter : mitarbeiterList) {
			double theLohn = eachMitarbeiter.berechneLohn();
			gehaltGesamt += theLohn;
			System.out.println("Stellung: " + eachMitarbeiter.getClass().getName());
			System.out.println("Gehalt = " + theLohn);
			System.out.println("---------------------------------");
		}
		System.out.println("");
	}

	public double getGehaltGesamt() {
		return gehaltGesamt;
	}
}
