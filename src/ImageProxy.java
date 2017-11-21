import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;



public class ImageProxy implements Element {
	private String fileName;
	private Imagine realImage = null;
	
	
	public ImageProxy(String fileName) {
		super();
		this.fileName = fileName;
	}
	
	public void accept(VisitarePartiCarte visitors) {
		visitors.visit(this);
	}

	
	public Imagine loadImagine() {
		Imagine img = new Imagine(fileName);
		try {
			BufferedImage originalImage = ImageIO.read(new File("img.png"));
			System.out.println("Imaginea " + fileName + " a fost incarcata");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

		return img;
	}
	
	public void print()
	{
		if(realImage == null)
		{
			this.realImage= new Imagine(this.fileName);
		}
		
		realImage.print();
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
