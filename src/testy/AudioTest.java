package testy;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import pozyczak.Audio;

public class AudioTest {

	private static Audio a1,a2;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		a1= new Audio("Fragile", "NIN");
		a2= new Audio("Aftershock","Aphrodite");
				
		
	}

	@Test
	public void testAudio() {
		Audio a3= new Audio("Hello Nasty", "Beastie Boys");
		assertNotNull(a3);
		assertNotSame(a1,a3);
		assertFalse(a3.getAudioId()==0);
		assertFalse(a3.getWykonawca()=="NIN");
		assertFalse(a3.getTytul()=="Aphrodite");
	}

	@Test
	public void testSetTytul() {
		a1.setTytul("Aftershock");
		assertFalse(a1.Tytul=="Fragile");
		assertTrue(a1.Tytul==a2.Tytul);
		assertEquals("Aftershock",a1.Tytul);
	
		
	}

	@Test
	public void testSetWykonawca() {
		a2.setWykonawca(a1.Wykonawca);	
		assertFalse(a2.Wykonawca=="Beastie Boys");
		assertTrue(a2.Wykonawca==a1.Wykonawca);
		assertEquals("NIN",a2.Wykonawca);
		
	}

}
