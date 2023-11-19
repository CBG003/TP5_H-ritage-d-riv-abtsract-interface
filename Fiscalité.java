package abstraitInterface;

public class Fiscalité {
public static void main(String [] args) {
	
	Personne p1, p2, p3;
	p1 = new Personne(012345, "Ben Amara", "Chaima");
	p2 = new Personne(678901, "Ben Saleh", "Ahmed");
	p3 = new Personne(234567, "Ben arbia", "Amina");
	
	Propriété pr1,pr2,pr3,pr4,pr5;
	pr1 = new PropriétéPrivée(1,p1,"Corniche",350,4);
	pr2 = new Villa(2,p2,"Dar Chaabane", 400,6,true);
	pr3 = new Appartement(3,p2,"Hammamet",1200,8, 3); 
	pr4 = new PropriétéProfessionnelle(4,p3,"Korba", 1000, 50,true);
	pr5 = new PropriétéProfessionnelle(5,p1,"Bir Bouragba",2500, 400, false);
	
	Lotissement l = new Lotissement(10);
	
	//ajouter les propriéte aux lotissement
	l.ajouter(pr1);
	l.ajouter(pr2);
	l.ajouter(pr3);
	l.ajouter(pr4);
	l.ajouter(pr5);
	
	//affichage des proprites
	l.afficherPropriétés();
	
	//System.out.print("le nombre global des pieces :"+l.getnbPièces()+"\n");
	//qui a le moins impot
	l.moinsImpot();
	
	//supprimer proprite
	l.supprimer(pr3);
	
	//affichage des proprites
	l.afficherPropriétés();
	
	
	
	Lotissement lt= new LotissementPrivee(10);
	//ajouter les propriéte aux lotissement privee
	lt.ajouter(pr1);
	lt.ajouter(pr2);
	lt.afficherPropriétés();
	System.out.print(lt.getnbPièces());
}
	
}
