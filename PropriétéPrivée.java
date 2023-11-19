package abstraitInterface;

public class PropriétéPrivée extends Propriété {

	private int nbPièces;
	
	public PropriétéPrivée(int id, Personne responsable, String adresse, double surface, int nbPièces) {
		super(id, responsable, adresse, surface);
		this.setNbPièces(nbPièces);
	}
	
	public int getNbPièces() {
		return nbPièces;
	}
	public void setNbPièces(int nbPièces) {
		this.nbPièces = nbPièces;
	}

	@Override
	protected double calculImpot() {
		return 50/this.getSurface()+10/this.getNbPièces();
	}

	@Override
	public String toString() {
		return super.toString() +", nbPièces=" + this.getNbPièces() +  "\n";
	}
	
	
	
	
	
	

}
