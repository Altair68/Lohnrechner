/**
 * User: Manu
 * Date: 06.05.13
 * Time: 13:19
 */
public class Angestellter extends Mitarbeiter {

	private long grundgehalt;
	private long zulagen;

	public Angestellter(int aPersonalnummer, String aName, String anAdress, int aGeburtstag) {
		super(aPersonalnummer, aName, anAdress, aGeburtstag);
	}

	@Override
	public double berechneLohn() {
		return getGrundgehalt() + getZulagen();
	}

	public long getGrundgehalt() {
		return grundgehalt;
	}

	public void setGrundgehalt(long grundgehalt) {
		this.grundgehalt = grundgehalt;
	}

	public long getZulagen() {
		return zulagen;
	}

	public void setZulagen(long zulagen) {
		this.zulagen = zulagen;
	}
}
