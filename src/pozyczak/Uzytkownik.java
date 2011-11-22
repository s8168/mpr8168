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

	
	int SzukajGra(String nazwa){
		int v =0;		
		for(Gra graa : gry)
			if(graa.getTytul()==nazwa){
			v=gry.indexOf(graa);
				break;			
			}
		return v;
			}
		
	
	int SzukajGra(int ajdi){
		int x =0;
		for(Gra ga : gry)
			if(ga.getGraId()==ajdi){
				x=gry.indexOf(ga);
				break;
			}
		return x;
	}
					
	
	public void UsunGre(String tyt){
		gry.remove(SzukajGra(tyt));
	}
	
	public void UsunGre(int z){
			gry.remove(SzukajGra(z));
			}
		
	public void EdytujGre(int pozycja, String nowytytul, String nowaplatforma) {
		int w=SzukajGra(pozycja);
		gry.get(w).Tytul=nowytytul;
		gry.get(w).Platforma=nowaplatforma;
			}
			
	public void EdytujGre(String nazwagry, String nowytytul, String nowaplatforma) {
		int w=SzukajGra(nazwagry);
		gry.get(w).Tytul=nowytytul;
		gry.get(w).Platforma=nowaplatforma;
			}
	
	
/*--------------------------------AUDIO----------------------------------------------------------------------*/	

	public void DodajAudio(Audio plyta) {
		audio.add(plyta);
		}

	public	void CzyscAudio(){
		audio.clear();
		}

	int SzukajAudio(int id){
		int w =0;
		for(Audio muzka : audio)
			if(muzka.getAudioId()==id){
				w=audio.indexOf(muzka);
					break;
			}
		return w;
	}
	
	int SzukajAudio(String tytu){
		int p =0;
		for (Audio nutka : audio)
			if(nutka.getTytul()==tytu){
				p=audio.indexOf(nutka);
				break;
			}
		return p;
	}
	
	public void UsunAudio(int j) {
		audio.remove(SzukajAudio(j));
		
	}
	
	public void UsunAudio (String album) {
		audio.remove(SzukajAudio(album));
		
	}

	public void EdytujAudio(int pozycja, String nowytytul, String nowywykonawca) {
		int w=SzukajAudio(pozycja);
		audio.get(w).Tytul=nowytytul;
		audio.get(w).Wykonawca=nowywykonawca;
			}
			
	public void EdytujAudio(String nazwaalbumu, String nowytytul, String nowywykonwaca) {
		int w=SzukajAudio(nazwaalbumu);
		audio.get(w).Tytul=nowytytul;
		audio.get(w).Wykonawca=nowywykonwaca;
			}
	
/*----------------------------------KOMIKS-------------------------------------------------------------------*/	
	
	
	public void DodajKomiks(Komiks zeszyt) {
		komiks.add(zeszyt);
		}

	public	void CzyscKomiks(){
		komiks.clear();
		}

	int SzukajKomiks(int l){
		int u=0;
		for(Komiks alb : komiks)
			if(alb.getKomiksId()==l){
				u=komiks.indexOf(alb);
			}
		return u;
	}	
		
	int SzukajKomiks (String ttt){
		int q = 0;
		for(Komiks tt : komiks)
			if(tt.getTytul()==ttt){
				q=komiks.indexOf(tt);
			}
		return q;
	}
	
	public void UsunKomiks(int dd) {
		komiks.remove(SzukajKomiks(dd));
		
	}
public void UsunKomiks(String ddd) {
	komiks.remove(SzukajKomiks(ddd));
	
}

public void EdytujKomiks(int pozycja, String nowytytul, String nowyautor) {
	int w=SzukajKomiks(pozycja);
	komiks.get(w).Tytul=nowytytul;
	komiks.get(w).Autor=nowyautor;
		}
		
public void EdytujKomiks(String nazwakomiksu, String nowytytul, String nowyautor ){
	int w=SzukajKomiks(nazwakomiksu);
	komiks.get(w).Tytul=nowytytul;
	komiks.get(w).Autor=nowyautor;
		}

}
	
	

