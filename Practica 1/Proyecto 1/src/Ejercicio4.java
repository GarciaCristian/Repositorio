import java.util.Scanner;


public class Ejercicio4 {
	public static void figuras(){
		System.out.println("Seleccione figura:");
		System.out.println("[C] Circulo.");
		System.out.println("[U] Cuadrado.");
		System.out.println("[T] Triangulo.");
		String a;
		double pi=Math.PI;
		Scanner s=new Scanner(System.in);
		a=s.nextLine();
		switch (a){
		case "C":
			System.out.println("Ingrese radio del circulo:" );
			int r=0;
			Scanner x=new Scanner(System.in);
			r=x.nextInt();
			System.out.println("Radio="+r);
			System.out.println("Circunferencia="+(pi*2*r));
			System.out.println("Area="+(pi*r*r));break;
		case "U":
			System.out.println("Ingrese el tamaño del lado de cuadrado:" );
			int l=0;
			Scanner x2=new Scanner(System.in);
			l=x2.nextInt();
			
			System.out.println("Perimetro="+(4*l));
			System.out.println("Area="+(l*l));break;
		case "T":
			System.out.println("Ingrese el tamaño de un lado del triangulo" );
			int t=0;
			Scanner x3=new Scanner(System.in);
			t=x3.nextInt();
			System.out.println("Altura="+(((3^1/2)/2)*t));
			System.out.println("Perimetro="+(3*t));
			System.out.println("Area="+((((3^1/2)/2)*t)*t));break;
		default:
			System.out.println("Ingrese una Opcion válida");
			
		}
	}

}
