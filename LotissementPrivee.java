package abstraitInterface;

public class LotissementPrivee extends Lotissement {

    public LotissementPrivee(int capacite) {
        super(capacite);
    }

    @Override
    public boolean ajouter(Propriété p) {
        if (p instanceof PropriétéPrivée) {
            return super.ajouter(p);
        }
        return false;
    }


    @Override
    public int getnbPièces() {
        int nbPieces = 0;
        for (int i = 0; i < this.nombre; i++) {
            if (this.tabProp[i] instanceof PropriétéPrivée) {
                nbPieces += ((PropriétéPrivée) this.tabProp[i]).getNbPièces();
            }
        }
        return nbPieces;
    }
}