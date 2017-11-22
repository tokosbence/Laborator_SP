import java.util.*;

 public class Tabel implements Element{
	 private String nume;
	 private Collection<Element> elemente = new ArrayList<Element>();
	 
	public Tabel() {
		
	}

	public Tabel(String nume) {
		super();
		this.nume = nume;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}
	
	@Override
	public void accept(VisitarePartiCarte visitors) {
		visitors.visit(this);
	}
	
	@Override
	public void print() {
		System.out.println("Nume tabelului: " + nume);
		
	}

	@Override
	public void add(Element elem) {
		// TODO Auto-generated method stub
		elemente.add(elem);
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
