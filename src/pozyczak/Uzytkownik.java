package pozyczak;

import java.util.ArrayList;
import java.util.List;




public class Uzytkownik {
	
	public String Imie,Nazwisko,Ksywa;
	public int Telfon;	
	
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
		System.out.println("Dane personalne to: Imie: " + this.Imie + ", Nazwisko: " + this.Nazwisko+
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

	
	public Gra SzukajGra(String tytul){ //
		for (Gra graa : gry)
			if(graa.Tytul==tytul) {
				return graa;
			}
		return null;
	}
	
	
	
	public Gra SzukajGra(int ajdi){
		for (Gra graa : gry)
			if(graa.getGraId()==ajdi){
				return graa;
			}
		return null;
	}
				
	
	public List<Gra> SzukajGier (String platforma){  //
		List<Gra> gierki = new ArrayList<Gra>();
		for (Gra gra : gry)
			if(gra.Platforma==(platforma)){
				gierki.add(gra);
			}
			return gierki;	
		
	}
	
	public void UsunGry(List<Gra> listagier){ //
		gry.removeAll(listagier);
	}
	

/*--------------------------------AUDIO----------------------------------------------------------------------*/	

	public void DodajAudio(Audio plyta) {
		audio.add(plyta);
		}

	public	void CzyscAudio(){
		audio.clear();
		}

	Audio SzukajAudio(int id){
		for(Audio muzka : audio)
			if(muzka.getAudioId()==id){
					return muzka;
			}
		return null;
	}
	
	Audio SzukajAudio(String tytu){
			for (Audio nutka : audio)
			if(nutka.Tytul==tytu){
				return nutka;
				
			}
		return null;
	}
	
	
	List<Audio> SzukajPlyt (String wykonawca){
		List<Audio> plytki = new ArrayList<Audio>();
		for (Audio f : audio)
			if(f.Wykonawca==wykonawca){
				plytki.add(f);
			}
			return plytki;	
		
	}
	
	void UsunPlytki(List<Audio> listaplyt){
		 audio.removeAll(listaplyt);
	
	
	}
	

/*----------------------------------KOMIKS-------------------------------------------------------------------*/	
	
	
	public void DodajKomiks(Komiks zeszyt) {
		komiks.add(zeszyt);
		}

	public	void CzyscKomiks(){
		komiks.clear();
		}

	Komiks SzukajKomiks(int l){
		for(Komiks alb : komiks)
			if(alb.getKomiksId()==l){
				return alb;
			}
		return null;
	}	
		
	Komiks SzukajKomiks (String l){
		for(Komiks alb : komiks)
			if(alb.Tytul==l){
				return alb;
			}
		return null;
	}
	
	List<Komiks> SzukajKomiksow(String autor){
		List<Komiks> komixy = new ArrayList<Komiks>();
		for (Komiks kk : komixy)
			if(kk.Autor==autor){
				komixy.add(kk);
			}
			return komixy;	
		
	}
	
	void UsunKomiksy(List<Komiks> listakomiksow){
		 for (Komiks kkk : listakomiksow)
			komiks.remove(kkk);
	}


	public String getImie() {
		return Imie;
	}


	public void setImie(String imie) {
		Imie = imie;
	}


	public String getNazwisko() {
		return Nazwisko;
	}


	public void setNazwisko(String nazwisko) {
		Nazwisko = nazwisko;
	}


	public String getKsywa() {
		return Ksywa;
	}


	public void setKsywa(String ksywa) {
		Ksywa = ksywa;
	}


	public int getTelfon() {
		return Telfon;
	}


	public void setTelfon(int telfon) {
		Telfon = telfon;
	}
	
	

}
	
	

