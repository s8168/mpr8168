package testy;

import static org.junit.Assert.*;

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
		 u3= new Uzytkownik("Olaf", "Jazdza");
	}

	@Test
	public void testUrzytkownikDBManager() {
		assertNotNull(uman1);
		u1= new Uzytkownik("Wiktor", "Korczens");
		u2= new Uzytkownik("Roman", "Amber");
		u3= new Uzytkownik("Olaf", "Jazdza");

	}

	@Test
	public void testDodajUrzytkownik() {
		uman1.DodajUrzytkownik(u1);
		uman1.DodajUrzytkownik(u3);
		uman1.DodajUrzytkownik(u2);
        AssertEqals(3,uman1.)
	}

	@Test
	public void testPobierzOsoby() {
		fail("Not yet implemented");
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
