package hu.nyirszikszi;

public class Autok {
	private int evjarat;
	private String marka;
	private String szin = null;
	private String kivitel;
	
	Autok(int evjarat, String marka, String kivitel) {
		this.evjarat = evjarat;
		this.marka = marka;
		this.kivitel = kivitel;
	}
	
	@Override
	public String toString() {
		return "Autok{" + "evjarat=" + evjarat + ", marka='" + marka + "', szin='" + szin + "', kivitel='" + kivitel + "'}";
	}
	
	void setEvjarat(int evjarat) {
		this.evjarat = evjarat;
	}
	
	String getMarka() {
		return marka;
	}
	
	String getSzin() {
		return szin;
	}
	
	void setSzin(String szin) {
		this.szin = szin;
	}
	
	String getKivitel() {
		return kivitel;
	}
}