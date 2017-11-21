
public interface Element {
	public void add(Element elem);
	public void remove(Element elem);	
	public Element getElemente(int index);
	public void print();
	public void accept(VisitarePartiCarte visitors);
}
