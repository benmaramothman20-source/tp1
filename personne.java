package ex2tp1;

public class personne {
	private String nom;
	private String prenom;
	private int age;
	private String sexe;
	public personne(){
	        nom = "Ben ALI";
	        prenom = "Med";
	        age = 30;
	        sexe = "M";
	}
	public personne(String nom,String prenom ,int age ,String sexe){
		this.nom=nom;
		this.prenom=prenom;
		this.age=age;
		this.sexe=sexe;
		
	}
	public String getnom() {
	        return nom;
	    }
	public String getprenom() {
        return prenom;
    }
	public int getage() {
        return age ;
    }
	public String getsexe() {
        return sexe;
    }
	public void affiche(){
	        System.out.println("Nom" + nom);
	        System.out.println("Prénom" + prenom);
	        System.out.println("Age" + age);
	        System.out.println("Sexe" + sexe);
	    }
	public boolean sameLastName(personne p) {
		return nom.equals(p.nom);
	}
	
	
	 
	

}
