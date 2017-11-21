import java.util.ArrayList;
import java.util.*;

public class Subcapitol implements Element {
	 public String titlu;
	 ArrayList<Element> element = new ArrayList<Element>();
		
	 public Subcapitol(String t)
		{
			this.titlu = t;
		}

		
		public int getElemente() {
			return element.size();
		}

		public void accept(VisitarePartiCarte visitors) {
			visitors.visit(this);
		}

		@Override
		public void add(Element elem) {
			// TODO Auto-generated method stub
			element.add(elem);	
		}

		@Override
		public void remove(Element elem) {
			// TODO Auto-generated method stub
			element.remove(elem);
		}

		@Override
		public Element getElemente(int index) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void print() {
			// TODO Auto-generated method stub
			System.out.println("Titlul subcapitolului: " + titlu);
		}
		
		
	
}
