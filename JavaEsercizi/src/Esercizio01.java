
public class Esercizio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Esercizi Punto
		Punto p1 = new Punto(1,2);
		Punto p2 = new Punto(1,3);
		System.out.println("Il valore di x1 è: "+p1.getX());
		System.out.println("Il valore di y1 è: "+p1.getY());

		//Esercizi Segmento
		System.out.println("Il valore di x2 è: "+p2.getX());
		System.out.println("Il valore di y2 è: "+p2.getY());
		
		Segmento s1=new Segmento(p1,p2);
		
		System.out.println("La lunghezza del segmento tra i punti P1 - P2 è :"+s1.lunghezza());
		
		//Esercizi Rettangolo
		Rettangolo r1=new Rettangolo(p1,3,4);
		Rettangolo r2=new Rettangolo(p1,p2);
		Rettangolo r3=new Rettangolo();
		System.out.println("Il perimetro del Rettangolo R1 è: "+r1.Perimetro());
		System.out.println("L'area del Rettangolo R1 è: "+r1.Area());
		
		System.out.println("Il perimetro del Rettangolo R2 è: "+r2.Perimetro());
		System.out.println("L'area del Rettangolo R2 è: "+r2.Area());
		
		System.out.println("Il perimetro del Rettangolo R3 è: "+r3.Perimetro());
		System.out.println("L'area del Rettangolo R3 è: "+r3.Area());
		
		//Esercizi Quadrato
		Quadrato q1=new Quadrato(p1,2);		
		System.out.println("Il perimetro del Quadrato Q1 è: "+q1.Perimetro());
		System.out.println("L'area del Quadrato Q1 è: "+q1.Area());
		
		Figure[] Disegno= new Figure[1000];
		Disegno[0]=new Rettangolo(p1,3,4);
		Disegno[1]=new Rettangolo(p1,0,4);
		Disegno[2]=new Rettangolo(p1,7,4);
		Disegno[3]=new Quadrato(p1,3);
		Disegno[4]=new Quadrato(p1,4);
		
		double totPerimetro=0;
		int numeroFigure=5;
		for(int i=0; i<numeroFigure;i++)
			totPerimetro+=Disegno[i].Perimetro();
		
		System.out.println("Il perimetro totale delle "+numeroFigure+" è: "+totPerimetro);
		
				
			
		
	}

}
