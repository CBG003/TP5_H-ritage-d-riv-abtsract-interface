package abstraitInterface;

public abstract class Propriété {
	
	private int id;
	private Personne responsable;
	private String adresse;
	private double surface;
	
	public Propriété(int id, Personne responsable, String adresse, double surface) {
		this.setId(id);;
		this.setResponsable(responsable);
		this.setAdresse(adresse);
		this.setSurface(surface);
	}
	

	@Override
	public String toString() {
		return this.getClass().getSimpleName()+": id=" + this.getId() + ", responsable=" + this.getResponsable().toString() + ", adresse=" + this.getAdresse() + ", surface=" + this.getSurface()+ ", impots :" + this.calculImpot()+ "\n";
	}

	protected abstract double calculImpot();
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Personne getResponsable() {
		return responsable;
	}

	public void setResponsable(Personne responsable) {
		this.responsable = responsable;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public double getSurface() {
		return surface;
	}

	public void setSurface(double surface) {
		this.surface = surface;
	}
	
	
	
	
}
