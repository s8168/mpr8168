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

	u1.DodajKomiks(new Komiks("Osiedle Swoboda","Michal Sledzinski"));
	u1.DodajKomiks(new Komiks("LOBO","Alan Grant, Simon Bisley"));
	u1.DodajKomiks(new Komiks("48 Stron","Robert Adler, Tobiasz Piatkowski"));
	
	u1.DodajAudio(new Audio("Adrenaline", "Deftones"));
	u1.DodajAudio(new Audio("Worship and Tribute", "Glassjaw"));
	u1.DodajAudio(new Audio("The Garden", "Zero7"));
	u1.DodajAudio(new Audio("Driving Insane", "Black Sun Empire"));
	u1.DodajAudio(new Audio("Disco Volante", "mr. Bungle"));
	
	
	
	
	u2.DodajKomiks(new Komiks("Street Fighter", "Ken Siu-Chong"));
	
	u2.DodajGre(new Gra("Virtua Cop 2", "Saturn"));
	u2.DodajGre(new Gra("Fallout: New Vegas","PC"));
	u2.DodajGre(new Gra("Portal 2","PC"));
	
	u2.DodajAudio(new Audio("Panopticon","ISIS"));
	
	
	
	
	
	u1.WypiszUzytkownika();
	u1.WypiszGry();
	u1.WypiszKomiks();
	u1.WypiszAudio();
	
	System.out.println("\n");
	System.out.println("------------------------------------------------------------");
		

	u1.WypiszUzytkownika();
	u1.SzukajGra("Chrono Trigger").setPlatforma("PC");
	u1.WypiszGry();
	u1.UsunGry(u1.SzukajGier("PC"));
	u1.WypiszGry();
	
	u1.WypiszKomiks();
	u1.CzyscKomiks();
	u1.WypiszKomiks();
	
	u1.audio.remove(u1.SzukajAudio(3));
	u1.DodajAudio(new Audio("Driving Insane", "Black Sun Empire"));
	u2.WypiszAudio();
	u1.WypiszAudio();
	
	}

}
