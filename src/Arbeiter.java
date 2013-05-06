/**
 * User: Manu
 * Date: 06.05.13
 * Time: 13:14
 */
public class Arbeiter extends Mitarbeiter {

	private long stundenlohn;
	private int stunden;

	public Arbeiter(int aPersonalnummer, String aName, String anAdress, int aGeburtstag) {
		super(aPersonalnummer, aName, anAdress, aGeburtstag);
	}

	@Override
	public double berechneLohn() {
		return getStundenlohn()*getStunden();
	}

	public long getStundenlohn() {
		return stundenlohn;
	}

	public void setStundenlohn(long stundenlohn) {
		this.stundenlohn = stundenlohn;
	}

	public int getStunden() {
		return stunden;
	}

	public void setStunden(int stunden) {
		this.stunden = stunden;
	}
}
