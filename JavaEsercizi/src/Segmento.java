public class Segmento {
	private Punto P1 = null;
	private Punto P2 = null;

	public Segmento(Punto from, Punto to) {
		this.P1 = from;
		this.P2 = to;
	}

	public Segmento(Punto from) {
		this(from,null);
	}
	
	public Segmento() {
		this(null,null);
	}
	
	public double lunghezza(){
		return Math.sqrt(Math.pow(P2.getX()-P1.getX(), 2)+ Math.pow(P2.getY()-P1.getY(),2));
	}

}
