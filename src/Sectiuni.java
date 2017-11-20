import java.util.ArrayList;

public class Sectiuni implements Element {

	public String titlu;
	ArrayList<Element> elem = new ArrayList<Element>();
	
	public Sectiuni(String titlu) {
		this.titlu = titlu;
	}
	
	@Override
	public void add(Element elem) {
		elem.add(elem);
	}

	@Override
	public void remove(Element elem) {
		elem.remove(elem);
	}

	@Override
	public int getElement() {
		return elem.size();
	}

	@Override
	public void accept(VisitarePartiCarte visitors) {
		visitors.visit(this);
	}
	
	@Override
	public void print() {
		System.out.println(this.titlu);
		for(Element e : elem)
		{
			e.print();
		}
	}

}
