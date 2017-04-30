package org.tom.wypozyczalnia;

import org.tom.wypozyczalnia.Book.Gatunek;

public class Main {

	/**
	 * Wypożyczam, oddaje, 
	 * sprawdzam czy jest wypożyczona, 
	 * Szukam książek po gatunku, tytule, autorze, 
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		Wypozyczalnia wyp = new Wypozyczalnia(); 
		//wyp.dostepneTytuly(); 
		wyp.wypozyczKsiazke("CMS"); 
		wyp.wypozyczKsiazke("W pustyni"); 
		wyp.wypozyczKsiazke("Java programowanie"); 
		wyp.dostepneTytuly(); 
		System.out.println("--------");
		wyp.oddajKsiazke("CMS");
		wyp.oddajKsiazke("W pustyni");
		//wyp.dostepneTytuly(); 
		System.out.println("--------");
		//wyp.szukajKsiazkePoGatunku(Gatunek.PRZYGODOWA); 
		
		//Util.zapiszDoPliku(wyp);
		//Util.czytajZPliku("Zapisane");
		Util.zapiszObjectZPliku(wyp);
		Util.czytajObjectZPliku("BookData.ser");
	}

}
