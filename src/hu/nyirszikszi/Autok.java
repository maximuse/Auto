package hu.nyirszikszi;

public class Autok {
	int evjarat;
	String marka;
	String szin = null;
	String kivitel;
	
	public Autok(int evjarat, String marka, String kivitel) {
		this.evjarat = evjarat;
		this.marka = marka;
		this.kivitel = kivitel;
	}
	
	@Override
	public String toString() {
		return "Autok{" + "evjarat=" + evjarat + ", marka='" + marka + "', szin='" + szin + "', kivitel='" + kivitel + "'}";
	}
	
	protected void setEvjarat(int evjarat) {
		this.evjarat = evjarat;
	}
	
	protected void setSzin(String szin) {
		this.szin = szin;
	}
}