import java.awt.Image;

public class ImageProxy extends AbstractElements {
	private String fileName;
	private Image realImage = null;
	
	ImageProxy(String fileName){
		this.fileName = fileName;
	}
}
