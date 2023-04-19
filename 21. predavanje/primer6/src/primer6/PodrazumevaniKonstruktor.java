package primer6;

public class PodrazumevaniKonstruktor {

	public static void main(String[] args) {
		
		Box b1 = new Box ();
		Box b2 = new Box ();
		
		b1.initBox(10,15,20);
		b2.initBox(5,6,7);
		
		System.out.println("Zapremina kutije je "+b1.volume());
		System.out.println("Zapremina kutije je "+b2.volume());

	}

}
