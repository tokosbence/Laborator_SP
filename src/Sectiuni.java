import java.util.ArrayList;
import java.util.Collection;



public class Sectiuni implements Element {

	public String titlu;
	private Collection<Element> elemente = new ArrayList<Element>();
	
	public Sectiuni(String titlu) {
		this.titlu = titlu;
	}
	
	@Override
	public void add(Element elem) {
		elemente.add(elem);
	}

	@Override
	public void remove(Element elem) {
		elemente.remove(elem);
	}


	@Override
	public void accept(VisitarePartiCarte visitors) {
		visitors.visit(this);
	}
	
	@Override
	public void print() {
		//System.out.println(this.titlu);
		System.out.println("Sectiune " + titlu);
		
		for(Element el: elemente) {
			el.print();
		}
	}

	@Override
	public Element getElemente(int index) {
		// TODO Auto-generated method stub
		return null;
	}

}
