package primer11;

public class Knjiga {

	//Kreirati klasu Knjiga. Knjia ima podatke: Ime, brojStrana
	
	String ime;
	int brojStrana;
	
	Knjiga(String IME,int b){
		this.ime = IME;
		this.brojStrana = b;
	}
	
	public void prikaz() {
		System.out.println("Knjiga "+ this.ime +" ima "+ this.brojStrana +" strana.");
	}
}
