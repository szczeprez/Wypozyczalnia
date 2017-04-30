package org.tom.wypozyczalnia;

import java.util.ArrayList;
import java.util.List;

import org.tom.wypozyczalnia.Book.Gatunek;

public class Wypozyczalnia implements Czynnosci {

	public List<Book> bibioteka = null; 
	
	public Wypozyczalnia() {
		bibioteka = listaKsiazekBibioteki();
	}

	@Override
	public void oddajKsiazke(String tytul) {
		
		for(Book b : bibioteka){
			if(b.getTytul().equals(tytul)){
				b.setNaStanie(Stan.DOSTEPNA);
			}
		}
	}

	@Override
	public boolean wypozyczKsiazke(String tytul) {

		for (Book book : bibioteka) {
			if (Stan.DOSTEPNA.equals(book.isNaStanie()) && book.getTytul().equals(tytul)) {
				book.setNaStanie(Stan.WYPOZYCZONA);
				return true; 
			}
		}
		return false;
	}

	@Override
	public String szukajKsiazkiPoId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> szukajKsiazkePoTytule(String tytul) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> szukajKsiazkePoAutorze(String autor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> szukajKsiazkePoGatunku(Gatunek gatunek) throws Exception {
		List<String>listaKsiazek = new ArrayList<>(); 

		for(Book b : bibioteka){
			if(b.getGatunek().equals(gatunek)){
				listaKsiazek.add(b.toString()); 
				System.out.println(b.toString());
			}
			
		}
 
			if(listaKsiazek.isEmpty()) throw new NullPointerException("Brak książęk z gatunku " + gatunek.toString());
 
		return listaKsiazek;
	}

	public static List<Book> listaKsiazekBibioteki() {
		List<Book> bibioteka = new ArrayList<>();
		bibioteka.add(new Book(1, "W pustyni", "Sienkiewicz Henryk", Gatunek.PRZYGODOWA, 255, Stan.DOSTEPNA));
		bibioteka.add(new Book(2, "Java programowanie", "Ritchar Tolson", Gatunek.INFORMATYCZNA, 550, Stan.DOSTEPNA));
		bibioteka.add(new Book(3, "Janko Muzykant", "Janowki Tomasz", Gatunek.PRZYGODOWA, 122, Stan.DOSTEPNA));
		bibioteka.add(new Book(4, "CMS", "Tomas Cann", Gatunek.INFORMATYCZNA, 255, Stan.DOSTEPNA));

		return bibioteka;

	}

	@Override
	public String iloscNaStanie() {
		return "Aktualnie posiadamy w Bibiotece " + bibioteka.size() + " książek.";
	}

	@Override
	public String dostepneTytuly() {
		for(Book b : bibioteka){
			if(Stan.DOSTEPNA.equals(b.isNaStanie()))
			System.out.println(b.getTytul());
		}
		return null;
	}

}
