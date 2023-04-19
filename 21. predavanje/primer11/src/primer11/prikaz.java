package primer11;

import java.util.Scanner;

public class prikaz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Unesite ime knjige.");
		String ime = sc.nextLine();
		System.out.println("Unesite broj strana knjige.");
		int Strane = sc.nextInt();
		
		Knjiga knj = new Knjiga(ime, Strane);
		
		knj.prikaz();
		sc.close();

	}

}
