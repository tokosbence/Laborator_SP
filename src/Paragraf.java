import java.util.*;


 class Paragraf extends AbstractElements {
	String continut;
	String titlu;
	
	public Paragraf() {
		
	}

	public Paragraf(String continut, String titlu) {
		super();
		this.continut = continut;
		this.titlu = titlu;
	}

	public String getContinut() {
		return continut;
	}

	public void setContinut(String continut) {
		this.continut = continut;
	}

	public String getTitlu() {
		return titlu;
	}

	public void setTitlu(String titlu) {
		this.titlu = titlu;
	}
	
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Titlu: " + titlu);
		System.out.println("Continut: " + continut);
	}
	
	
}
