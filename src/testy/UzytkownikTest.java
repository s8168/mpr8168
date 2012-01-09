package testy;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;


import pozyczak.Gra;
import pozyczak.Uzytkownik;

public class UzytkownikTest {
	
	private static Uzytkownik p;
	
	private static Gra g1;
	private static Gra g2;
	private static Gra g3; 
	
	private static List<Gra> gierki;

	
	private void nl() {
		System.out.print("\n***************************************************************");
		
	}

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		p= new Uzytkownik("Marian", "Rasta", "Rastamarian", 7777777 );
		
		g1 = new Gra("LIMBO", "PC");
		g2 = new Gra("DOOM", "PC");
		g3 = new Gra("Wipeout", "PSX");
		
		gierki = new ArrayList<Gra>();
		
		
	}
	

	@Test
	public void testUzytkownik() {
		assertNotNull(p);
		assertEquals("Marian", p.getImie());
		assertEquals("Rasta", p.getNazwisko());
		assertEquals("Rastamarian", p.getKsywa());
		assertEquals(7777777, p.getTelfon());
		
	}
	
	@Test
	public void testCzyscGry() {
		p.DodajGre(g1);
		p.DodajGre(g2);
		p.WypiszGry();
		nl();
		p.CzyscGry();
		p.WypiszGry();
		assertEquals(p.gry.size(),0);

	}
	@Test
	public void testDodajGre() {
		p.DodajGre(g1);		
		assertNotNull(p.gry);
		assertEquals("LIMBO", p.gry.get(0).getTytul());
		assertEquals("PC", p.gry.get(0).getPlatforma());
		assertEquals(0, p.gry.get(0).getGraId());
		p.CzyscGry();
		
	}

	
		
	

	@Test
	public void testSzukajGraString() {
		p.DodajGre(g2);
		p.WypiszGry();
		Gra x=p.SzukajGra("DOOM");
		assertNotNull(x);
		assertEquals("DOOM",p.gry.get(0).getTytul());
		assertEquals("PC", p.gry.get(0).getPlatforma());
		assertEquals(1,p.gry.get(0).getGraId());
		assertSame(p.gry.get(0),x);
		assertNull(p.SzukajGra("DOOM2"));
		p.CzyscGry();
	}

	@Test
	public void testSzukajGraInt() {
		p.DodajGre(g3);
		p.WypiszGry();
		Gra x=p.SzukajGra(2);
		assertNotNull(x);
		assertEquals("Wipeout",p.gry.get(0).getTytul());
		assertEquals("PSX", p.gry.get(0).getPlatforma());
		assertEquals(2,p.gry.get(0).getGraId());
		assertSame(p.gry.get(0),x);
		assertNull(p.SzukajGra(1));
		p.CzyscGry();
		
		
	}

	@Test
	public void testSzukajGier() {
	p.DodajGre(g2);
	p.DodajGre(g1);
	p.DodajGre(g3);
	gierki=p.SzukajGier("PC");
	assertNotNull(gierki);
	assertTrue(gierki.size()==2);
	assertNotSame(p.gry, gierki);
	assertEquals(p.gry.get(1).getGraId(),gierki.get(1).getGraId());
	assertEquals(p.gry.get(0).getGraId(),gierki.get(0).getGraId());
	assertEquals(gierki.get(1).getPlatforma(), "PC");
	assertEquals(gierki.get(0).getPlatforma(), "PC");
	assertEquals(gierki.get(1).getTytul(), "LIMBO");
	assertEquals(gierki.get(0).getTytul(), "DOOM");
	gierki.clear();
	p.CzyscGry();
		
	}
	
	@Test
	public void testUsunGry() {
		p.DodajGre(g1);
		p.DodajGre(g2);
		p.DodajGre(g3);
		p.UsunGry(p.SzukajGier("PC"));
		assertNotNull(p.gry);
		assertTrue(p.gry.size()==1);
		assertEquals(2, p.gry.get(0).getGraId());
		assertEquals("PSX", p.gry.get(0).getPlatforma());
		assertEquals("Wipeout", p.gry.get(0).getTytul());
		p.CzyscGry();
		
		
	}

	@Test
	public void testSetImie() {
		p.WypiszUzytkownika();
		p.setImie("Bob");
		assertNotSame("Bob", "Marian", p.Imie);
		assertFalse(p.Imie=="Marian");
		assertEquals("Bob", p.Imie);
		
	}

	@Test
	public void testSetNazwisko() {
		p.setNazwisko("Plissken");
		assertNotSame("Plissken", "Rasta", p.Nazwisko);
		assertFalse(p.Nazwisko=="Rasta");
		assertEquals("Plissken", p.Nazwisko);
		
		
	}

	@Test
	public void testSetKsywa() {
		p.setKsywa("Snake");
		assertNotSame("Snake", "Rastamarian", p.Ksywa);
		assertFalse(p.Ksywa=="Rastamarian");
		assertEquals("Snake", p.Ksywa);
	}

	@Test
	public void testSetTelfon() {
		p.setTelfon(666666);
		assertNotSame("666666", "7777777", p.Telfon);
		assertFalse(p.Telfon==7777777);
		assertEquals(666666, p.Telfon);
		
	}

	
}
