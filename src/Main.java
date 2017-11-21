import java.util.*;




public class Main {
	public static void main(String [ ] args) {
		System.out.print("Start");
		
		Autor a1 = new Autor("Ioan Slavici");
		Autor a2 = new Autor("Mihai Eminescu");
		Autor a3 = new Autor("Petre Ispirescu");
		
		Carte carte = new Carte("Poezii", new Autor[]{a1, a2});
		Carte carte2 = new Carte("Basme", new Autor[]{a3});
		
		carte.print();
		carte2.print();
		
		Sectiuni sec = new Sectiuni("sec1");
		carte.add(sec);
		sec.print();
		
		
	}
}
