package pozyczak;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 
		
	Kto u1 = new Kto("Adam","Szczepinski","Ziben",777777777);
	Kto u2 = new Kto("Porucznik","Borewicz","Boras",997);
	
	u1.DodajGre(new Gra("Battlefield 3","PC"));
	u1.DodajGre(new Gra("Chrono Trigger","Snes"));
	u1.DodajKomiks(new Komiks("Osiedle Swoboda","Micha³ Sledzinski"));
	u1.DodajAudio(new Audio("Adrenaline", "Deftones"));
	u1.DodajAudio(new Audio("Worship and Tribute", "Glassjaw"));
	
	u2.DodajKomiks(new Komiks("Street Fighter", "Ken Siu-Chong"));
	u2.DodajGre(new Gra("Virtua Cop 2", "Saturn"));
	u2.DodajAudio(new Audio("Panopticon","ISIS"));
		
	u1.WypiszKto();
	u1.WypiszAudio();
	u1.WypiszGry();
	u1.WypiszKomiks();
	
	System.out.println("\n\n");	
	
	u2.WypiszKto();
	u2.WypiszAudio();
	u2.WypiszGry();
	u2.WypiszKomiks();
		
	System.out.println("\n\n");	
	
	
	u1.UsunGre(0);
	
	u1.WypiszGry();
	System.out.println("\n\n");	
	u1.DodajGre(new Gra("Battlefield 3","PC"));
	u1.WypiszGry();
	
	}

}
