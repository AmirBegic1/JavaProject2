package takmicenjeKarate;

import java.util.Scanner;
import java.util.Vector;

public class Kategorija {
	
	Scanner ulaz = new Scanner(System.in);
	private Integer godiste;
	private enum Spol{
		Muski,
		Zenski
	}
	
	private Spol spol;
	
	public int getGodiste() {
		return godiste;
	}
	public void setGodiste(Integer godiste) {
		this.godiste = godiste;
	}
	
	public Kategorija(Integer godiste) {
		super();
		this.godiste = godiste;
		this.spol = spol;
	}
	public Kategorija() {
		super();
		
	}
	
	public void setSpol(Spol spol) {
		this.spol = spol;
	}
	
	public Spol getSpol() {
		return spol;
	}
	
	public String getSpolString(Spol s) {
		switch(s) {
		case Muski:
			return "Musko";
		case Zenski:
			return "Zensko";
			default:
				return "Nema spola";
		}
	}
	
	public Spol getSpolEnum(int i) {
		switch(i) {
		case 1: 
			return Spol.Muski;
		case 2:
			return Spol.Zenski;
		default:
			return Spol.Muski;
		}
		
	}
	
	public void unosGodiste() {
		System.out.println("Unesite godiste: ");
		Integer i = ulaz.nextInt();
		this.setGodiste(i);
	}
	
	
	int izbor;
	public void UnosKategorije() {
		System.out.println("Unesite kategoriju i spol");
		int tempGodiste;
		tempGodiste = ulaz.nextInt();
		this.godiste= tempGodiste;
		
		
		do { 
			
		 System.out.println("Unesite spol");
		 System.out.println("1. Musko");
		 System.out.println("2. Zensko");
		 izbor = ulaz.nextInt();
		}while(izbor<1 || izbor > 2);
		this.spol = getSpolEnum(izbor);
		
	}
	
	public void ispisKategorije() {
		System.out.println(this.godiste + " " + this.getSpolString(this.spol));
	}
	
}
