import java.util.ArrayList;

public class Subcapitol {
	Integer numarulsubcap;
	String titlu;
	ArrayList<Imagine> imagini = new ArrayList<Imagine>();
	ArrayList<Tabel> tabele = new ArrayList<Tabel>();
	ArrayList<Paragraf> paragrafe = new ArrayList<Paragraf>();
	
	public Subcapitol() {
		
	}

	public Subcapitol(Integer numarulsubcap, String titlu, ArrayList<Imagine> imagini, ArrayList<Tabel> tabele,
			ArrayList<Paragraf> paragrafe) {
		super();
		this.numarulsubcap = numarulsubcap;
		this.titlu = titlu;
		this.imagini = imagini;
		this.tabele = tabele;
		this.paragrafe = paragrafe;
	}

	public Integer getNumarulsubcap() {
		return numarulsubcap;
	}

	public void setNumarulsubcap(Integer numarulsubcap) {
		this.numarulsubcap = numarulsubcap;
	}

	public String getTitlu() {
		return titlu;
	}

	public void setTitlu(String titlu) {
		this.titlu = titlu;
	}

	public ArrayList<Imagine> getImagini() {
		return imagini;
	}

	public void setImagini(ArrayList<Imagine> imagini) {
		this.imagini = imagini;
	}

	public ArrayList<Tabel> getTabele() {
		return tabele;
	}

	public void setTabele(ArrayList<Tabel> tabele) {
		this.tabele = tabele;
	}

	public ArrayList<Paragraf> getParagrafe() {
		return paragrafe;
	}

	public void setParagrafe(ArrayList<Paragraf> paragrafe) {
		this.paragrafe = paragrafe;
	}
	
	
}
