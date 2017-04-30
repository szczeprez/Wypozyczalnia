package org.tom.wypozyczalnia;

import java.io.Serializable;

public class Book implements Serializable{
	
	private int id; 
	private String tytul;
	private String autor;
	private Gatunek gatunek;
	private int liczbaStron;
	private Stan naStanie; 

	public Stan isNaStanie() {
		return naStanie;
	}

	public void setNaStanie(Stan naStanie) {
		this.naStanie = naStanie;
	}

	enum Gatunek{
		PRZYGODOWA, 
		KRYMINAŁ, 
		OPOWIADANIE, 
		INFORMATYCZNA
	}
	
	public Book() {
	}



	public Book(int id, String tytul, String autor, Gatunek gatunek, int liczbaStron, Stan naStanie) {
		super();
		this.id = id;
		this.tytul = tytul;
		this.autor = autor;
		this.gatunek = gatunek;
		this.liczbaStron = liczbaStron;
		this.naStanie = naStanie;
	}

	public String getTytul() {
		return tytul;
	}

	public void setTytul(String tytul) {
		this.tytul = tytul;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Gatunek getGatunek() {
		return gatunek;
	}

	public void setGatunek(Gatunek gatunek) {
		this.gatunek = gatunek;
	}

	public int getLiczbaStron() {
		return liczbaStron;
	}

	public void setLiczbaStron(int liczbaStron) {
		this.liczbaStron = liczbaStron;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", tytul=" + tytul + ", autor=" + autor + ", gatunek=" + gatunek + ", liczbaStron="
				+ liczbaStron + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((autor == null) ? 0 : autor.hashCode());
		result = prime * result + ((gatunek == null) ? 0 : gatunek.hashCode());
		result = prime * result + id;
		result = prime * result + liczbaStron;
		result = prime * result + ((tytul == null) ? 0 : tytul.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (autor == null) {
			if (other.autor != null)
				return false;
		} else if (!autor.equals(other.autor))
			return false;
		if (gatunek == null) {
			if (other.gatunek != null)
				return false;
		} else if (!gatunek.equals(other.gatunek))
			return false;
		if (id != other.id)
			return false;
		if (liczbaStron != other.liczbaStron)
			return false;
		if (tytul == null) {
			if (other.tytul != null)
				return false;
		} else if (!tytul.equals(other.tytul))
			return false;
		return true;
	}
	
	

}
