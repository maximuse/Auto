package hu.nyirszikszi;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
		ArrayList<Autok> parkoloAutok = new ArrayList<>();
		String[] markak = {"Aston Martin", "Bentley", "Bugatti", "Maserati", "Ferrari", "Porsche", "Lamborghini", "Jaguar", "Tesla", "Koenigsegg", "McLaren", "Rolls-Royce", "Pagani"};
		String[] kivitelek = {"cabrio", "coupe", "sport", "sedan"};
		int db = 10;
		int min = 1950;
		int max = 2018;
		Random rand = new Random();
        
        for (int i = 0; i < db; i++) {
			String marka = markak[rand.nextInt(markak.length)];
			String kivitel = kivitelek[rand.nextInt(kivitelek.length)];
			int evjarat = rand.nextInt((max - min) + 1) + min;
			Autok pa = new Autok(evjarat, marka, kivitel);
			parkoloAutok.add(pa);
        }
        
		System.out.println();
		listaz(parkoloAutok);
		
		parkoloAutok.get(0).setSzin("ezüst");
		System.out.println();
		System.out.println("Autok[marka='" + parkoloAutok.get(0).marka + "', szin='" + parkoloAutok.get(0).szin + "', kivitel='" + parkoloAutok.get(0).kivitel + "']");
		
		System.out.println();
		listaz(parkoloAutok);
		
		parkoloAutok.add(0, new Autok(2017, "Ferrari", "sport"));
		
		System.out.println();
		listaz(parkoloAutok);
		
		System.out.println();
		System.out.println(parkoloAutok.get(0));
		parkoloAutok.get(0).setEvjarat(2018);
		System.out.println(parkoloAutok.get(0));
	}
    
    static public void listaz(ArrayList parkoloAutok) {
		for (Object parkoloAuto : parkoloAutok) {
			System.out.println(parkoloAuto);
		}
		System.out.println(parkoloAutok.size());
	}
}