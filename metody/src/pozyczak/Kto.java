package pozyczak;

import java.util.ArrayList;
import java.util.List;


public class Kto {
	
	String Imie,Nazwisko,Ksywa;
	int Telfon;	
	
	public List<Gra> gry = new ArrayList<Gra>();
	public List<Audio> audio = new ArrayList<Audio>();
	public List<Komiks> komiks = new ArrayList<Komiks>();
	
	Kto(String imie,String nazwisko,String ksywa, int telefon){
		
		this.Imie=imie;
		this.Nazwisko=nazwisko;
		this.Ksywa=ksywa;
		this.Telfon=telefon;
		this.gry=new ArrayList<Gra>();
		this.audio=new ArrayList<Audio>();
		this.komiks=new ArrayList<Komiks>();
		
	}
	
	
	
	public void WypiszKto(){
		System.out.println("Dane personalne to: Imiê: " + this.Imie + ", Nazwisko: " + this.Nazwisko+
				", Ksywa: "+this.Ksywa+", Telefon: "+this.Telfon);
		
		System.out.println("------------------------------------------------------------");
	}


	public void WypiszGry(){
		for(Gra c : gry ) 
				c.WypiszGre();
		System.out.println("------------------------------------------------------------");
		
	}
	public void WypiszAudio(){
		for(Audio a : audio ) 
			a.WypiszAudio();
		System.out.println("------------------------------------------------------------");
				
	}
	
	public void WypiszKomiks(){
		for(Komiks k : komiks ) 
			k.WypiszKomiks();
		System.out.println("------------------------------------------------------------");
				
	}	
	
	
	public void DodajGre(Gra gra) {
		gry.add(gra);
		}

	public	void CzyscGry(){
		gry.clear();
		}

	public void UsunGre(int x){
		x=0;
		for(Gra g : gry){
			if(g.getGraId()==x){
				gry.remove(x);
				break;
			}
			x++;
		}
		
	}

	
	
	public void DodajAudio(Audio plyta) {
		audio.add(plyta);
		}

	public	void CzyscAudio(){
		audio.clear();
		}

	public void UsunAudio(int y){
		for(Audio u : audio){
			if(u.getAudioId()==y){
				audio.remove(y);
				break;
			}
			y++;
		}
		audio.remove(y);
		}
	
	
	
	public void DodajKomiks(Komiks zeszyt) {
		komiks.add(zeszyt);
		}

	public	void CzyscKomiks(){
		komiks.clear();
		}

	public void UsunKomiks(int z){
		for(Komiks o : komiks){
			if(o.getKomiksId()==z){
				komiks.remove(z);
				break;
			}
			z++;
		}
		
		komiks.remove(z);
		}
		
	
}
	
	

