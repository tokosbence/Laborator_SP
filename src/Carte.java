import java.util.ArrayList;

public class Carte {
	String titlu;
	ArrayList<String> continut = new ArrayList<String>();
	ArrayList<Autor> autori = new ArrayList<Autor>();
	
	public Carte() {
		
	}

	public Carte(String titlu, ArrayList<String> continut, ArrayList<Autor> autori) {
		super();
		this.titlu = titlu;
		this.continut = continut;
		this.autori = autori;
	}

	public String getTitlu() {
		return titlu;
	}

	public void setTitlu(String titlu) {
		this.titlu = titlu;
	}

	public ArrayList<String> getContinut() {
		return continut;
	}

	public void setContinut(ArrayList<String> continut) {
		this.continut = continut;
	}

	public ArrayList<Autor> getAutori() {
		return autori;
	}

	public void setAutori(ArrayList<Autor> autori) {
		this.autori = autori;
	}

	
	
	
	
}
