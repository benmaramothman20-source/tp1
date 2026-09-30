package td1ex1;

public class point {
	
	private int abs;
	private int ord;
	String mm;
	point(String c,int x,int y) {
		abs=x;
		ord=y;
		mm=c;
	}
	point(int x){
		abs=x;
		ord=2*x;
		
	}
	point (int x ,int y){
		abs=x;
		ord=y;
	}
	point(String n){
		mm=n;
		abs=0;
		ord=0;
		
	}
	void Affiche() {
		System.out.println("abs ="+abs);
		System.out.println("ord ="+ord);
		System.out.println(mm+"("+abs+","+ord+")");
	}
	void TranslHoriz(int d) {
		abs=abs+d;
	}
	void TranslVert(int l) {
		ord=ord+l;
	}
	boolean Coincide(point p) {
		return abs == p.abs && ord==p.ord;
	}
	void Translation(int x,int y) {
		abs=abs+x;
		ord=ord+y;
	}
	void setNom(String n) {
		mm=n;
		
	}
	void setAbscisse(int x) {
		abs=x;
	}
	void setOrdonnée(int y) {
		ord=y;
	}
	String getNom() {
		return mm;
	}
	int getAbscisse() {
		return abs;
	}
	int getOrdonnée() {
		return ord;
	}

}
