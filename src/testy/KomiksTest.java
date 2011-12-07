package testy;
import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import pozyczak.Komiks;


public class KomiksTest {

	private static Komiks k1,k2;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		k1=new Komiks("Pokolenia", "Bizon");
		k2=new Komiks("Likwidator", "Ryszard Dabrowski");
		
	}

	@Test
	public void testKomiks() {
		Komiks k3= new Komiks("Wilq", "T&B Minkiewicz");
		
		assertNotNull(k3);
		assertNotSame(k2, k3);
		assertFalse(k3.getKomiksId()==1);
		assertFalse(k3.getAutor()=="Bizon");
		assertEquals("Wilq", k3.Tytul);
	}

	@Test
	public void testSetTytul() {
		k1.setTytul(k2.Tytul);
		assertFalse(k1.Tytul=="Pokolenia");
		assertTrue(k1.Tytul==k1.Tytul);
		assertEquals("Likwidator", k1.Tytul);
	}

	@Test
	public void testSetAutor() {
		k2.setAutor(k1.getAutor());
		assertFalse(k2.Autor=="Ryszard Dabrowski");
		assertTrue(k2.Autor==k1.Autor);
		assertEquals("Bizon", k2.Autor);
		
	}

}
