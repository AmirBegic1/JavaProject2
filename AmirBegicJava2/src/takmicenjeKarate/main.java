package takmicenjeKarate;

import java.util.Scanner;
import java.util.Vector;


import takmicenjeKarate.Takmicar;
import takmicenjeKarate.Kategorija;



public class main {
	static Scanner ulaz = new Scanner(System.in);
	public static Vector<Takmicar> takmicari = new Vector<>();
	
	
	public static int meni() {
		System.out.println("1. Unos takmicara");
		System.out.println("2. Ispis takmicara");
		System.out.println("3. Pretraga po klubu");
		System.out.println("4. Generisi parove za kategoriju");
		System.out.println("5. Kraj");
		
		
		
		int odabir;
		do {
			odabir = ulaz.nextInt();
			
		}while(odabir <1 || odabir > 5);
		ulaz.nextLine();
		return odabir;
	}
	
	
	
	public static void main(String[] args) {
		int izbor;
		do {
			izbor = meni();
			
			switch(izbor) {
			case 1:
				System.out.println("Unos takmicara!");
				Takmicar temp = new Takmicar();
				temp.unosTakmicar();
				Kategorija tempic = new Kategorija();
				tempic.UnosKategorije();
				break;
			case 2:
				System.out.println("Ispis svih takmicara: ");
				Takmicar temp2 = new Takmicar();
				temp2.ispisTakmicar();
				
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			
			}
			
			
			
		}while(izbor != 5);

	}

}
