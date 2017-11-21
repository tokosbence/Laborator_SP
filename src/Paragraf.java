import java.util.*;



 public class Paragraf implements Element {
	private String titlu;
	private Collection <Element> continut = new ArrayList<Element>();
	
	public Paragraf() {
		
	}

	public Paragraf(Collection<Element> continut, String titlu) {
		super();
		this.continut = continut;
		this.titlu = titlu;
	}

	public Collection<Element> getContinut() {
		return continut;
	}

	public void setContinut(Collection<Element> continut) {
		this.continut = continut;
	}

	public String getTitlu() {
		return titlu;
	}

	public void setTitlu(String titlu) {
		this.titlu = titlu;
	}
	
	@Override
	public void accept(VisitarePartiCarte visitors) {
		visitors.visit(this);
	}
	
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Titlu: " + titlu);
		System.out.println("Continut: " + continut);
	}

	@Override
	public void add(Element elem) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(Element elem) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Element getElemente(int index) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
