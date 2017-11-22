import java.util.*;




public class Main {
	public static void main(String [ ] args) {
		System.out.print("Start");
		
		Autor a1 = new Autor("Ioan Slavici");
		Autor a2 = new Autor("Mihai Eminescu");
		Autor a3 = new Autor("Petre Ispirescu");
		
		Carte carte = new Carte("Poezii", new Autor[]{a1, a2});
		Carte carte2 = new Carte("Basme", new Autor[]{a3});
		
		//carte.print();
		carte2.print();
		
		Sectiuni sec = new Sectiuni("sec1");
		carte.add(sec);
		sec.print();
		
		Tabel tab = new Tabel("tabel1");
		carte.add(tab);
		
		Paragraf par = new Paragraf("par1");
		carte.add(par);
		
		carte.print();
		sec.print();
		
		carte.accept(new PartiDeCarteDisplaying());
		
		Builder builder = new JSONBuilder("book.json");
		builder.build();
		Element book = builder.getResult();
		book.print();
		
	}
}
