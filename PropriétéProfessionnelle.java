package abstraitInterface;

public class PropriétéProfessionnelle extends Propriété {

	private int nbEmployés;
	private boolean estEtatique;
	
	public PropriétéProfessionnelle(int id, Personne responsable, String adresse, double surface, int nbEmployés,boolean estEtatique ) {
		super(id, responsable, adresse, surface);
		this.setNbEmployés(nbEmployés);
		this.setEstEtatique(estEtatique);
		
	}
	public int getNbEmployés() {
		return nbEmployés;
	}
	public void setNbEmployés(int nbEmployés) {
		this.nbEmployés = nbEmployés;
	}
	public boolean isEstEtatique() {
		return estEtatique;
	}
	public void setEstEtatique(boolean estEtatique) {
		this.estEtatique = estEtatique;
	}
	@Override
	protected double calculImpot() {
		double x = 0;
		if(!this.estEtatique) {
			x = 100/this.getSurface()+30/this.nbEmployés;
		}
		return x;
	}
	@Override
	public String toString() {
		return super.toString() +" ,nbEmployés=" + this.getNbEmployés() + ", estEtatique=" + this.isEstEtatique()+"\n";
	}
	


}
