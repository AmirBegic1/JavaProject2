package takmicenjeKarate;

import java.util.Scanner;
import java.util.Vector;
import takmicenjeKarate.Kategorija;


public class Takmicar {
	private String ime,prezime,klub;
	Kategorija kategorija;
	
	Scanner ulaz = new Scanner(System.in);
	
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getPrezime() {
		return prezime;
	}
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	public String getKlub() {
		return klub;
	}
	public void setKlub(String klub) {
		this.klub = klub;
	}
	public Kategorija getKategorija() {
		return kategorija;
	}
	public void setKategorija(Kategorija kategorija) {
		this.kategorija = kategorija;
	}
	
	public void unosIme() {
		System.out.println("Unesite ime: ");
		String i = ulaz.nextLine();
		this.setIme(i);
		
	}
	
	public void unosPrezime() {
		System.out.println("Unesite prezime: ");
		String p = ulaz.nextLine();
		this.setPrezime(p);
		
	}
	
	public void unosKlub() {
		System.out.println("Unesite klub: ");
		String k = ulaz.nextLine();
		this.setKlub(k);
	}
	
	
	public void unosTakmicar() {
		System.out.println("Unesi ime: ");
		this.ime = ulaz.nextLine();
		System.out.println("Unesi prezime: ");
		this.prezime = ulaz.nextLine();
		System.out.println("Unesite ime kluba: ");
		this.klub = ulaz.nextLine();
		
	}
	
	public void ispisTakmicar() {
		System.out.println("Takmicar: "+ this.ime + " " + this.prezime+ " " + this.klub);
	}
	
	
	
}
