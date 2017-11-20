import java.util.*;

 class Tabel extends AbstractElements{
	String nume;
	
	public Tabel() {
		
	}

	public Tabel(String nume) {
		super();
		this.nume = nume;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}
	
	@Override
	public void accept(VisitarePartiCarte visitors) {
		visitors.visit(this);
	}
	
	@Override
	public void print() {
		System.out.println("Nume tabelului: " + nume);
		
	}
}
