package abstraitInterface;

public class Lotissement implements GestionPropriete {
	protected Propriété [] tabProp;
	protected int nombre = 0;
	protected int max;
	
	
	public Lotissement(int max) {
		this.tabProp = new Propriété[max];
		this.setMax(max);
	}
	
	public int getMax() {
		return max;
	}
	public void setMax(int max) {
		if(this.max < MAX_PROPRIETES) {
		this.max = max;}
	}

	@Override
	public void afficherPropriétés() {
		for(int i =0 ; i < this.nombre ; i++) {
			System.out.println(tabProp[i].toString());
		}
		
	}
	@Override
	public boolean ajouter(Propriété p) {
		boolean test = false;
		if(this.nombre < max){
			this.tabProp[nombre] = p;
			test = true;
			this.nombre++;
		}
				
		return test;
	}
	@Override
	public boolean supprimer(Propriété p) {
		boolean test = false;
		for(int i =0 ; i < this.nombre ; i++) {
			if(equals(tabProp[i],p)) {
				tabProp[i]=tabProp[i+1];
				test = true;
			}
		}
		if(test == true) {
			this.nombre--;
		}
		
		return test;
	}
	
	public boolean equals(Propriété p1,Propriété p2) {
		if(p1 != null && p2 != null && p1.getId() == p2.getId()) {
			return true;
		}
		else return false;
	}
	
	public Propriété getpropriétéByIndice (int i) {
		return this.tabProp[i];
		 }
	
	public int getnbPièces() {
		int x = 0;
		for(int i = 0;i <this.nombre ; i++) {
			if(this.tabProp[i] instanceof PropriétéPrivée) {
				x += ((PropriétéPrivée) this.tabProp[i]).getNbPièces();
			}
		}
		return x;
	}
	
	public void moinsImpot() {
		Propriété p = null;
		for(int i = 0 ; i < this.nombre ; i++) {
			if(this.tabProp[i] instanceof PropriétéPrivée) {
				if(p == null) {
					p = this.tabProp[i];
				}
				else {
					if(((PropriétéPrivée) this.tabProp[i]).calculImpot()< p.calculImpot()) {
						p = this.tabProp[i];
					}
				}
			}
			
		}
		System.out.print("la propriété privée qui paye le moins d’impôts :"+p.toString());
	}
	

	
}
