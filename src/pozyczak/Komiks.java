package pozyczak;

public class Komiks {
	private static int maxId=0;
	private int KomiksId;
	public String Tytul, Autor;

	public Komiks(String tytul, String autor) {
		super();
		this.Tytul = tytul;
		this.Autor= autor;				
		this.KomiksId=maxId++;
	}
	
	void WypiszKomiks(){
		System.out.println("ID Komiksu: "+KomiksId+", Tytul: "+Tytul+" , Autor: "+Autor);
	}

	public int getKomiksId() {
		return KomiksId;
	}

	public String getTytul() {
		return Tytul;
	}

	public void setTytul(String tytul) {
		Tytul = tytul;
	}

	public String getAutor() {
		return Autor;
	}

	public void setAutor(String autor) {
		Autor = autor;
	}

	



}
