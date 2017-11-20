
public class PartiDeCarteDisplaying implements VisitarePartiCarte{

	@Override
	public void visit(Capitol capitol) {
		System.out.println("Displaying capitol");
		
	}

	@Override
	public void visit(ImageProxy imgproxy) {
		System.out.println("Displaying imgproxy");
		
	}

	@Override
	public void visit(Imagine img) {
		System.out.println("Displaying image");
		
	}

	@Override
	public void visit(Paragraf paragraf) {
		System.out.println("Displaying paragraf");
		
	}

	@Override
	public void visit(Tabel tabel) {
		System.out.println("Displaying tabel");
		
	}

	@Override
	public void visit(Sectiuni sectiuni) {
		System.out.println("Displaying sectiuni");
		
	}

	@Override
	public void visit(Subcapitol subcapitol) {
		System.out.println("Displaying subcapitoli");
		
	}

}
