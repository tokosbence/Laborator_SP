import java.util.ArrayList;
import java.util.*;

 class Subcapitol extends AbstractElements {
	 public String titlu;
	 ArrayList<Element> element = new ArrayList<Element>();
		
	 public Subcapitol(String t)
		{
			this.titlu = t;
		}

		public void addElement(Element e){
			element.add(e);		
		}
		public void removeElement(Element e) {		
			element.remove(e);
		}
		public int getElemente() {
			return element.size();
		}

		public void accept(VisitarePartiCarte visitors) {
			visitors.visit(this);
		}
		
		public void print() {
			System.out.println(this.titlu);
			for(Element e : element)
			{
				e.print();
			}
		}
	
}
