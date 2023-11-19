package abstraitInterface;

public class Villa extends PropriétéPrivée {

	private boolean avecPiscine;
	public Villa(int id, Personne responsable, String adresse, double surface, int nbPièces,boolean avecPiscine) {
		super(id, responsable, adresse, surface, nbPièces);
		this.setAvecPiscine(avecPiscine);
		
	}
	
	public boolean isAvecPiscine() {
		return this.avecPiscine;
	}

	public void setAvecPiscine(boolean avecPiscine) {
		this.avecPiscine = avecPiscine;
	}

	@Override
	public String toString() {
		return super.toString() +", avecPiscine=" + this.isAvecPiscine()+"\n";
	}
	
	@Override 
	public double calculImpot() {
		double x = super.calculImpot();
		if(this.avecPiscine) {
			x +=200;
		}
		return x;
		
	}
	
	
}
