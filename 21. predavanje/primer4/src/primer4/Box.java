package primer4;

public class Box {

	double width, height, depth;

}

//Java podržava sledeće nivoe pristupa članovima klase (promenljivama i metodama):
//private, protected, public, i ukoliko se ne zada, package.

// Private: - Najrestriktivniji nivo pristupa. 
//Privatnom članu mogu da pristupe samo ostali članovi klase u kojoj je on definisan. 
//- Članovi izvedene klase ne mogu da mu pristupe. Privatni članovi deklarišu 
//se ključnom reči private.

//Protected: - Zaštićenim članovima mogu da pristupaju članovi klase u kojoj je definisa,
//članovi izvedenih klasa i sve klase unutar istog paketa. 
//- Zaštićeni članovi deklarišu se ključnom reči protected