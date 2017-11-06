import java.util.ArrayList;

public class Capitol {
	Integer numarulcap;
	String titlu;
	ArrayList<Subcapitol> subcapitoli = new ArrayList<Subcapitol>();
	
	public Capitol(){
		
	}

	public Capitol(Integer numarulcap, String titlu, ArrayList<Subcapitol> subcapitoli) {
		super();
		this.numarulcap = numarulcap;
		this.titlu = titlu;
		this.subcapitoli = subcapitoli;
	}

	public Integer getNumarulcap() {
		return numarulcap;
	}

	public void setNumarulcap(Integer numarulcap) {
		this.numarulcap = numarulcap;
	}

	public String getTitlu() {
		return titlu;
	}

	public void setTitlu(String titlu) {
		this.titlu = titlu;
	}

	public ArrayList<Subcapitol> getSubcapitoli() {
		return subcapitoli;
	}

	public void setSubcapitoli(ArrayList<Subcapitol> subcapitoli) {
		this.subcapitoli = subcapitoli;
	}
	
	
}
