/**
 * User: Manu
 * Date: 06.05.13
 * Time: 13:22
 */
public class Manager extends Mitarbeiter {

	private long grundgehalt;
	private double provision;

	public Manager(int aPersonalnummer, String aName, String anAdress, int aGeburtstag) {
		super(aPersonalnummer, aName, anAdress, aGeburtstag);
	}

	@Override
	public double berechneLohn() {
		return getGrundgehalt() + getProvision();
	}

	public long getGrundgehalt() {
		return grundgehalt;
	}

	public void setGrundgehalt(long grundgehalt) {
		this.grundgehalt = grundgehalt;
	}

	public double getProvision() {
		return provision;
	}

	public void setProvision(long anUmsatz) {
		this.provision = anUmsatz * 0.05;
	}
}
