package ex2tp1;

public class main {
	public static void main(String[] args) {
    personne p1 = new personne();
    personne p2 = new personne("benothman", "maram", 20, "w");
    p1.affiche();
    System.out.println();
    p2.affiche();
    System.out.println();
    if (p1.sameLastName(p2)) {
        System.out.println("le meme nom");
    } else {
        System.out.println("n'ont pas le meme nom");
    }
    if (p1.getage()> p2.getage()) {
        System.out.println("p1 est plus age");
    } else if (p2.getage() > p1.getage()) {
        System.out.println("p2 est plus age");
    } else {
        System.out.println("le meme age");
    }
}
	

}
