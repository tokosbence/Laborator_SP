import java.awt.Image;
import java.util.*;


 class Imagine extends AbstractElements {
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
	
	public void accept(VisitarePartiCarte visitors) {
		visitors.visit(this);
	}

	@Override
	public void print() {
		System.out.println("Numele fisierul care contine imagine:" + fileName);
	}
	
}
