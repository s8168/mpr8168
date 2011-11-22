package pozyczak;



public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 
		
	Uzytkownik u1 = new Uzytkownik("Adam","Szczepinski","Ziben",777777777);
	Uzytkownik u2 = new Uzytkownik("Porucznik","Borewicz","Boras",997);
	
	u1.DodajGre(new Gra("Battlefield 3","PC"));
	u1.DodajGre(new Gra("Chrono Trigger","Snes"));
	u1.DodajGre(new Gra("REZ","Dreamcast"));
	u1.DodajGre(new Gra("Teenagent","PC"));

	u1.DodajKomiks(new Komiks("Osiedle Swoboda","Micha� Sledzinski"));
	u1.DodajKomiks(new Komiks("LOBO","Alan Grant, Simon Bisley"));
	u1.DodajKomiks(new Komiks("48 Stron","Robert Adler, Tobiasz Piatkowski"));
	
	u1.DodajAudio(new Audio("Adrenaline", "Deftones"));
	u1.DodajAudio(new Audio("Worship and Tribute", "Glassjaw"));
	u1.DodajAudio(new Audio("The Garden", "Zero7"));
	u1.DodajAudio(new Audio("Driving Insane", "Black Sun Empire"));
	u1.DodajAudio(new Audio("Disco Volante", "mr. Bungle"));
	
	
	u2.DodajKomiks(new Komiks("Street Fighter", "Ken Siu-Chong"));
	u2.DodajGre(new Gra("Virtua Cop 2", "Saturn"));
	u2.DodajAudio(new Audio("Panopticon","ISIS"));
	
	
	
	
	u1.WypiszUzytkownika();
	u1.WypiszGry();
	u1.WypiszKomiks();
	u1.WypiszAudio();
	
	System.out.println("\n\n\n");
	System.out.println("------------------------------------------------------------");
	u1.UsunGry(u1.SzukajGier("PC"));
	u1.WypiszGry();
	/*
	
	u1.UsunGre("Chrono Trigger");
	u1.WypiszGry();
	
	u1.UsunAudio("The Garden");
	u1.UsunAudio(4);
	u1.UsunGre(2);
	u1.UsunGre("REZ");
	u1.CzyscKomiks();
	

	u1.WypiszGry();
	u1.WypiszKomiks();
	u1.WypiszAudio();
	System.out.println("\n\n\n");
	System.out.println("------------------------------------------------------------");
	u1.EdytujGre(1,"Secret of Evermore","Snes");
	u1.EdytujGre("Teenagent","Stealth Bastard","PC");
	u1.WypiszGry();
*/
	}

}
