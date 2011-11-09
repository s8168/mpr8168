package pozyczak;

public class Audio {
	private static int maxId=0;
	private int AudioId;
	public String Tytul, Wykonawca;

	public Audio(String tytul, String wykonawca) {
		super();
		this.Tytul = tytul;
		this.Wykonawca = wykonawca;
		this.AudioId=maxId++;
	}
	
	void WypiszAudio(){
		System.out.println("ID Plyty:"+AudioId+". Tytul: " +Tytul+" , Wykonawca: "+Wykonawca);
	}

	public int getAudioId() {
		return AudioId;
	}

	public String getTytul() {
		return Tytul;
	}

}
