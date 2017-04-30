package org.tom.wypozyczalnia;

import java.util.List;

import org.tom.wypozyczalnia.Book.Gatunek;

public interface Czynnosci {
	
	public void oddajKsiazke(String tytul); 
	public boolean wypozyczKsiazke(String tytul); 
	
	public String szukajKsiazkiPoId(int id); 
	public List<String> szukajKsiazkePoTytule(String tytul); 
	public List<String> szukajKsiazkePoAutorze(String autor); 
	public List<String> szukajKsiazkePoGatunku(Gatunek gatunek) throws Exception; 
	
	public String iloscNaStanie();
	public String dostepneTytuly(); 

}
