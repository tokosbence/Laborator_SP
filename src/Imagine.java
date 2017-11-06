import java.awt.Image;
import java.util.*;


 class Imagine extends AbstractElements {
	private String fileName;
	private Image data; ///imagedata
	
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
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Numele fisierul care contine imagine:" + fileName);
	}
	
}
