import java.util.*;



public class Main {
	public static void main(String [ ] args) {
		System.out.print("Start");
		
		Capitol cap1 = new Capitol();
		Imagine im1 = new Imagine();
		Paragraf par1 = new Paragraf();
		Subcapitol subcap1 = new Subcapitol();
		Tabel tab1  = new Tabel();
		
		cap1.numarulcap = 5;
		cap1.titlu = "Noaptea tarziu";
		cap1.print();
		
		im1.setFileName("tmp");
		im1.print();
		
		par1.titlu = "Paragraf1";
		par1.continut ="Continut paragraf1";
		par1.print();
		
		subcap1.numarulsubcap = 4;
		subcap1.titlu = "Subcapitol1";
		subcap1.print();
		
		tab1.nume = "Tabel1";
		tab1.print();
		
	}
}
