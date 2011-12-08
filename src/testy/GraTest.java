package testy;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;


import pozyczak.Gra;

public class GraTest {

	private static Gra g1,g2;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
			
		g1=new Gra("BattleToads", "NES");
			g2=new Gra("Okami", "PS2");
				
		
	}

	@Test
	public void testGra() {
		Gra g3=new Gra("Fallout", "PC");
		assertNotNull(g3);
		assertNotSame(g1, g3);
		assertFalse(g3.getGraId()==1);
		assertFalse(g3.getPlatforma()=="NES");
		assertFalse(g3.getTytul()=="Okami");
		
		
	}

	@Test
	public void testSetTytul() {
		
		g1.setTytul(g2.Tytul);
		assertFalse(g1.Tytul=="Battletoads");
		assertTrue(g1.Tytul==g2.Tytul);
		assertEquals("Okami", g1.Tytul);
	
			
	}

	@Test
	public void testSetPlatforma() {
		g2.setPlatforma(g1.Platforma);
		assertFalse(g2.Platforma=="PS2");
		assertTrue(g2.Tytul==g1.Tytul);
		assertEquals("NES", g2.Platforma);
		
		
		g1=null;
		g2=null;
	}

}
