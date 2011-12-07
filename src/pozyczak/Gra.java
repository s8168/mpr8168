package pozyczak;



public class Gra {
	private static int maxId=0;
	private int GraId;
	
 public String Tytul, Platforma;
 
	

	public  Gra(String tytul, String platforma){
		this.Tytul=tytul;
		this.Platforma=platforma;
		this.GraId=maxId++;
	}

	

	void WypiszGre(){
		System.out.println("ID Gry:"+GraId+", Tytul: "+Tytul+" , Platforma: "+Platforma);
	}


	public int getGraId() {
		return GraId;
	}


	public String getTytul() {
		return Tytul;
	}


	public void setTytul(String tytul) {
		this.Tytul = tytul;
	}



	public String getPlatforma() {
		return Platforma;
	}


	public void setPlatforma(String platforma) {
		Platforma = platforma;
	}

}
