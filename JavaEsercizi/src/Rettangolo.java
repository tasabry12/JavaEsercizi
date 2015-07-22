
public class Rettangolo extends Figure {
	private Punto p1=null;
	private double base=0;
	private double altezza=0;
	
	//Costructors
	public Rettangolo (Punto downSx, double b, double h) {
		this.p1=downSx;
		base=b;
		altezza=h;
	}
	
	public Rettangolo (Punto downSx, Punto upDx){
		this(downSx,(upDx.getX()-downSx.getX()),(upDx.getY()-downSx.getY()));
	}
	
	public Rettangolo(){
		this(null,0,0);
	}
	
	public double Perimetro(){
		return 2*(base+altezza);
	}
	
	public double Area(){
		return (base*altezza);
	}

}
