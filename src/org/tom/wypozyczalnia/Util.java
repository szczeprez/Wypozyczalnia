package org.tom.wypozyczalnia;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import org.tom.wypozyczalnia.Wypozyczalnia;

public class Util {
	static List<Book> wyzp = null;

	public static void zapiszDoPliku(Wypozyczalnia wyp) throws FileNotFoundException {
		wyzp = wyp.bibioteka;
		PrintWriter pw = new PrintWriter(new File("Zapisane"));
		for (Book b : wyzp) {
			pw.write(b.toString() + "\n");
		}
		pw.close();

	}

	public static void czytajZPliku(String s) throws FileNotFoundException {
		BufferedReader br;
		br = new BufferedReader(new FileReader(new File(s)));

		String lineContent;
		try {
			while ((lineContent = br.readLine()) != null) {
				System.out.println(lineContent);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void zapiszObjectZPliku(Wypozyczalnia wyp) throws FileNotFoundException, IOException {
		List<Book> bbb = wyp.bibioteka;

		ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("BookData" + ".ser"));
		for (Book b : wyp.bibioteka) {
			objectOutputStream.writeObject(b);
		}
		objectOutputStream.close();
	}

	public static void czytajObjectZPliku(String nazwaPliku)
			throws FileNotFoundException, IOException, ClassNotFoundException {
		List<Book> newList = new ArrayList<>();
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nazwaPliku));
			while (true) {
				Book b = (Book) ois.readObject();
				newList.add(b);
				System.out.println(b.toString());
			}
		} catch (EOFException eof) {
			System.out.println("Reached end of file");
		} catch (IOException | ClassNotFoundException ex) {
			ex.printStackTrace();
		}

	}

}
