import java.util.ArrayList;

public class Autor {
	String nume;
	ArrayList<Capitol> capitoli = new ArrayList<Capitol>();
	
	public Autor() {
		
	}
	
	public Autor(String nume, ArrayList<Capitol> capitoli) {
		super();
		this.nume = nume;
		this.capitoli = capitoli;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public ArrayList<Capitol> getCapitoli() {
		return capitoli;
	}

	public void setCapitoli(ArrayList<Capitol> capitoli) {
		this.capitoli = capitoli;
	}
	
	
}
