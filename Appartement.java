package abstraitInterface;

public class Appartement extends PropriétéPrivée{
	private int numEtage;

	public Appartement(int id, Personne responsable, String adresse, double surface, int nbPièces ,int numEtage) {
		super(id, responsable, adresse, surface, nbPièces);
		this.setNumEtage(numEtage);
		
	}

	

	public int getNumEtage() {
		return numEtage;
	}

	public void setNumEtage(int numEtage) {
		this.numEtage = numEtage;
	}
	
	@Override 
	public double calculImpot() {
		return  super.calculImpot();
		
	}

	@Override
	public String toString() {
		return  super.toString()+", numEtage="  + getNumEtage()+"\n";
	}
	
	
	
}
