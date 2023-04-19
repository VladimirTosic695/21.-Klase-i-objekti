package klasa1;

import java.util.Scanner;

public class PokretackaKlasa {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		Cat obj = new Cat();
		
		System.out.println("Unesite ime macke");
		obj.ime = sc.nextLine();
		
		obj.prikazatiIme();
		sc.close();
		

	}

}
