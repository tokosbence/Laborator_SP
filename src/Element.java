
public interface Element {
	public void add(Element elem);
	public void remove(Element elem);	
	public int getElement() ;
	public void print();
	public void accept(VisitarePartiCarte visitors);
}
