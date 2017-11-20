import java.awt.Image;

public class ImageProxy extends AbstractElements {
	private String fileName;
	private Imagine realImage = null;
	
	
	public ImageProxy(String fileName) {
		super();
		this.fileName = fileName;
	}
	
	public void accept(VisitarePartiCarte visitors) {
		visitors.visit(this);
	}

	public void print()
	{
		if(realImage == null)
		{
			this.realImage= new Imagine(this.fileName);
		}
		
		realImage.print();
	}
}
