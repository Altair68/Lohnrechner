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

	public static void setMitarbeiters(ArrayList<Mitarbeiter> mitarbeiters) {
		Unternehmen.mitarbeiters = mitarbeiters;
	}
}
