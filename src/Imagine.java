import java.awt.Image;
import java.util.*;


 public class Imagine implements Element {
	private String fileName;
	
	
	public Imagine() {
		
	}

	public Imagine(String fileName) {
		super();
		this.fileName = fileName;
		
	}
	

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
	@Override
	public void accept(VisitarePartiCarte visitors) {
		visitors.visit(this);
	}

	@Override
	public void print() {
		System.out.println("Numele fisierul care contine imagine:" + fileName);
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
