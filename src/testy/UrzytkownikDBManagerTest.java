package testy;

import static org.junit.Assert.*;



import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;

import pozyczak.Uzytkownik;

import services.UrzytkownikDBManager;

public class UrzytkownikDBManagerTest {

	private static UrzytkownikDBManager uman1;
	private static Uzytkownik u1,u2,u3;
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		 uman1 = new UrzytkownikDBManager();
		 u1= new Uzytkownik("Wiktor", "Korczens");
		 u2= new Uzytkownik("Roman", "Amber");
		 u3= new Uzytkownik("Emilia", "Kindziuk");
		 
	}

	@After
	public void tearDown() throws Exception {
		uman1.UsunWszystkichUrzytkownikow();
	}
		
	@Test
	public void testUrzytkownikDBManager() {
		assertNotNull(uman1);
		
		

	}

	@Test
	public void testDodajUrzytkownik() {
		uman1.UsunWszystkichUrzytkownikow();
		uman1.DodajUrzytkownik(u1);		
		uman1.DodajUrzytkownik(u2);
		assertEquals(2, uman1.PobierzUrzytkownikow().size());
		assertSame("Wiktor",u1.getImie());
		assertSame("Amber",u2.getNazwisko());
		Uzytkownik u4 = new Uzytkownik("Mariusz","Puchalke");
		uman1.DodajUrzytkownik(u4);
		assertEquals(3, uman1.PobierzUrzytkownikow().size());
		assertSame("Puchalke",u4.getNazwisko());
		
		
		
	}

	@Test
	public void testPobierzUrzytkownikow() {
		uman1.UsunWszystkichUrzytkownikow();
		uman1.DodajUrzytkownik(u1);
		uman1.DodajUrzytkownik(u3);
		uman1.DodajUrzytkownik(u2);
		
		assertEquals(3, uman1.PobierzUrzytkownikow().size());
		Uzytkownik u4 = new Uzytkownik("Mariusz","Puchalke");
		uman1.DodajUrzytkownik(u4);
		
		assertEquals(4, uman1.PobierzUrzytkownikow().size());
	}

	
	
	
	@Test
	public void testZnajdzUrzytkownik() {
		fail("Not yet implemented");
	}

	
	
	@Test
	public void testUsunUrzytkownik() {
		fail("Not yet implemented");
	}

	@Test
	public void testUsunWszystkichUrzytkownikow() {
		fail("Not yet implemented");
	}

}
