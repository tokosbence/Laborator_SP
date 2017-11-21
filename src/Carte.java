import java.util.ArrayList;
import java.util.Collection;



public class Carte implements Element {
	
	private String titlu;
	private final Autor[] autor;
	private final Collection<Element> elemente = new ArrayList<Element>();
	 
	

	Carte(String titlu, Autor[] autor){
		this.titlu = titlu;
		this.autor = autor;
	}
	
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Titlu: " + titlu + "\n" + " autor: " + autor);
	}
	
	Autor a1 = new Autor("Ioan Slavici");

	@Override
	public void add(Element e) {
		elemente.add(e);
		
	}
	
	@Override
	public Element getElemente(int index) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void setTitlu(String titlu){
		this.titlu = titlu;
	}

	public String getTitlu() {
		return titlu;
	}

	public Autor[] getAutor() {
		return autor;
	}

	public Collection<Element> getElemente() {
		return elemente;
	}

	@Override
	public void remove(Element e) {
		// TODO Auto-generated method stub
		
	}

	
	@Override
	public void accept(VisitarePartiCarte visitors) {
		// TODO Auto-generated method stub
		visitors.visit(this);
	}



	
}
