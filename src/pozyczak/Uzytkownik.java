package pozyczak;

import java.util.ArrayList;
import java.util.List;


public class Uzytkownik {
	
	String Imie,Nazwisko,Ksywa;
	int Telfon;	
	
	public List<Gra> gry = new ArrayList<Gra>();
	public List<Audio> audio = new ArrayList<Audio>();
	public List<Komiks> komiks = new ArrayList<Komiks>();
	
	public Uzytkownik(String imie,String nazwisko,String ksywa, int telefon){
		
		this.Imie=imie;
		this.Nazwisko=nazwisko;
		this.Ksywa=ksywa;
		this.Telfon=telefon;
		this.gry=new ArrayList<Gra>();
		this.audio=new ArrayList<Audio>();
		this.komiks=new ArrayList<Komiks>();
		
	}
	
	
/*--------------------------------------Wypisz---------------------------------------------------------------*/	
	
	public void WypiszUzytkownika(){
		System.out.println("Dane personalne to: Imi�: " + this.Imie + ", Nazwisko: " + this.Nazwisko+
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
	

/*---------------------------GRY----------------------------------------------------------------------------------------*/	

	public void DodajGre(Gra gra) {
		gry.add(gra);
		}

	public	void CzyscGry(){
		gry.clear();
		}

	
	public Gra SzukajGra(String tytul){
		Gra v= new Gra("","");
		for (Gra graa : gry)
			if(graa.getTytul()==tytul) {
				v=graa;
				break;}
		return v;
	}
	
	
	
	Gra SzukajGra(int ajdi){
		Gra v= new Gra("","");
		for (Gra graa : gry)
			if(graa.getGraId()==ajdi){
				v=graa;
				break;}
		return v;
	}
					
	
	public void UsunGre(String tyt){
		gry.remove(SzukajGra(tyt));
	}
	
	public void UsunGre(int z){
			gry.remove(SzukajGra(z));
			}
		

	public void EdytujGre(int idgry,String NowyTytul, String NowaPlatforma) {
		SzukajGra(idgry).Tytul=NowyTytul;
		SzukajGra(idgry).Platforma=NowaPlatforma;
		
		
	}
			
	public void EdytujGre(String StaryTytul,String NowyTytul, String NowaPlatforma) {
		SzukajGra(StaryTytul).Tytul=NowyTytul;
		SzukajGra(StaryTytul).Platforma=NowaPlatforma;
		
	}
	
/*--------------------------------AUDIO----------------------------------------------------------------------*/	

	public void DodajAudio(Audio plyta) {
		audio.add(plyta);
		}

	public	void CzyscAudio(){
		audio.clear();
		}

	Audio SzukajAudio(int id){
		Audio a = new Audio("", "");
		for(Audio muzka : audio)
			if(muzka.getAudioId()==id){
				a=muzka;
					break;
			}
		return a;
	}
	
	Audio SzukajAudio(String tytu){
		Audio a = new Audio("", "");
		for (Audio nutka : audio)
			if(nutka.getTytul()==tytu){
				a= nutka;
				break;
			}
		return a;
	}
	
	public void UsunAudio(int j) {
		audio.remove(SzukajAudio(j));
		
	}
	
	public void UsunAudio (String album) {
		audio.remove(SzukajAudio(album));
		
	}

	public void EdytujAudio(int pozycja, String nowytytul, String nowywykonawca) {
		SzukajAudio(pozycja).Tytul=nowytytul;
		SzukajAudio(pozycja).Wykonawca=nowywykonawca;
			}
			
	public void EdytujAudio(String nazwaalbumu, String nowytytul, String nowywykonwaca) {
		SzukajAudio(nazwaalbumu).Tytul=nowytytul;
		SzukajAudio(nazwaalbumu).Wykonawca=nowywykonwaca;
			}
	
/*----------------------------------KOMIKS-------------------------------------------------------------------*/	
	
	
	public void DodajKomiks(Komiks zeszyt) {
		komiks.add(zeszyt);
		}

	public	void CzyscKomiks(){
		komiks.clear();
		}

	Komiks SzukajKomiks(int l){
		Komiks u = new Komiks("", "");
		for(Komiks alb : komiks)
			if(alb.getKomiksId()==l){
				u=alb;
			}
		return u;
	}	
		
	Komiks SzukajKomiks (String l){
		Komiks u = new Komiks("", "");
		for(Komiks alb : komiks)
			if(alb.getTytul()==l){
				u=alb;
			}
		return u;
	}
	
	public void UsunKomiks(int dd) {
		komiks.remove(SzukajKomiks(dd));
		
	}
public void UsunKomiks(String ddd) {
	komiks.remove(SzukajKomiks(ddd));
	
}

public void EdytujKomiks(int pozycja, String nowytytul, String nowyautor) {
	SzukajKomiks(pozycja).Tytul=nowytytul;
	SzukajKomiks(pozycja).Autor=nowyautor;
}
		
public void EdytujKomiks(String nazwakomiksu, String nowytytul, String nowyautor ){
	SzukajKomiks(nazwakomiksu).Tytul=nowytytul;
	SzukajKomiks(nazwakomiksu).Autor=nowyautor;
		}

}
	
	

