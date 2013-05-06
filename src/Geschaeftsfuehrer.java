/**
 * User: Manu
 * Date: 06.05.13
 * Time: 13:27
 */
public class Geschaeftsfuehrer extends Manager{

	private long zulage;

	public Geschaeftsfuehrer(int aPersonalnummer, String aName, String anAdress, int aGeburtstag) {
		super(aPersonalnummer, aName, anAdress, aGeburtstag);
	}

	@Override
	public double berechneLohn() {
		return super.berechneLohn() + getZulage();
	}

	public long getZulage() {
		return zulage;
	}

	public void setZulage(long zulage) {
		this.zulage = zulage;
	}
}
