
public class Punto extends Figure {

		private int x=0;
		private int y=0;
		
		//Setter and Getter
		public int getX() {
			return x;
		}
		public void setX(int x) {
			this.x = x;
		}
		public int getY() {
			return y;
		}
		public void setY(int y) {
			this.y = y;
		}
		
		//Constructors
		public Punto(int _x,int _y){
			setX(_x);
			setY(_y);			
		}
		public Punto(int _x){
			this(_x,0);
		}

		public Punto () {
			this(0,0);
		}
		
		public double Perimetro(){
			return 0;
		}
}
